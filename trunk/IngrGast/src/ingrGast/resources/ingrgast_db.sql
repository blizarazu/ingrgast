DROP DATABASE IF EXISTS `ingrgast_db`;
CREATE DATABASE `ingrgast_db` /*!40100 DEFAULT CHARACTER SET latin1 */;

DROP TABLE IF EXISTS `ingrgast_db`.`conceptos`;
CREATE TABLE  `ingrgast_db`.`conceptos` (
  `ID` int(10) unsigned NOT NULL auto_increment,
  `Motivo` varchar(50) NOT NULL,
  `Proveedor` varchar(50) NOT NULL,
  `Receptor` varchar(50) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `ingrgast_db`.`grupos`;
CREATE TABLE  `ingrgast_db`.`grupos` (
  `ID` int(10) unsigned NOT NULL auto_increment,
  `Nombre` varchar(50) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `ingrgast_db`.`asientoscontables`;
CREATE TABLE  `ingrgast_db`.`asientoscontables` (
  `ID` int(10) unsigned NOT NULL auto_increment,
  `Concepto_ID` int(10) unsigned NOT NULL,
  `Grupo_ID` int(10) unsigned NOT NULL,
  `Importe` double NOT NULL,
  `Fecha` date NOT NULL,
  `Fecha_creacion` datetime NOT NULL,
  PRIMARY KEY  (`ID`),
  KEY `FK_asientocontable_1` (`Concepto_ID`),
  KEY `FK_asientocontable_2` (`Grupo_ID`),
  CONSTRAINT `FK_asientocontable_1` FOREIGN KEY (`Concepto_ID`) REFERENCES `conceptos` (`ID`),
  CONSTRAINT `FK_asientocontable_2` FOREIGN KEY (`Grupo_ID`) REFERENCES `grupos` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;