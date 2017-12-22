# springboot-sharding-jdbc-demo

* 框架springboot + mybatis
* 分库分表存储，事务回滚已测试
* 使用的引用是2.0.1版本
* 分表分库策略是写在代码中
* 对于未使用分库分表的存储，需要通过调用setDefaultDataSourceName("XXXXDataSourceName");设置默认数据库
```
<dependency>
	<groupId>io.shardingjdbc</groupId>
	<artifactId>sharding-jdbc-core</artifactId>
	<version>2.0.1</version>
</dependency>
```