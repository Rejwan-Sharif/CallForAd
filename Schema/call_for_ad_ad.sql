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
-- Table structure for table `ad`
--

DROP TABLE IF EXISTS `ad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ad` (
  `ad_id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(200) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `height` double DEFAULT NULL,
  `width` double DEFAULT NULL,
  `area` varchar(45) DEFAULT NULL,
  `purpose` varchar(45) DEFAULT NULL,
  `facing` varchar(45) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `title_image` varchar(45) DEFAULT NULL,
  `second_image` varchar(45) DEFAULT NULL,
  `third_image` varchar(45) DEFAULT NULL,
  `fourth_image` varchar(45) DEFAULT NULL,
  `final_image` varchar(45) DEFAULT NULL,
  `other_details` varchar(1000) DEFAULT NULL,
  `ad_status` varchar(45) DEFAULT NULL,
  `vendor_id` int DEFAULT NULL,
  `promotionStatus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ad_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ad`
--

LOCK TABLES `ad` WRITE;
/*!40000 ALTER TABLE `ad` DISABLE KEYS */;
INSERT INTO `ad` VALUES (5,'Billboard available in Uttara','jashim Uddin','Billboard','Available',36,45,'Dhaka','Sell','Jashimuddin',7000,'billboard.jpg','1.jpg','2.jpg','3.jpg','4.jpg','This billboard is available in mainroad in uttara','Approved',1,'Promoted'),(6,'Billboard available in mohakhali','Shahinbag','Billboard','Available',36,45,'Dhaka','Sell','Mohakhali to jahangirgate',7000,'3.jpg','2.jpg','4.jpg','1.jpg','billboard.jpg','Billboard infornt og ayesha memorial hospital','Approved',2,'Not Promoted'),(7,'Digital Billboard Available','Sahabag','Digital Billboard','Available',21,38,'Dhaka','Cntructual','Sahbag Mor',25000,'2.jpg','1.jpg','2.jpg','4.jpg','5.jpg','Call For more Details','Approved',7,'Not Promoted'),(8,'Attractive 3Slide Billboard available for Ad','Mirpur','Billboard','Available',15,24,'Dhaka','Cntructual','Mirpur11 main road',7000,'4.jpg','2.jpg','3.jpg','1.jpg','5.jpg','This billboard AvailAble  in attractive place','Approved',7,'Promoted'),(11,'Transport Advertisement Available','Dhaka','Transport Advertisement','Available',21,45,'Dhaka','Rent','Dhaka City',15000,'7.jpg','8.jpg','9.jpg','6.jpg','5.jpg','Call For More Details','Approved',9,'Not Promoted'),(13,'Transport Ad Available','Dhaka','Transport Advertisement','Available',21,23,'Dhaka','Rent','Dhaka',7000,'9.jpg','8.jpg','6.jpg','9.jpg','7.jpg','Call  For More  Details','Approved',9,'Promoted'),(14,'Digital TV Available  for rent','Jamuna Future  park','Digital Billboard','Available',36,45,'Dhaka','Rent','Front Side of Jamuna Future park',2000,'4.jpg','1.jpg','3.jpg','5.jpg','1.jpg','Call For More  Details','Approved',10,'Not Promoted');
/*!40000 ALTER TABLE `ad` ENABLE KEYS */;
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
