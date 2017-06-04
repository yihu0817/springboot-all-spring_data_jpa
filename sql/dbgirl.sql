/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : dbgirl

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-06-04 18:50:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `girl`
-- ----------------------------
DROP TABLE IF EXISTS `girl`;
CREATE TABLE `girl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `cup_size` varchar(255) NOT NULL,
  `money` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of girl
-- ----------------------------
INSERT INTO `girl` VALUES ('1', '24', 'F', '100');

-- ----------------------------
-- Table structure for `shiro_user`
-- ----------------------------
DROP TABLE IF EXISTS `shiro_user`;
CREATE TABLE `shiro_user` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shiro_user
-- ----------------------------
INSERT INTO `shiro_user` VALUES ('2', '李四', '24');
INSERT INTO `shiro_user` VALUES ('3', '张三', '24');
