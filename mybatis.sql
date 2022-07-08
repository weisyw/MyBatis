/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : mybatis

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 08/07/2022 22:11:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_dept
-- ----------------------------
DROP TABLE IF EXISTS `t_dept`;
CREATE TABLE `t_dept`  (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`did`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_dept
-- ----------------------------
INSERT INTO `t_dept` VALUES (1, 'A');
INSERT INTO `t_dept` VALUES (2, 'B');
INSERT INTO `t_dept` VALUES (3, 'C');

-- ----------------------------
-- Table structure for t_emp
-- ----------------------------
DROP TABLE IF EXISTS `t_emp`;
CREATE TABLE `t_emp`  (
  `eid` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `did` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`eid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_emp
-- ----------------------------
INSERT INTO `t_emp` VALUES (1, '张三', 10, '男', '123@qq.com', 1);
INSERT INTO `t_emp` VALUES (2, '李四', 11, '男', '123@qq.com', 2);
INSERT INTO `t_emp` VALUES (3, '王五', 12, '男', '123@qq.com', 3);
INSERT INTO `t_emp` VALUES (4, '赵六', 13, '女', '123@qq.com', 1);
INSERT INTO `t_emp` VALUES (5, '田七', 14, '女', '123@qq.com', 2);
INSERT INTO `t_emp` VALUES (9, 'a', NULL, NULL, NULL, NULL);
INSERT INTO `t_emp` VALUES (10, 'a', NULL, NULL, NULL, NULL);
INSERT INTO `t_emp` VALUES (11, 'a1', 12, '男', '123@qq.com', NULL);
INSERT INTO `t_emp` VALUES (12, 'a2', 13, '男', '123@qq.com', NULL);
INSERT INTO `t_emp` VALUES (13, 'a3', 14, '男', '123@qq.com', NULL);
INSERT INTO `t_emp` VALUES (14, 'a1', 12, '男', '123@qq.com', NULL);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (3, 'admin', '1234', 20, '男', '123@qq.com');
INSERT INTO `t_user` VALUES (4, '张三', '1234', 20, '男', '123@qq.com');
INSERT INTO `t_user` VALUES (7, '王五', '1234', 18, '男', '123@qq.com');

SET FOREIGN_KEY_CHECKS = 1;
