-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 14-11-2021 a las 22:52:26
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `parqueadero`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registrodia`
--

CREATE TABLE `registrodia` (
  `nombre` varchar(20) NOT NULL,
  `placa` varchar(7) NOT NULL,
  `horaentrada` time NOT NULL,
  `horasalida` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `registrodia`
--

INSERT INTO `registrodia` (`nombre`, `placa`, `horaentrada`, `horasalida`) VALUES
('Paula', 'mnb235', '12:15:40', '00:00:00'),
('Santiago', 'mpx404', '20:43:12', '00:00:00'),
('Laura', 'pmc231', '09:14:15', '00:00:00');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `registrodia`
--
ALTER TABLE `registrodia`
  ADD PRIMARY KEY (`placa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
