CREATE DATABASE  IF NOT EXISTS `activity_manager` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `activity_manager`;
-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: activity_manager
-- ------------------------------------------------------
-- Server version	5.6.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `action`
--

DROP TABLE IF EXISTS `action`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `action` (
  `action_id` int(11) NOT NULL AUTO_INCREMENT,
  `action_name` varchar(45) NOT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`action_id`),
  UNIQUE KEY `action_id_UNIQUE` (`action_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `action`
--

LOCK TABLES `action` WRITE;
/*!40000 ALTER TABLE `action` DISABLE KEYS */;
INSERT INTO `action` VALUES (1,'Like','2017-02-16 19:08:17'),(2,'Share','2017-02-16 19:08:17'),(3,'Comment','2017-02-16 19:08:17');
/*!40000 ALTER TABLE `action` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `activity`
--

DROP TABLE IF EXISTS `activity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `activity` (
  `activity_id` int(11) NOT NULL AUTO_INCREMENT,
  `photo_id` int(11) DEFAULT NULL,
  `track_id` int(11) DEFAULT NULL,
  `action_id` int(11) DEFAULT NULL,
  `action_date` datetime DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`activity_id`),
  UNIQUE KEY `actibity_id_UNIQUE` (`activity_id`),
  KEY `action_id_idx` (`action_id`),
  KEY `user_id_idx` (`user_id`),
  KEY `photo_id_idx` (`photo_id`),
  KEY `track_id_idx` (`track_id`),
  CONSTRAINT `action_id` FOREIGN KEY (`action_id`) REFERENCES `action` (`action_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `photo_id` FOREIGN KEY (`photo_id`) REFERENCES `photo` (`photo_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `track_id` FOREIGN KEY (`track_id`) REFERENCES `track` (`track_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=200 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `activity`
--

LOCK TABLES `activity` WRITE;
/*!40000 ALTER TABLE `activity` DISABLE KEYS */;
INSERT INTO `activity` VALUES (160,31,NULL,1,'2017-02-10 10:20:10',7,'2017-02-16 20:28:08'),(161,33,NULL,1,'2017-02-12 10:10:10',1,'2017-02-16 20:28:08'),(162,34,NULL,1,'2017-02-14 14:10:10',1,'2017-02-16 20:28:08'),(163,34,NULL,1,'2017-02-14 15:10:10',7,'2017-02-16 20:28:08'),(164,38,NULL,1,'2017-02-11 10:10:10',6,'2017-02-16 20:28:08'),(165,40,NULL,1,'2017-02-12 10:10:10',7,'2017-02-16 20:28:08'),(166,31,NULL,1,'2017-01-16 09:05:51',2,'2017-02-16 20:28:08'),(167,31,NULL,1,'2017-01-16 09:06:51',3,'2017-02-16 20:28:08'),(168,31,NULL,3,'2017-01-16 10:04:51',2,'2017-02-16 20:28:08'),(169,31,NULL,3,'2017-01-16 10:34:51',3,'2017-02-16 20:28:08'),(170,31,NULL,1,'2017-01-17 10:54:51',4,'2017-02-16 20:28:08'),(171,31,NULL,1,'2017-01-18 09:04:51',5,'2017-02-16 20:28:08'),(172,31,NULL,2,'2017-01-19 09:04:51',6,'2017-02-16 20:28:08'),(173,33,NULL,1,'2017-02-12 10:50:10',2,'2017-02-16 20:28:08'),(174,35,NULL,1,'2017-02-12 14:29:01',2,'2017-02-16 20:28:08'),(175,40,NULL,2,'2017-02-10 11:26:51',5,'2017-02-16 20:28:08'),(176,31,NULL,2,'2017-01-19 12:04:51',6,'2017-02-16 20:28:08'),(177,34,NULL,3,'2017-02-15 15:10:10',1,'2017-02-16 20:28:08'),(178,31,NULL,3,'2017-01-19 13:04:51',6,'2017-02-16 20:28:08'),(179,36,NULL,1,'2017-02-13 14:09:01',7,'2017-02-16 20:28:08'),(180,36,NULL,1,'2017-02-13 14:39:01',2,'2017-02-16 20:28:08'),(181,44,NULL,2,'2017-01-27 10:44:55',5,'2017-02-16 20:28:08'),(182,42,NULL,1,'2017-02-10 11:16:51',1,'2017-02-16 20:28:08'),(183,42,NULL,1,'2017-02-10 11:56:51',2,'2017-02-16 20:28:08'),(184,NULL,1,1,'2017-01-16 09:34:51',1,'2017-02-16 20:28:08'),(185,NULL,2,1,'2017-02-13 14:00:00',1,'2017-02-16 20:28:08'),(186,NULL,5,1,'2017-02-12 12:15:10',1,'2017-02-16 20:28:08'),(187,NULL,5,1,'2017-02-12 12:22:12',2,'2017-02-16 20:28:08'),(188,NULL,5,1,'2017-02-12 12:32:12',3,'2017-02-16 20:28:08'),(189,NULL,5,2,'2017-02-12 12:53:12',1,'2017-02-16 20:28:08'),(190,NULL,5,3,'2017-02-12 12:55:12',1,'2017-02-16 20:28:08'),(191,NULL,5,3,'2017-02-12 13:32:12',2,'2017-02-16 20:28:08'),(192,NULL,5,1,'2017-02-12 13:42:12',4,'2017-02-16 20:28:08'),(193,NULL,5,1,'2017-02-13 12:12:12',5,'2017-02-16 20:28:08'),(194,NULL,5,1,'2017-02-13 14:12:12',6,'2017-02-16 20:28:08'),(195,NULL,3,2,'2017-02-14 12:44:21',1,'2017-02-16 20:28:08'),(196,NULL,3,3,'2017-02-14 12:45:26',1,'2017-02-16 20:28:08'),(197,NULL,3,1,'2017-02-14 12:46:21',1,'2017-02-16 20:28:08'),(198,NULL,3,1,'2017-02-14 12:50:21',2,'2017-02-16 20:28:08'),(199,NULL,6,1,'2017-02-16 08:08:08',1,'2017-02-16 20:28:08');
/*!40000 ALTER TABLE `activity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `photo`
--

DROP TABLE IF EXISTS `photo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `photo` (
  `photo_id` int(11) NOT NULL AUTO_INCREMENT,
  `post_id` int(11) NOT NULL DEFAULT '0',
  `image` varchar(45) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`photo_id`),
  UNIQUE KEY `photo_id_UNIQUE` (`photo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `photo`
--

LOCK TABLES `photo` WRITE;
/*!40000 ALTER TABLE `photo` DISABLE KEYS */;
INSERT INTO `photo` VALUES (31,1,'test','2017-02-10 10:10:10'),(33,1,'photo1','2017-02-10 10:12:12'),(34,12,'photo1','2017-02-11 11:11:11'),(35,2,'photo1','2017-02-11 11:11:01'),(36,2,'photo2','2017-02-11 11:13:31'),(37,3,'photo1','2017-02-10 19:39:31'),(38,4,'photo1','2017-01-16 19:39:31'),(39,5,'photo1','2017-01-16 19:39:31'),(40,6,'photo1','2017-01-16 19:39:31'),(41,6,'photo2','2017-01-16 19:39:31'),(42,6,'photo3','2017-01-16 19:39:31'),(43,7,'photo1','2017-01-16 19:39:31'),(44,8,'photo1','2017-01-16 19:39:31'),(45,10,'photo1','2017-01-16 19:39:31'),(46,8,'photo2','2017-01-16 19:39:31'),(47,7,'photo2','2017-01-16 19:39:31'),(48,10,'photo2','2017-01-16 19:39:31');
/*!40000 ALTER TABLE `photo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `post`
--

DROP TABLE IF EXISTS `post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `post` (
  `post_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `post_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `location` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`post_id`),
  UNIQUE KEY `post_id_UNIQUE` (`post_id`),
  KEY `user_id_idx` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post`
--

LOCK TABLES `post` WRITE;
/*!40000 ALTER TABLE `post` DISABLE KEYS */;
INSERT INTO `post` VALUES (1,2,'2017-01-16 09:04:51','road to WOS','2017-02-16 19:31:40'),(2,2,'2017-02-12 14:09:01','flying dog','2017-02-16 19:31:40'),(3,1,'2017-02-14 12:34:21','lovers lane','2017-02-16 19:31:40'),(4,5,'2017-02-10 11:04:51','three mile canyon','2017-02-16 19:31:40'),(5,2,'2017-02-12 12:12:12','Tunnel of Fun','2017-02-16 19:31:40'),(6,5,'2017-02-10 11:06:51','three mile canyon','2017-02-16 19:31:40'),(7,5,'2017-02-10 11:40:51','Princess Di Trail','2017-02-16 19:31:40'),(8,3,'2017-01-27 10:14:55','Docs Run','2017-02-16 19:31:40'),(9,1,'2017-02-16 07:07:07','Run A Muk','2017-02-16 19:31:40'),(10,4,'2017-02-12 11:11:11','Murdock Bowl','2017-02-16 19:31:40'),(11,7,'2017-02-13 13:13:13','Promontory trails','2017-02-16 19:31:40'),(12,7,'2017-02-14 14:14:14','Promontory trails','2017-02-16 19:31:40'),(13,3,'2017-02-15 09:09:00','Red Pine Chutes','2017-02-16 19:31:40');
/*!40000 ALTER TABLE `post` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `track`
--

DROP TABLE IF EXISTS `track`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `track` (
  `track_id` int(11) NOT NULL AUTO_INCREMENT,
  `post_id` int(11) DEFAULT NULL,
  `track_image` varchar(45) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`track_id`),
  UNIQUE KEY `track_id_UNIQUE` (`track_id`),
  KEY `post_id_idx` (`post_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `track`
--

LOCK TABLES `track` WRITE;
/*!40000 ALTER TABLE `track` DISABLE KEYS */;
INSERT INTO `track` VALUES (1,1,'track1','2017-02-01 19:44:09'),(2,2,'track1','2017-02-01 19:44:09'),(3,3,'track1','2017-02-01 19:44:09'),(4,4,'track1','2017-02-01 19:44:09'),(5,5,'track1','2017-02-01 19:44:09'),(6,9,'track1','2017-02-01 19:44:09'),(7,10,'track1','2017-02-01 19:44:09'),(8,13,'track1','2017-02-01 19:44:09');
/*!40000 ALTER TABLE `track` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_id_UNIQUE` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Jim','jim@test.com','password','M',25,'2017-02-16 19:04:51'),(2,'Teresa Wheeler','teresalwheeler@gmail.com','password','F',32,'2017-02-16 19:07:31'),(3,'Oliver','oliver@test.com','password','M',35,'2017-02-16 19:07:31'),(4,'Zac','zac@test.com','password','M',30,'2017-02-16 19:07:31'),(5,'Eric','eric@test.com','password','M',36,'2017-02-16 19:07:31'),(6,'Sherry','sherry@sherryberry.com','password','F',44,'2017-02-16 19:07:31'),(7,'Brian','bybybrian@test.com','password','M',55,'2017-02-16 19:07:31');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'activity_manager'
--

--
-- Dumping routines for database 'activity_manager'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-02-17  5:32:09
