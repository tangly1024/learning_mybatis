Drop TABLE IF EXISTS `t_article`;
Create TABLE `t_article` (
  `id` int(11) NOT NULL auto_increment,
  `userid` int(11) NOT NULL,
  `title` varchar(100) NOT NULL,
  `content` text NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- 添加几条测试数据
-- ----------------------------
Insert INTO `t_article` VALUES ('1', '1', 'test_title', 'test_content');
Insert INTO `t_article` VALUES ('2', '1', 'test_title_2', 'test_content_2');
Insert INTO `t_article` VALUES ('3', '1', 'test_title_3', 'test_content_3');
Insert INTO `t_article` VALUES ('4', '1', 'test_title_4', 'test_content_4');