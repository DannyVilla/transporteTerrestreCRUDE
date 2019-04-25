/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDE;

import Controlador.CtrlCamion2;
import Modelo.CamionT;
import Modelo.consultasTransporte;
import Vista.frmCamion;


/**
 *
 * @author Danny
 */
public class mainCRUDE {
    
    
    public static void main(String[] args){
        CamionT mod = new CamionT();
        consultasTransporte modC = new consultasTransporte();
        frmCamion frm = new frmCamion();   
        
        CtrlCamion2 ctrl  = new CtrlCamion2(mod,modC,frm);
        ctrl.iniciar();
        frm.setVisible(true);
    }
}
