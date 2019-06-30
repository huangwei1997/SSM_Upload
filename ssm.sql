/*
 Navicat Premium Data Transfer

 Source Server         : huangwei
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : ssm

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 30/06/2019 19:31:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for upload_record
-- ----------------------------
DROP TABLE IF EXISTS `upload_record`;
CREATE TABLE `upload_record`  (
  `upid` int(10) NOT NULL AUTO_INCREMENT,
  `uid` int(10) NOT NULL,
  `oldName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `newName` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `contentType` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `uploadTime` timestamp(0) NOT NULL,
  PRIMARY KEY (`upid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of upload_record
-- ----------------------------
INSERT INTO `upload_record` VALUES (1, 1, '3.jpg', 'aa758b03-11f8-4f02-b2da-66f2ebc10e8a1561724998985.jpg', 'image/jpeg', '2019-06-28 20:29:59');
INSERT INTO `upload_record` VALUES (2, 1, '3.jpg', '21b54f33-2b18-4d05-afb2-c24bc004a1611561727536742.jpg', 'image/jpeg', '2019-06-28 21:12:17');
INSERT INTO `upload_record` VALUES (3, 1, '3.jpg', 'fa11bd7c-5898-416f-88ce-9048aca37a281561727609574.jpg', 'image/jpeg', '2019-06-28 21:13:29');
INSERT INTO `upload_record` VALUES (4, 2, '3.jpg', 'b644bc17-35f3-47af-902d-2906a3bc9bcc1561727650258.jpg', 'image/jpeg', '2019-06-28 21:14:10');
INSERT INTO `upload_record` VALUES (5, 2, '3.jpg', '14f96f2c-4fa4-40af-829f-ce0a7bf18e741561727772137.jpg', 'image/jpeg', '2019-06-28 21:16:12');
INSERT INTO `upload_record` VALUES (6, 2, '3.jpg', 'b695f961-9b34-48f9-8e73-784c99a021d61561727910546.jpg', 'image/jpeg', '2019-06-28 21:18:30');
INSERT INTO `upload_record` VALUES (7, 2, '3.jpg', '6fbab17b-d25d-450c-9c11-b6075153d9c51561727912575.jpg', 'image/jpeg', '2019-06-28 21:18:32');
INSERT INTO `upload_record` VALUES (8, 1, '3.jpg', '6561bd28-70aa-4f82-9c9e-dd571a490b5c1561727973888.jpg', 'image/jpeg', '2019-06-28 21:19:33');
INSERT INTO `upload_record` VALUES (9, 1, '3.jpg', '1b6d2719-2b50-4ab3-b901-cbbad8e261f11561727988564.jpg', 'image/jpeg', '2019-06-28 21:19:48');
INSERT INTO `upload_record` VALUES (10, 2, '3.jpg', '234c2a5a-ccca-4183-87a1-ac10db7eb3f31561729366228.jpg', 'image/jpeg', '2019-06-28 21:42:46');
INSERT INTO `upload_record` VALUES (11, 3, '3.jpg', '3b05a489-fc42-464c-a77c-87a3acae03141561857994417.jpg', 'image/jpeg', '2019-06-30 09:26:35');
INSERT INTO `upload_record` VALUES (12, 1, '黄巍.jpg', '07558b38-65fb-4811-bc6c-2281796acb041561859095017.jpg', 'image/jpeg', '2019-06-30 09:44:55');
INSERT INTO `upload_record` VALUES (13, 2, '黄巍.jpg', 'be90da75-2790-455a-a37a-69841b9e09fc1561859257702.jpg', 'image/jpeg', '2019-06-30 09:47:37');
INSERT INTO `upload_record` VALUES (14, 1, '黄巍.jpg', 'd0e0c7e1-9a9a-49bb-8ca8-8c9244cceba01561860535056.jpg', 'image/jpeg', '2019-06-30 10:08:55');
INSERT INTO `upload_record` VALUES (15, 2, '黄巍.jpg', 'c03a80c4-f50b-4983-bc1a-1988fbc1f0081561860570426.jpg', 'image/jpeg', '2019-06-30 10:09:30');
INSERT INTO `upload_record` VALUES (16, 3, '黄巍.jpg', 'b3f7ed78-d18b-4d18-8d79-19a9e41408081561860640801.jpg', 'image/jpeg', '2019-06-30 10:10:41');
INSERT INTO `upload_record` VALUES (17, 2, '黄巍.jpg', 'ee8dcecf-9354-46e4-9a0b-3061ad54bd8b1561860725030.jpg', 'image/jpeg', '2019-06-30 10:12:05');
INSERT INTO `upload_record` VALUES (18, 1, '黄巍.jpg', '19f85539-3b9e-43de-93a0-45f9a34baaa51561862014115.jpg', 'image/jpeg', '2019-06-30 10:33:34');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `upwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'huangwei', '123456');

SET FOREIGN_KEY_CHECKS = 1;
