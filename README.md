# springboot-sharding-jdbc-demo

* 框架springboot + mybatis
* 分库分表存储，事务回滚已测试
* 使用的引用是2.0.1版本
* 分表分库策略是写yaml文件中（本 demo 在 datasource.yaml 中）
* 对于未使用分库分表的存储，yaml文件中配置 defaultDataSourceName 属性
```
<dependency>
	<groupId>io.shardingjdbc</groupId>
	<artifactId>sharding-jdbc-core</artifactId>
	<version>2.0.1</version>
</dependency>
```