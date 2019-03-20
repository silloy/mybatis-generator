### ORM tool for mybaits

commend：`mvn mybatis-generator:generate -e -X`

**MySQL8.0**

driver: com.mysql.cj.jdbc.Driver

connectionUrl: jdbc:mysql://127.0.0.1:3306/wego?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT&autoReconnect=true&failOverReadOnly=false&allowMultiQueries=true

**连接信息需要加serverTimezone=GMT**

[mysql-jdbc 6.0 serverTimezone参数详解](https://blog.csdn.net/YaphetS__YJ/article/details/77774874)

[jdbc连接mysq之serverTimezone设定](https://blog.csdn.net/qq631431929/article/details/51731834)


**通用Mapper**

generatorConfig.xml增加
引入
```xml
    <!-- 通用 Mapper -->
    <!-- https://mvnrepository.com/artifact/tk.mybatis/mapper -->
    <dependency>
        <groupId>tk.mybatis</groupId>
        <artifactId>mapper</artifactId>
        <version>4.0.0</version>
    </dependency>
    <!-- 如果你只需要用到通用 Mapper 中的插件，可以只引入 mapper-generator -->
    <!-- 注意，这个包不需要和上面的 mapper 同时引入，mapper 中包含 generator -->
    <!-- https://mvnrepository.com/artifact/tk.mybatis/mapper-generator -->
    <!--<dependency>-->
        <!--<groupId>tk.mybatis</groupId>-->
        <!--<artifactId>mapper-generator</artifactId>-->
        <!--<version>1.0.0</version>-->
    <!--</dependency>-->
```
```xml
       <plugin type="tk.mybatis.mapper.generator.MapperPlugin">
            <property name="mappers" value="tk.mybatis.mapper.common.Mapper,tk.mybatis.mapper.common.MySqlMapper"/>
            <property name="caseSensitive" value="true"/>
            <property name="forceAnnotation" value="true"/>
            <property name="beginningDelimiter" value="`"/>
            <property name="endingDelimiter" value="`"/>
        </plugin>
```

并通过Executor.java执行生成, 普通orm还是通过  `mvn mybatis-generator:generate -e -X` 执行

报错： [ERROR] Failed to execute goal org.mybatis.generator:mybatis-generator-maven-plugin:1.3.7:generate (default-cli) on project mybatis-generator: Execution default-cli of goal org.mybatis.generator:mybatis-generator-maven-plugin:1.3.7:generate failed: Cannot instantiate object of type me.silloy.plugins.LombokPlugin -> [Help 1]
解决：执行 `mvn package install`