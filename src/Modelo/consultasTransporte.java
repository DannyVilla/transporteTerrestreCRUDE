/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.CamionT; 




/**
 *
 * @author Danny
 */
public class consultasTransporte extends Conexion {
    
    public boolean registrar(CamionT cami){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO camion (id, origen, destino, fecha, hora, num_asientos) VALUES (?,?,?,?,?,?)";
        
        try{
            ps =  con.prepareStatement(sql);
            ps.setString(1, cami.getId());
            ps.setString(2,cami.getOrigen() );
            ps.setString(3, cami.getDestino());
            ps.setString(4, cami.getFecha() );
            ps.setString(5, cami.getHora() );
            ps.setInt(6, cami.getNum_asientos());
            ps.execute();
            return true;
            
        } catch(SQLException e){
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            } catch(SQLException e){
                System.err.println(e);
            }
        }
        
    }
    
    public boolean modificar(CamionT cami){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE camion SET origen=?, destino=?, fecha=?, hora=?, num_asientos=? WHERE id=?" ;
        
        try{
            ps =  con.prepareStatement(sql);
            
            ps.setString(1,cami.getOrigen() );
            ps.setString(2, cami.getDestino());
            ps.setString(3, cami.getFecha() );
            ps.setString(4, cami.getHora() );
            ps.setInt(5, cami.getNum_asientos());
            ps.setString(6, cami.getId());
            
            ps.execute();
            return true;
            
        } catch(SQLException e){
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            } catch(SQLException e){
                System.err.println(e);
            }
        }
        
    }
        
    public boolean eliminar(CamionT cami){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "DELETE FROM camion WHERE id=? " ;
        
        try{
            ps =  con.prepareStatement(sql);
            ps.setString(1, cami.getId());          
            ps.execute();
            return true;
            
        } catch(SQLException e){
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            } catch(SQLException e){
                System.err.println(e);
            }
        }
        
    }
    
    public boolean buscar(CamionT cami){
        
        PreparedStatement ps = null;       
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT * FROM camion WHERE id=? " ;
        
        try{
            ps =  con.prepareStatement(sql);
            ps.setString(1, cami.getId());
            rs = ps.executeQuery();
            
            if(rs.next()){
                cami.setId(rs.getString("ID"));
                cami.setOrigen(rs.getString("Origen"));
                cami.setDestino(rs.getString("Destino"));
                cami.setFecha(rs.getString("Fecha"));
                cami.setHora(rs.getString("Hora"));
                cami.setNum_asientos(Integer.parseInt(rs.getString("Num_Asientos")));
                
                return true;
            }         
            
            return false;
            
        } catch(SQLException e){
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            } catch(SQLException e){
                System.err.println(e);
            }
        }
        
    }
}