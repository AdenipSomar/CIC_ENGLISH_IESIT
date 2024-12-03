-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cic_english_iesit
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alumno_grupo_tbl`
--

DROP TABLE IF EXISTS `alumno_grupo_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumno_grupo_tbl` (
  `idAlumnoGrupo` int NOT NULL AUTO_INCREMENT,
  `matricula` char(8) NOT NULL,
  `cveGrupo` varchar(8) NOT NULL,
  PRIMARY KEY (`idAlumnoGrupo`),
  UNIQUE KEY `matricula` (`matricula`,`cveGrupo`),
  KEY `cveGrupo` (`cveGrupo`),
  CONSTRAINT `alumno_grupo_tbl_ibfk_1` FOREIGN KEY (`matricula`) REFERENCES `alumno_tbl` (`matricula`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `alumno_grupo_tbl_ibfk_2` FOREIGN KEY (`cveGrupo`) REFERENCES `grupo_tbl` (`cveGrupo`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno_grupo_tbl`
--

LOCK TABLES `alumno_grupo_tbl` WRITE;
/*!40000 ALTER TABLE `alumno_grupo_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `alumno_grupo_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `alumno_tbl`
--

DROP TABLE IF EXISTS `alumno_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumno_tbl` (
  `matricula` char(8) NOT NULL,
  `nombreAlumno` varchar(40) NOT NULL,
  `apePaternoAlumno` varchar(40) NOT NULL,
  `apeMaternoAlumno` varchar(40) DEFAULT NULL,
  `generacion` varchar(20) DEFAULT NULL,
  `semestre` int DEFAULT NULL,
  `estatusConstancia` int DEFAULT NULL,
  `observaciones` varchar(100) DEFAULT NULL,
  `cveGrupo` varchar(8) DEFAULT NULL,
  `rvoe` char(13) NOT NULL,
  PRIMARY KEY (`matricula`),
  KEY `cveGrupo` (`cveGrupo`),
  KEY `rvoe` (`rvoe`),
  CONSTRAINT `alumno_tbl_ibfk_1` FOREIGN KEY (`cveGrupo`) REFERENCES `grupo_tbl` (`cveGrupo`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `alumno_tbl_ibfk_2` FOREIGN KEY (`rvoe`) REFERENCES `licenciatura_tbl` (`rvoe`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno_tbl`
--

LOCK TABLES `alumno_tbl` WRITE;
/*!40000 ALTER TABLE `alumno_tbl` DISABLE KEYS */;
INSERT INTO `alumno_tbl` VALUES ('2003B002','JESUS','RAMOS','PINEDA','2020-2024',1,0,NULL,'BA2425-1','1220114554566');
/*!40000 ALTER TABLE `alumno_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `calificaciones_tbl`
--

DROP TABLE IF EXISTS `calificaciones_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `calificaciones_tbl` (
  `cveCalificaciones` int NOT NULL AUTO_INCREMENT,
  `nivelCursado` varchar(50) NOT NULL,
  `primerParcial` tinyint unsigned DEFAULT NULL,
  `segundoParcial` tinyint unsigned DEFAULT NULL,
  `tercerParcial` tinyint unsigned DEFAULT NULL,
  `examenFinal` tinyint unsigned DEFAULT NULL,
  `matricula` char(8) NOT NULL,
  PRIMARY KEY (`cveCalificaciones`),
  UNIQUE KEY `matricula` (`matricula`,`nivelCursado`),
  CONSTRAINT `calificaciones_tbl_ibfk_1` FOREIGN KEY (`matricula`) REFERENCES `alumno_tbl` (`matricula`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calificaciones_tbl`
--

LOCK TABLES `calificaciones_tbl` WRITE;
/*!40000 ALTER TABLE `calificaciones_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `calificaciones_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `docente_grupo_tbl`
--

DROP TABLE IF EXISTS `docente_grupo_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `docente_grupo_tbl` (
  `idDocenteGrupo` int NOT NULL AUTO_INCREMENT,
  `rfcDocente` char(13) NOT NULL,
  `cveGrupo` varchar(8) NOT NULL,
  PRIMARY KEY (`idDocenteGrupo`),
  UNIQUE KEY `rfcDocente` (`rfcDocente`,`cveGrupo`),
  KEY `cveGrupo` (`cveGrupo`),
  CONSTRAINT `docente_grupo_tbl_ibfk_1` FOREIGN KEY (`rfcDocente`) REFERENCES `docente_tbl` (`rfcDocente`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `docente_grupo_tbl_ibfk_2` FOREIGN KEY (`cveGrupo`) REFERENCES `grupo_tbl` (`cveGrupo`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `docente_grupo_tbl`
--

LOCK TABLES `docente_grupo_tbl` WRITE;
/*!40000 ALTER TABLE `docente_grupo_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `docente_grupo_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `docente_tbl`
--

DROP TABLE IF EXISTS `docente_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `docente_tbl` (
  `rfcDocente` char(13) NOT NULL,
  `nombreDocente` varchar(50) NOT NULL,
  `apePaternoDocente` varchar(50) NOT NULL,
  `apeMaternoDocente` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefono` char(10) DEFAULT NULL,
  `fechaInicio` varchar(15) DEFAULT NULL,
  `estado` bit(1) DEFAULT b'1',
  PRIMARY KEY (`rfcDocente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `docente_tbl`
--

LOCK TABLES `docente_tbl` WRITE;
/*!40000 ALTER TABLE `docente_tbl` DISABLE KEYS */;
INSERT INTO `docente_tbl` VALUES ('RAPJ020414M07','JESUS','RAMOS','PINEDA','sorteoe@gmail.com','9711581169','2024-11-13',_binary '');
/*!40000 ALTER TABLE `docente_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `extra_ordinarios_tbl`
--

DROP TABLE IF EXISTS `extra_ordinarios_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `extra_ordinarios_tbl` (
  `cveExtra` int NOT NULL AUTO_INCREMENT,
  `cveCalificaciones` int NOT NULL,
  `numeroExtra` tinyint unsigned NOT NULL,
  `fechaExtra` varchar(15) DEFAULT NULL,
  `calificacionExtra` tinyint unsigned DEFAULT NULL,
  PRIMARY KEY (`cveExtra`),
  UNIQUE KEY `cveCalificaciones` (`cveCalificaciones`,`numeroExtra`),
  CONSTRAINT `extra_ordinarios_tbl_ibfk_1` FOREIGN KEY (`cveCalificaciones`) REFERENCES `calificaciones_tbl` (`cveCalificaciones`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `extra_ordinarios_tbl`
--

LOCK TABLES `extra_ordinarios_tbl` WRITE;
/*!40000 ALTER TABLE `extra_ordinarios_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `extra_ordinarios_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupo_tbl`
--

DROP TABLE IF EXISTS `grupo_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grupo_tbl` (
  `cveGrupo` varchar(8) NOT NULL,
  `nombreGrupo` varchar(30) NOT NULL,
  `nivelIngles` varchar(60) NOT NULL,
  `diaClase1` varchar(60) DEFAULT NULL,
  `horarioClase1` varchar(40) DEFAULT NULL,
  `salonClase1` varchar(25) DEFAULT NULL,
  `diaClase2` varchar(60) DEFAULT NULL,
  `horarioClase2` varchar(40) DEFAULT NULL,
  `salonClase2` varchar(25) DEFAULT NULL,
  `cicloEscolar` varchar(35) DEFAULT NULL,
  `maxEstudiantes` int DEFAULT NULL,
  PRIMARY KEY (`cveGrupo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupo_tbl`
--

LOCK TABLES `grupo_tbl` WRITE;
/*!40000 ALTER TABLE `grupo_tbl` DISABLE KEYS */;
INSERT INTO `grupo_tbl` VALUES ('BA2425-1','BEGINNERS A LUNES','BEGINNERS A','LUNES','7:00 - 7:50','','.','. - .','','2024-2025',40);
/*!40000 ALTER TABLE `grupo_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `licenciatura_tbl`
--

DROP TABLE IF EXISTS `licenciatura_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `licenciatura_tbl` (
  `rvoe` char(13) NOT NULL,
  `nombreLicenciatura` varchar(70) NOT NULL,
  `abreviacion` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`rvoe`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `licenciatura_tbl`
--

LOCK TABLES `licenciatura_tbl` WRITE;
/*!40000 ALTER TABLE `licenciatura_tbl` DISABLE KEYS */;
INSERT INTO `licenciatura_tbl` VALUES ('1220114554566','INGENIERÍA EN SISTEMAS COMPUTACIONALES','ISC');
/*!40000 ALTER TABLE `licenciatura_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomina_docente_tbl`
--

DROP TABLE IF EXISTS `nomina_docente_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nomina_docente_tbl` (
  `cveNominaIesit` int NOT NULL,
  `rfcDocente` char(13) NOT NULL,
  `horasTrabajadas` int DEFAULT NULL,
  `fechaTrabajada` varchar(20) DEFAULT NULL,
  `observaciones` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`cveNominaIesit`),
  KEY `rfcDocente` (`rfcDocente`),
  CONSTRAINT `nomina_docente_tbl_ibfk_1` FOREIGN KEY (`rfcDocente`) REFERENCES `docente_tbl` (`rfcDocente`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomina_docente_tbl`
--

LOCK TABLES `nomina_docente_tbl` WRITE;
/*!40000 ALTER TABLE `nomina_docente_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `nomina_docente_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_tbl`
--

DROP TABLE IF EXISTS `usuario_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario_tbl` (
  `cveUsuario` int NOT NULL AUTO_INCREMENT,
  `nombreUsuario` varchar(40) NOT NULL,
  `pass` varchar(20) NOT NULL,
  PRIMARY KEY (`cveUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_tbl`
--

LOCK TABLES `usuario_tbl` WRITE;
/*!40000 ALTER TABLE `usuario_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'cic_english_iesit'
--

--
-- Dumping routines for database 'cic_english_iesit'
--
/*!50003 DROP PROCEDURE IF EXISTS `OBTENER_ALUMNO` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `OBTENER_ALUMNO`(
)
BEGIN
SELECT 
    a.matricula,
    CONCAT(a.nombreAlumno, ' ', a.apePaternoAlumno, ' ',a.apeMaternoAlumno) AS nombreCompleto,
    l.abreviacion as licenciatura
FROM 
    alumno_tbl a
INNER JOIN 
    licenciatura_tbl l
ON 
    a.rvoe = l.rvoe;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `OBTENER_DOCENTE` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `OBTENER_DOCENTE`()
BEGIN
SELECT concat(nombreDocente," ",apePaternoDocente," ",apeMaternoDocente)as nombreCompleto, rfcDocente from docente_tbl;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-03 14:48:04
