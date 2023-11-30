-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmseo0a
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Table structure for table `caiwurenyuan`
--

DROP TABLE IF EXISTS `caiwurenyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `caiwurenyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `caiwuzhanghao` varchar(200) NOT NULL COMMENT '财务账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `caiwuxingming` varchar(200) NOT NULL COMMENT '财务姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `dizhi` varchar(200) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `caiwuzhanghao` (`caiwuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='财务人员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `caiwurenyuan`
--

LOCK TABLES `caiwurenyuan` WRITE;
/*!40000 ALTER TABLE `caiwurenyuan` DISABLE KEYS */;
INSERT INTO `caiwurenyuan` VALUES (41,'2021-03-17 04:57:56','财务人员1','123456','财务姓名1','男','13823888881','773890001@qq.com','440300199101010001','http://localhost:8080/ssmseo0a/upload/caiwurenyuan_zhaopian1.jpg','地址1'),(42,'2021-03-17 04:57:56','财务人员2','123456','财务姓名2','男','13823888882','773890002@qq.com','440300199202020002','http://localhost:8080/ssmseo0a/upload/caiwurenyuan_zhaopian2.jpg','地址2'),(43,'2021-03-17 04:57:56','财务人员3','123456','财务姓名3','男','13823888883','773890003@qq.com','440300199303030003','http://localhost:8080/ssmseo0a/upload/caiwurenyuan_zhaopian3.jpg','地址3'),(44,'2021-03-17 04:57:56','财务人员4','123456','财务姓名4','男','13823888884','773890004@qq.com','440300199404040004','http://localhost:8080/ssmseo0a/upload/caiwurenyuan_zhaopian4.jpg','地址4'),(45,'2021-03-17 04:57:56','财务人员5','123456','财务姓名5','男','13823888885','773890005@qq.com','440300199505050005','http://localhost:8080/ssmseo0a/upload/caiwurenyuan_zhaopian5.jpg','地址5'),(46,'2021-03-17 04:57:56','财务人员6','123456','财务姓名6','男','13823888886','773890006@qq.com','440300199606060006','http://localhost:8080/ssmseo0a/upload/caiwurenyuan_zhaopian6.jpg','地址6');
/*!40000 ALTER TABLE `caiwurenyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssmseo0a/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssmseo0a/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssmseo0a/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feihetongshouzhi`
--

DROP TABLE IF EXISTS `feihetongshouzhi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `feihetongshouzhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `caiwuzhanghao` varchar(200) DEFAULT NULL COMMENT '财务账号',
  `caiwuxingming` varchar(200) DEFAULT NULL COMMENT '财务姓名',
  `edu` varchar(200) DEFAULT NULL COMMENT '额度',
  `zhifufangshi` varchar(200) DEFAULT NULL COMMENT '支付方式',
  `zhifushijian` date DEFAULT NULL COMMENT '支付时间',
  `fukuanren` varchar(200) DEFAULT NULL COMMENT '付款人',
  `shoukuanren` varchar(200) DEFAULT NULL COMMENT '收款人',
  `jilushijian` date DEFAULT NULL COMMENT '记录时间',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bianhao` (`bianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='非合同收支';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feihetongshouzhi`
--

LOCK TABLES `feihetongshouzhi` WRITE;
/*!40000 ALTER TABLE `feihetongshouzhi` DISABLE KEYS */;
INSERT INTO `feihetongshouzhi` VALUES (121,'2021-03-17 04:57:56','编号1','名称1','财务账号1','财务姓名1','额度1','支付方式1','2021-03-17','付款人1','收款人1','2021-03-17','备注1'),(122,'2021-03-17 04:57:56','编号2','名称2','财务账号2','财务姓名2','额度2','支付方式2','2021-03-17','付款人2','收款人2','2021-03-17','备注2'),(123,'2021-03-17 04:57:56','编号3','名称3','财务账号3','财务姓名3','额度3','支付方式3','2021-03-17','付款人3','收款人3','2021-03-17','备注3'),(124,'2021-03-17 04:57:56','编号4','名称4','财务账号4','财务姓名4','额度4','支付方式4','2021-03-17','付款人4','收款人4','2021-03-17','备注4'),(125,'2021-03-17 04:57:56','编号5','名称5','财务账号5','财务姓名5','额度5','支付方式5','2021-03-17','付款人5','收款人5','2021-03-17','备注5'),(126,'2021-03-17 04:57:56','编号6','名称6','财务账号6','财务姓名6','额度6','支付方式6','2021-03-17','付款人6','收款人6','2021-03-17','备注6');
/*!40000 ALTER TABLE `feihetongshouzhi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fuwubiangeng`
--

DROP TABLE IF EXISTS `fuwubiangeng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fuwubiangeng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biangengbianhao` varchar(200) DEFAULT NULL COMMENT '变更编号',
  `kehuzhanghao` varchar(200) DEFAULT NULL COMMENT '客户账号',
  `kehuxingming` varchar(200) DEFAULT NULL COMMENT '客户姓名',
  `yuanxiangmu` varchar(200) DEFAULT NULL COMMENT '原项目',
  `xinxiangmu` varchar(200) DEFAULT NULL COMMENT '新项目',
  `biangengriqi` date DEFAULT NULL COMMENT '变更日期',
  `biangengyuanyin` longtext COMMENT '变更原因',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `biangengbianhao` (`biangengbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='服务变更';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fuwubiangeng`
--

LOCK TABLES `fuwubiangeng` WRITE;
/*!40000 ALTER TABLE `fuwubiangeng` DISABLE KEYS */;
INSERT INTO `fuwubiangeng` VALUES (71,'2021-03-17 04:57:56','变更编号1','客户账号1','客户姓名1','原项目1','新项目1','2021-03-17','变更原因1','工号1','姓名1'),(72,'2021-03-17 04:57:56','变更编号2','客户账号2','客户姓名2','原项目2','新项目2','2021-03-17','变更原因2','工号2','姓名2'),(73,'2021-03-17 04:57:56','变更编号3','客户账号3','客户姓名3','原项目3','新项目3','2021-03-17','变更原因3','工号3','姓名3'),(74,'2021-03-17 04:57:56','变更编号4','客户账号4','客户姓名4','原项目4','新项目4','2021-03-17','变更原因4','工号4','姓名4'),(75,'2021-03-17 04:57:56','变更编号5','客户账号5','客户姓名5','原项目5','新项目5','2021-03-17','变更原因5','工号5','姓名5'),(76,'2021-03-17 04:57:56','变更编号6','客户账号6','客户姓名6','原项目6','新项目6','2021-03-17','变更原因6','工号6','姓名6');
/*!40000 ALTER TABLE `fuwubiangeng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fuwurenyuan`
--

DROP TABLE IF EXISTS `fuwurenyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fuwurenyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonghao` varchar(200) NOT NULL COMMENT '工号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `dizhi` varchar(200) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `gonghao` (`gonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='服务人员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fuwurenyuan`
--

LOCK TABLES `fuwurenyuan` WRITE;
/*!40000 ALTER TABLE `fuwurenyuan` DISABLE KEYS */;
INSERT INTO `fuwurenyuan` VALUES (31,'2021-03-17 04:57:56','服务人员1','123456','姓名1','男','13823888881','773890001@qq.com','440300199101010001','http://localhost:8080/ssmseo0a/upload/fuwurenyuan_zhaopian1.jpg','地址1'),(32,'2021-03-17 04:57:56','服务人员2','123456','姓名2','男','13823888882','773890002@qq.com','440300199202020002','http://localhost:8080/ssmseo0a/upload/fuwurenyuan_zhaopian2.jpg','地址2'),(33,'2021-03-17 04:57:56','服务人员3','123456','姓名3','男','13823888883','773890003@qq.com','440300199303030003','http://localhost:8080/ssmseo0a/upload/fuwurenyuan_zhaopian3.jpg','地址3'),(34,'2021-03-17 04:57:56','服务人员4','123456','姓名4','男','13823888884','773890004@qq.com','440300199404040004','http://localhost:8080/ssmseo0a/upload/fuwurenyuan_zhaopian4.jpg','地址4'),(35,'2021-03-17 04:57:56','服务人员5','123456','姓名5','男','13823888885','773890005@qq.com','440300199505050005','http://localhost:8080/ssmseo0a/upload/fuwurenyuan_zhaopian5.jpg','地址5'),(36,'2021-03-17 04:57:56','服务人员6','123456','姓名6','男','13823888886','773890006@qq.com','440300199606060006','http://localhost:8080/ssmseo0a/upload/fuwurenyuan_zhaopian6.jpg','地址6');
/*!40000 ALTER TABLE `fuwurenyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fuwuxiangmu`
--

DROP TABLE IF EXISTS `fuwuxiangmu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fuwuxiangmu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiangmubianhao` varchar(200) DEFAULT NULL COMMENT '项目编号',
  `xiangmumingcheng` varchar(200) DEFAULT NULL COMMENT '项目名称',
  `neirong` longtext COMMENT '内容',
  `jiage` int(11) DEFAULT NULL COMMENT '价格',
  `beizhu` longtext COMMENT '备注',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xiangmubianhao` (`xiangmubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='服务项目';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fuwuxiangmu`
--

LOCK TABLES `fuwuxiangmu` WRITE;
/*!40000 ALTER TABLE `fuwuxiangmu` DISABLE KEYS */;
INSERT INTO `fuwuxiangmu` VALUES (51,'2021-03-17 04:57:56','项目编号1','项目名称1','内容1',1,'备注1','http://localhost:8080/ssmseo0a/upload/fuwuxiangmu_tupian1.jpg'),(52,'2021-03-17 04:57:56','项目编号2','项目名称2','内容2',2,'备注2','http://localhost:8080/ssmseo0a/upload/fuwuxiangmu_tupian2.jpg'),(53,'2021-03-17 04:57:56','项目编号3','项目名称3','内容3',3,'备注3','http://localhost:8080/ssmseo0a/upload/fuwuxiangmu_tupian3.jpg'),(54,'2021-03-17 04:57:56','项目编号4','项目名称4','内容4',4,'备注4','http://localhost:8080/ssmseo0a/upload/fuwuxiangmu_tupian4.jpg'),(55,'2021-03-17 04:57:56','项目编号5','项目名称5','内容5',5,'备注5','http://localhost:8080/ssmseo0a/upload/fuwuxiangmu_tupian5.jpg'),(56,'2021-03-17 04:57:56','项目编号6','项目名称6','内容6',6,'备注6','http://localhost:8080/ssmseo0a/upload/fuwuxiangmu_tupian6.jpg');
/*!40000 ALTER TABLE `fuwuxiangmu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hetongshouzhi`
--

DROP TABLE IF EXISTS `hetongshouzhi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hetongshouzhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `caiwuzhanghao` varchar(200) DEFAULT NULL COMMENT '财务账号',
  `caiwuxingming` varchar(200) DEFAULT NULL COMMENT '财务姓名',
  `edu` varchar(200) DEFAULT NULL COMMENT '额度',
  `zhifufangshi` varchar(200) DEFAULT NULL COMMENT '支付方式',
  `zhifushijian` date DEFAULT NULL COMMENT '支付时间',
  `fukuanren` varchar(200) DEFAULT NULL COMMENT '付款人',
  `shoukuanren` varchar(200) DEFAULT NULL COMMENT '收款人',
  `jilushijian` date DEFAULT NULL COMMENT '记录时间',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bianhao` (`bianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='合同收支';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hetongshouzhi`
--

LOCK TABLES `hetongshouzhi` WRITE;
/*!40000 ALTER TABLE `hetongshouzhi` DISABLE KEYS */;
INSERT INTO `hetongshouzhi` VALUES (111,'2021-03-17 04:57:56','编号1','名称1','财务账号1','财务姓名1','额度1','支付方式1','2021-03-17','付款人1','收款人1','2021-03-17','备注1'),(112,'2021-03-17 04:57:56','编号2','名称2','财务账号2','财务姓名2','额度2','支付方式2','2021-03-17','付款人2','收款人2','2021-03-17','备注2'),(113,'2021-03-17 04:57:56','编号3','名称3','财务账号3','财务姓名3','额度3','支付方式3','2021-03-17','付款人3','收款人3','2021-03-17','备注3'),(114,'2021-03-17 04:57:56','编号4','名称4','财务账号4','财务姓名4','额度4','支付方式4','2021-03-17','付款人4','收款人4','2021-03-17','备注4'),(115,'2021-03-17 04:57:56','编号5','名称5','财务账号5','财务姓名5','额度5','支付方式5','2021-03-17','付款人5','收款人5','2021-03-17','备注5'),(116,'2021-03-17 04:57:56','编号6','名称6','财务账号6','财务姓名6','额度6','支付方式6','2021-03-17','付款人6','收款人6','2021-03-17','备注6');
/*!40000 ALTER TABLE `hetongshouzhi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kehu`
--

DROP TABLE IF EXISTS `kehu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kehu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kehuzhanghao` varchar(200) NOT NULL COMMENT '客户账号',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `kehuxingming` varchar(200) NOT NULL COMMENT '客户姓名',
  `minzu` varchar(200) DEFAULT NULL COMMENT '民族',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `fuwuxiangmu` varchar(200) DEFAULT NULL COMMENT '服务项目',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `dizhi` varchar(200) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `kehuzhanghao` (`kehuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1615957256421 DEFAULT CHARSET=utf8 COMMENT='客户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kehu`
--

LOCK TABLES `kehu` WRITE;
/*!40000 ALTER TABLE `kehu` DISABLE KEYS */;
INSERT INTO `kehu` VALUES (11,'2021-03-17 04:57:56','客户1','123456','客户姓名1','民族1','男',1,'http://localhost:8080/ssmseo0a/upload/kehu_zhaopian1.jpg','服务项目1','13823888881','440300199101010001','地址1'),(12,'2021-03-17 04:57:56','客户2','123456','客户姓名2','民族2','男',2,'http://localhost:8080/ssmseo0a/upload/kehu_zhaopian2.jpg','服务项目2','13823888882','440300199202020002','地址2'),(13,'2021-03-17 04:57:56','客户3','123456','客户姓名3','民族3','男',3,'http://localhost:8080/ssmseo0a/upload/kehu_zhaopian3.jpg','服务项目3','13823888883','440300199303030003','地址3'),(14,'2021-03-17 04:57:56','客户4','123456','客户姓名4','民族4','男',4,'http://localhost:8080/ssmseo0a/upload/kehu_zhaopian4.jpg','服务项目4','13823888884','440300199404040004','地址4'),(15,'2021-03-17 04:57:56','客户5','123456','客户姓名5','民族5','男',5,'http://localhost:8080/ssmseo0a/upload/kehu_zhaopian5.jpg','服务项目5','13823888885','440300199505050005','地址5'),(16,'2021-03-17 04:57:56','客户6','123456','客户姓名6','民族6','男',6,'http://localhost:8080/ssmseo0a/upload/kehu_zhaopian6.jpg','服务项目6','13823888886','440300199606060006','地址6'),(1615957256420,'2021-03-17 05:00:56','11','11','啊水电费','删掉',NULL,33,NULL,'鼎折覆餗','11111222222',NULL,NULL);
/*!40000 ALTER TABLE `kehu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kehuhuifang`
--

DROP TABLE IF EXISTS `kehuhuifang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kehuhuifang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huifangbianhao` varchar(200) DEFAULT NULL COMMENT '回访编号',
  `kehuzhanghao` varchar(200) DEFAULT NULL COMMENT '客户账号',
  `kehuxingming` varchar(200) DEFAULT NULL COMMENT '客户姓名',
  `huifangneirong` longtext COMMENT '回访内容',
  `cunzaiwenti` longtext COMMENT '存在问题',
  `kehuyijian` longtext COMMENT '客户意见',
  `kehujianyi` longtext COMMENT '客户建议',
  `huifangshijian` date DEFAULT NULL COMMENT '回访时间',
  `kehupingjia` varchar(200) DEFAULT NULL COMMENT '客户评价',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `huifangbianhao` (`huifangbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='客户回访';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kehuhuifang`
--

LOCK TABLES `kehuhuifang` WRITE;
/*!40000 ALTER TABLE `kehuhuifang` DISABLE KEYS */;
INSERT INTO `kehuhuifang` VALUES (101,'2021-03-17 04:57:56','回访编号1','客户账号1','客户姓名1','回访内容1','存在问题1','客户意见1','客户建议1','2021-03-17','满意','工号1','姓名1'),(102,'2021-03-17 04:57:56','回访编号2','客户账号2','客户姓名2','回访内容2','存在问题2','客户意见2','客户建议2','2021-03-17','满意','工号2','姓名2'),(103,'2021-03-17 04:57:56','回访编号3','客户账号3','客户姓名3','回访内容3','存在问题3','客户意见3','客户建议3','2021-03-17','满意','工号3','姓名3'),(104,'2021-03-17 04:57:56','回访编号4','客户账号4','客户姓名4','回访内容4','存在问题4','客户意见4','客户建议4','2021-03-17','满意','工号4','姓名4'),(105,'2021-03-17 04:57:56','回访编号5','客户账号5','客户姓名5','回访内容5','存在问题5','客户意见5','客户建议5','2021-03-17','满意','工号5','姓名5'),(106,'2021-03-17 04:57:56','回访编号6','客户账号6','客户姓名6','回访内容6','存在问题6','客户意见6','客户建议6','2021-03-17','满意','工号6','姓名6');
/*!40000 ALTER TABLE `kehuhuifang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kehutousu`
--

DROP TABLE IF EXISTS `kehutousu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kehutousu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tousubianhao` varchar(200) DEFAULT NULL COMMENT '投诉编号',
  `kehuzhanghao` varchar(200) DEFAULT NULL COMMENT '客户账号',
  `kehuxingming` varchar(200) DEFAULT NULL COMMENT '客户姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `tousuneirong` longtext COMMENT '投诉内容',
  `tousushijian` date DEFAULT NULL COMMENT '投诉时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `tousubianhao` (`tousubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='客户投诉';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kehutousu`
--

LOCK TABLES `kehutousu` WRITE;
/*!40000 ALTER TABLE `kehutousu` DISABLE KEYS */;
INSERT INTO `kehutousu` VALUES (81,'2021-03-17 04:57:56','投诉编号1','客户账号1','客户姓名1','手机1','投诉内容1','2021-03-17'),(82,'2021-03-17 04:57:56','投诉编号2','客户账号2','客户姓名2','手机2','投诉内容2','2021-03-17'),(83,'2021-03-17 04:57:56','投诉编号3','客户账号3','客户姓名3','手机3','投诉内容3','2021-03-17'),(84,'2021-03-17 04:57:56','投诉编号4','客户账号4','客户姓名4','手机4','投诉内容4','2021-03-17'),(85,'2021-03-17 04:57:56','投诉编号5','客户账号5','客户姓名5','手机5','投诉内容5','2021-03-17'),(86,'2021-03-17 04:57:56','投诉编号6','客户账号6','客户姓名6','手机6','投诉内容6','2021-03-17');
/*!40000 ALTER TABLE `kehutousu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qiandinghetong`
--

DROP TABLE IF EXISTS `qiandinghetong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qiandinghetong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `hetongbianhao` varchar(200) DEFAULT NULL COMMENT '合同编号',
  `kehuzhanghao` varchar(200) DEFAULT NULL COMMENT '客户账号',
  `kehuxingming` varchar(200) DEFAULT NULL COMMENT '客户姓名',
  `hetongneirong` longtext COMMENT '合同内容',
  `fuwuneirong` longtext COMMENT '服务内容',
  `fuwudidian` varchar(200) DEFAULT NULL COMMENT '服务地点',
  `qishishijian` date DEFAULT NULL COMMENT '起始时间',
  `jieshushijian` varchar(200) DEFAULT NULL COMMENT '结束时间',
  `gongzuoxiaoshi` int(11) DEFAULT NULL COMMENT '工作小时',
  `gongzuotianshu` int(11) DEFAULT NULL COMMENT '工作天数',
  `shiyongqi` varchar(200) DEFAULT NULL COMMENT '试用期',
  `gongzi` int(11) DEFAULT NULL COMMENT '工资',
  `beizhu` longtext COMMENT '备注',
  `qiantaizhanghao` varchar(200) DEFAULT NULL COMMENT '前台账号',
  `qiantaixingming` varchar(200) DEFAULT NULL COMMENT '前台姓名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `hetongbianhao` (`hetongbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1615957913863 DEFAULT CHARSET=utf8 COMMENT='签订合同';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qiandinghetong`
--

LOCK TABLES `qiandinghetong` WRITE;
/*!40000 ALTER TABLE `qiandinghetong` DISABLE KEYS */;
INSERT INTO `qiandinghetong` VALUES (61,'2021-03-17 04:57:56','合同编号1','客户账号1','客户姓名1','合同内容1','服务内容1','服务地点1','2021-03-17','结束时间1',1,1,'试用期1',1,'备注1','前台账号1','前台姓名1'),(62,'2021-03-17 04:57:56','合同编号2','客户账号2','客户姓名2','合同内容2','服务内容2','服务地点2','2021-03-17','结束时间2',2,2,'试用期2',2,'备注2','前台账号2','前台姓名2'),(63,'2021-03-17 04:57:56','合同编号3','客户账号3','客户姓名3','合同内容3','服务内容3','服务地点3','2021-03-17','结束时间3',3,3,'试用期3',3,'备注3','前台账号3','前台姓名3'),(64,'2021-03-17 04:57:56','合同编号4','客户账号4','客户姓名4','合同内容4','服务内容4','服务地点4','2021-03-17','结束时间4',4,4,'试用期4',4,'备注4','前台账号4','前台姓名4'),(65,'2021-03-17 04:57:56','合同编号5','客户账号5','客户姓名5','合同内容5','服务内容5','服务地点5','2021-03-17','结束时间5',5,5,'试用期5',5,'备注5','前台账号5','前台姓名5'),(66,'2021-03-17 04:57:56','合同编号6','客户账号6','客户姓名6','合同内容6','服务内容6','服务地点6','2021-03-17','结束时间6',6,6,'试用期6',6,'备注6','前台账号6','前台姓名6'),(1615957913862,'2021-03-17 05:11:53','1615957803145','11','啊水电费','<p>规范化发过后</p>','<p>恢复供货</p>','对方是否','2021-03-17','水电费第三方',8,14,'300',250,'<p>法规和法国很反感</p>','22','萨达');
/*!40000 ALTER TABLE `qiandinghetong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qiantai`
--

DROP TABLE IF EXISTS `qiantai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qiantai` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `qiantaizhanghao` varchar(200) NOT NULL COMMENT '前台账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `qiantaixingming` varchar(200) NOT NULL COMMENT '前台姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `dizhi` varchar(200) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `qiantaizhanghao` (`qiantaizhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1615957242233 DEFAULT CHARSET=utf8 COMMENT='前台';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qiantai`
--

LOCK TABLES `qiantai` WRITE;
/*!40000 ALTER TABLE `qiantai` DISABLE KEYS */;
INSERT INTO `qiantai` VALUES (21,'2021-03-17 04:57:56','前台1','123456','前台姓名1','男','13823888881','773890001@qq.com','440300199101010001','http://localhost:8080/ssmseo0a/upload/qiantai_zhaopian1.jpg','地址1'),(22,'2021-03-17 04:57:56','前台2','123456','前台姓名2','男','13823888882','773890002@qq.com','440300199202020002','http://localhost:8080/ssmseo0a/upload/qiantai_zhaopian2.jpg','地址2'),(23,'2021-03-17 04:57:56','前台3','123456','前台姓名3','男','13823888883','773890003@qq.com','440300199303030003','http://localhost:8080/ssmseo0a/upload/qiantai_zhaopian3.jpg','地址3'),(24,'2021-03-17 04:57:56','前台4','123456','前台姓名4','男','13823888884','773890004@qq.com','440300199404040004','http://localhost:8080/ssmseo0a/upload/qiantai_zhaopian4.jpg','地址4'),(25,'2021-03-17 04:57:56','前台5','123456','前台姓名5','男','13823888885','773890005@qq.com','440300199505050005','http://localhost:8080/ssmseo0a/upload/qiantai_zhaopian5.jpg','地址5'),(26,'2021-03-17 04:57:56','前台6','123456','前台姓名6','男','13823888886','773890006@qq.com','440300199606060006','http://localhost:8080/ssmseo0a/upload/qiantai_zhaopian6.jpg','地址6'),(1615957242232,'2021-03-17 05:00:42','22','22','萨达',NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `qiantai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rijiegongzi`
--

DROP TABLE IF EXISTS `rijiegongzi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rijiegongzi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `laodongshouru` int(11) DEFAULT NULL COMMENT '劳动收入',
  `qitabuzhu` int(11) DEFAULT NULL COMMENT '其他补助',
  `jixiaojiangjin` int(11) DEFAULT NULL COMMENT '绩效奖金',
  `koukuanjine` int(11) DEFAULT NULL COMMENT '扣款金额',
  `koukuanyuanyin` longtext COMMENT '扣款原因',
  `shifagongzi` varchar(200) DEFAULT NULL COMMENT '实发工资',
  `fafangshijian` date DEFAULT NULL COMMENT '发放时间',
  `caiwuzhanghao` varchar(200) DEFAULT NULL COMMENT '财务账号',
  `caiwuxingming` varchar(200) DEFAULT NULL COMMENT '财务姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='日结工资';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rijiegongzi`
--

LOCK TABLES `rijiegongzi` WRITE;
/*!40000 ALTER TABLE `rijiegongzi` DISABLE KEYS */;
INSERT INTO `rijiegongzi` VALUES (141,'2021-03-17 04:57:56','名称1','员工工号1','姓名1',1,1,1,1,'扣款原因1','实发工资1','2021-03-17','财务账号1','财务姓名1'),(142,'2021-03-17 04:57:56','名称2','员工工号2','姓名2',2,2,2,2,'扣款原因2','实发工资2','2021-03-17','财务账号2','财务姓名2'),(143,'2021-03-17 04:57:56','名称3','员工工号3','姓名3',3,3,3,3,'扣款原因3','实发工资3','2021-03-17','财务账号3','财务姓名3'),(144,'2021-03-17 04:57:56','名称4','员工工号4','姓名4',4,4,4,4,'扣款原因4','实发工资4','2021-03-17','财务账号4','财务姓名4'),(145,'2021-03-17 04:57:56','名称5','员工工号5','姓名5',5,5,5,5,'扣款原因5','实发工资5','2021-03-17','财务账号5','财务姓名5'),(146,'2021-03-17 04:57:56','名称6','员工工号6','姓名6',6,6,6,6,'扣款原因6','实发工资6','2021-03-17','财务账号6','财务姓名6');
/*!40000 ALTER TABLE `rijiegongzi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shouzhizhenghe`
--

DROP TABLE IF EXISTS `shouzhizhenghe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shouzhizhenghe` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `hetongshouzhi` varchar(200) DEFAULT NULL COMMENT '合同收支',
  `feihetongshouzhi` varchar(200) DEFAULT NULL COMMENT '非合同收支',
  `jine` varchar(200) DEFAULT NULL COMMENT '金额',
  `dengjishijian` date DEFAULT NULL COMMENT '登记时间',
  `caiwuzhanghao` varchar(200) DEFAULT NULL COMMENT '财务账号',
  `caiwuxingming` varchar(200) DEFAULT NULL COMMENT '财务姓名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bianhao` (`bianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='收支整合';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shouzhizhenghe`
--

LOCK TABLES `shouzhizhenghe` WRITE;
/*!40000 ALTER TABLE `shouzhizhenghe` DISABLE KEYS */;
INSERT INTO `shouzhizhenghe` VALUES (131,'2021-03-17 04:57:56','编号1','名称1','合同收支1','非合同收支1','金额1','2021-03-17','财务账号1','财务姓名1'),(132,'2021-03-17 04:57:56','编号2','名称2','合同收支2','非合同收支2','金额2','2021-03-17','财务账号2','财务姓名2'),(133,'2021-03-17 04:57:56','编号3','名称3','合同收支3','非合同收支3','金额3','2021-03-17','财务账号3','财务姓名3'),(134,'2021-03-17 04:57:56','编号4','名称4','合同收支4','非合同收支4','金额4','2021-03-17','财务账号4','财务姓名4'),(135,'2021-03-17 04:57:56','编号5','名称5','合同收支5','非合同收支5','金额5','2021-03-17','财务账号5','财务姓名5'),(136,'2021-03-17 04:57:56','编号6','名称6','合同收支6','非合同收支6','金额6','2021-03-17','财务账号6','财务姓名6');
/*!40000 ALTER TABLE `shouzhizhenghe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1615957242232,'22','qiantai','前台','ecx0d2u2u5ep5dzf0lhg52o23hnio0hq','2021-03-17 05:10:05','2021-03-17 06:10:05'),(2,1615957256420,'11','kehu','客户','qozk62cv5fnlf45eaexcv6aga0o2j202','2021-03-17 05:12:03','2021-03-17 06:12:03');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tousuchuli`
--

DROP TABLE IF EXISTS `tousuchuli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tousuchuli` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tousubianhao` varchar(200) DEFAULT NULL COMMENT '投诉编号',
  `kehuzhanghao` varchar(200) DEFAULT NULL COMMENT '客户账号',
  `kehuxingming` varchar(200) DEFAULT NULL COMMENT '客户姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `chuliren` varchar(200) DEFAULT NULL COMMENT '处理人',
  `jieguohuifu` longtext COMMENT '结果回复',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='投诉处理';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tousuchuli`
--

LOCK TABLES `tousuchuli` WRITE;
/*!40000 ALTER TABLE `tousuchuli` DISABLE KEYS */;
INSERT INTO `tousuchuli` VALUES (91,'2021-03-17 04:57:56','投诉编号1','客户账号1','客户姓名1','手机1','处理人1','结果回复1','工号1','姓名1'),(92,'2021-03-17 04:57:56','投诉编号2','客户账号2','客户姓名2','手机2','处理人2','结果回复2','工号2','姓名2'),(93,'2021-03-17 04:57:56','投诉编号3','客户账号3','客户姓名3','手机3','处理人3','结果回复3','工号3','姓名3'),(94,'2021-03-17 04:57:56','投诉编号4','客户账号4','客户姓名4','手机4','处理人4','结果回复4','工号4','姓名4'),(95,'2021-03-17 04:57:56','投诉编号5','客户账号5','客户姓名5','手机5','处理人5','结果回复5','工号5','姓名5'),(96,'2021-03-17 04:57:56','投诉编号6','客户账号6','客户姓名6','手机6','处理人6','结果回复6','工号6','姓名6');
/*!40000 ALTER TABLE `tousuchuli` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-03-17 04:57:56');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuejiegongzi`
--

DROP TABLE IF EXISTS `yuejiegongzi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuejiegongzi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `laodongshouru` int(11) DEFAULT NULL COMMENT '劳动收入',
  `qitabuzhu` int(11) DEFAULT NULL COMMENT '其他补助',
  `jixiaojiangjin` int(11) DEFAULT NULL COMMENT '绩效奖金',
  `koukuanjine` int(11) DEFAULT NULL COMMENT '扣款金额',
  `koukuanyuanyin` longtext COMMENT '扣款原因',
  `shifagongzi` varchar(200) DEFAULT NULL COMMENT '实发工资',
  `fafangshijian` date DEFAULT NULL COMMENT '发放时间',
  `caiwuzhanghao` varchar(200) DEFAULT NULL COMMENT '财务账号',
  `caiwuxingming` varchar(200) DEFAULT NULL COMMENT '财务姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8 COMMENT='月结工资';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuejiegongzi`
--

LOCK TABLES `yuejiegongzi` WRITE;
/*!40000 ALTER TABLE `yuejiegongzi` DISABLE KEYS */;
INSERT INTO `yuejiegongzi` VALUES (151,'2021-03-17 04:57:56','名称1','员工工号1','姓名1',1,1,1,1,'扣款原因1','实发工资1','2021-03-17','财务账号1','财务姓名1'),(152,'2021-03-17 04:57:56','名称2','员工工号2','姓名2',2,2,2,2,'扣款原因2','实发工资2','2021-03-17','财务账号2','财务姓名2'),(153,'2021-03-17 04:57:56','名称3','员工工号3','姓名3',3,3,3,3,'扣款原因3','实发工资3','2021-03-17','财务账号3','财务姓名3'),(154,'2021-03-17 04:57:56','名称4','员工工号4','姓名4',4,4,4,4,'扣款原因4','实发工资4','2021-03-17','财务账号4','财务姓名4'),(155,'2021-03-17 04:57:56','名称5','员工工号5','姓名5',5,5,5,5,'扣款原因5','实发工资5','2021-03-17','财务账号5','财务姓名5'),(156,'2021-03-17 04:57:56','名称6','员工工号6','姓名6',6,6,6,6,'扣款原因6','实发工资6','2021-03-17','财务账号6','财务姓名6');
/*!40000 ALTER TABLE `yuejiegongzi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-19 18:03:27
