-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-03-2019 a las 02:57:02
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `transporte`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `camion`
--

CREATE TABLE `camion` (
  `id` varchar(150) COLLATE utf8_bin NOT NULL,
  `origen` varchar(100) COLLATE utf8_bin NOT NULL,
  `destino` varchar(100) COLLATE utf8_bin NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `num_asientos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `camion`
--

INSERT INTO `camion` (`id`, `origen`, `destino`, `fecha`, `hora`, `num_asientos`) VALUES
('PueblaMexico', 'Puebla', 'Mexico', '2019-03-29', '10:15:00', 30),
('MexicoPuebla', 'Mexico', 'Puebla', '2019-03-29', '15:20:00', 30),
('VeracruzXalapa', 'Veracruz', 'Xalapa', '2019-03-29', '12:30:00', 30),
('MexicoPuebla', 'Mexico', 'Puebla', '2019-03-29', '15:20:00', 30),
('VeracruzXalapa', 'Veracruz', 'Xalapa', '2019-03-29', '12:30:00', 30),
('XalapaVeracruz', 'Xalapa', 'Veracruz', '2019-03-29', '08:40:00', 30),
('XalapaVeracruz', 'Xalapa', 'Veracruz', '2019-03-29', '08:40:00', 30);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
