CREATE DATABASE  IF NOT EXISTS `urnaeletronica` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `urnaeletronica`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: urnaeletronica
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `eleitor`
--

DROP TABLE IF EXISTS `eleitor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `eleitor` (
  `idEleitor` int NOT NULL AUTO_INCREMENT,
  `titulo` varchar(18) NOT NULL,
  `nome` varchar(145) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `dataNascimento` datetime NOT NULL,
  `rg` varchar(8) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `reservista` varchar(15) DEFAULT NULL,
  `situacao` varchar(45) NOT NULL,
  `idEndereco` int NOT NULL,
  `idEnderecoEleitoral` varchar(45) NOT NULL,
  `dataCadastro` datetime NOT NULL,
  PRIMARY KEY (`idEleitor`,`titulo`),
  UNIQUE KEY `titulo_UNIQUE` (`titulo`),
  UNIQUE KEY `cpf_UNIQUE` (`cpf`),
  UNIQUE KEY `rg_UNIQUE` (`rg`),
  UNIQUE KEY `reservista_UNIQUE` (`reservista`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `endereco` (
  `idEndereco` int NOT NULL AUTO_INCREMENT,
  `logradouro` varchar(255) NOT NULL,
  `numero` varchar(15) DEFAULT NULL,
  `bairro` varchar(145) NOT NULL,
  `municipio` varchar(145) NOT NULL,
  `estado` varchar(145) NOT NULL,
  `pais` varchar(45) NOT NULL,
  `cep` varchar(8) NOT NULL,
  `pontoReferencia` varchar(145) DEFAULT NULL,
  PRIMARY KEY (`idEndereco`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dump completed on 2022-03-14  0:28:07


--
-- Table structure for table `enderecoeleitoral`
--

DROP TABLE IF EXISTS `enderecoeleitoral`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enderecoeleitoral` (
  `idEnderecoEleitoral` int NOT NULL AUTO_INCREMENT,
  `zona` varchar(10) NOT NULL,
  `secao` varchar(10) NOT NULL,
  `situacao` varchar(15) NOT NULL,
  `idEndereco` int NOT NULL,
  PRIMARY KEY (`idEnderecoEleitoral`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
