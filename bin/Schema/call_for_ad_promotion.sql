CREATE DATABASE  IF NOT EXISTS `call_for_ad` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `call_for_ad`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: call_for_ad
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
-- Table structure for table `promotion`
--

DROP TABLE IF EXISTS `promotion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promotion` (
  `promotionId` int NOT NULL AUTO_INCREMENT,
  `adId` int DEFAULT NULL,
  `promotionCategory` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `cardNumber` varchar(45) DEFAULT NULL,
  `expireDate` varchar(45) DEFAULT NULL,
  `cvv` varchar(45) DEFAULT NULL,
  `cardHolderName` varchar(45) DEFAULT NULL,
  `mfs` varchar(45) DEFAULT NULL,
  `mfsNumber` varchar(45) DEFAULT NULL,
  `tsNumber` varchar(45) DEFAULT NULL,
  `subTotal` double DEFAULT NULL,
  `vat` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`promotionId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promotion`
--

LOCK TABLES `promotion` WRITE;
/*!40000 ALTER TABLE `promotion` DISABLE KEYS */;
INSERT INTO `promotion` VALUES (3,5,'Platinum','hum@gmail.com',NULL,NULL,NULL,'Rejwan Sharif','Nagad','01304229984','jsd73j72hdu3',1050,73.5,1123.5),(4,13,'Platinum','rejwansharif@hotmail.com','248524723','11/25','152','Rejwan Sharif','Bkash',NULL,NULL,1050,73.5,1123.5),(5,8,'Gold','mohammedrejwan@yahoo.com',NULL,NULL,NULL,'Rejwan Sharif','Bkash','01304229984','jsd73j72hdu3',750,52.50000000000001,802.5),(6,7,'Platinum','mohammedrejwan8@gmail.com',NULL,NULL,NULL,'Rejwan Sharif','Nagad','01304229984','jsd73j72hdu3',1050,73.5,1123.5);
/*!40000 ALTER TABLE `promotion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-02 11:45:20
