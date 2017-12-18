
# 两个库 sharding-jdbc_demo_0 , sharding-jdbc_demo_1

CREATE TABLE `demo_user_0` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` bigint(20) NOT NULL COMMENT '用户id，分布式主键',
  `name` varchar(50) NOT NULL COMMENT '姓名',
  `age` tinyint(4) NOT NULL COMMENT '年龄',
  `gender` char(10) NOT NULL COMMENT '性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE `demo_user_1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` bigint(20) NOT NULL COMMENT '用户id，分布式主键',
  `name` varchar(50) NOT NULL COMMENT '姓名',
  `age` tinyint(4) NOT NULL COMMENT '年龄',
  `gender` char(10) NOT NULL COMMENT '性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


