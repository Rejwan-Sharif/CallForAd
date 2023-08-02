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
-- Table structure for table `newspaper`
--

DROP TABLE IF EXISTS `newspaper`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `newspaper` (
  `id` int NOT NULL AUTO_INCREMENT,
  `newspaper_name` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `organization_name` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `publish_date` date DEFAULT NULL,
  `ad_title` varchar(45) DEFAULT NULL,
  `ad_description` varchar(5000) DEFAULT NULL,
  `document` varchar(45) DEFAULT NULL,
  `publish_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `newspaper`
--

LOCK TABLES `newspaper` WRITE;
/*!40000 ALTER TABLE `newspaper` DISABLE KEYS */;
INSERT INTO `newspaper` VALUES (2,'Kaler Kontho','Rejwan Sharif','Back Volley','01304229984','mohammedrejwan@yahoo.com','2023-07-26','PURCHASE','\nAffidavit of [Your Name], [Your Address], [City]. I affirm the accuracy of article \"[Article Title]\" published on [Publication Date] in [Newspaper Name]. Verified sources support its truthfulness. No defamatory content or IP infringements. I stand by its credibility and willingly testify to its accuracy. Signed on [Day], [Month], [Year]. [Your Name]',NULL,'Pending'),(3,'Ittefaq','Hasan Mahfuz','HUM','0172849754','hum@gmail.com','2023-07-28','MATRIMONIAL','\"Seeking a life partner: Bangladeshi, 30, Male, software engineer, non-smoker, Religious seeks educated, caring bride. Contact: 0172849754.',NULL,'Pending'),(4,'Bangladesh Pratidin','Hasan Mahfuz','HUM','01304229904','admin@gmail.com','2023-07-27','TUTION','tution media . we provide  any subject  tutor.',NULL,'Pending'),(5,'Ittefaq','Hasan Mahfuz',NULL,'01304229984','hum@gmail.com','2023-07-28',NULL,'পাত্রী চাই: ঢাকায় স্থায়ী সচ্ছল পরিবারের শিক্ষিতা সুন্দরী লম্বা ধার্মিক পাত্রী চাই। ছেলে উত্তরায় বসবাসরত, হ্যান্ডসাম ইংলিশে মাস্টার্স (৩৪+) Renown Group of Company তে অফিসার। যোগাযোগ: পিতা-০১৭XXXXXXXX।',NULL,'Pending');
/*!40000 ALTER TABLE `newspaper` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-02 11:45:21
