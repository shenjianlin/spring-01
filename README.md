# spring 的项目构建

动态生成数据中的文件 domain 和  mapper

和resources 下的mappe的xml文件

单表的 增 删 改 查

1.tag1 ： 增删改查 tag-name =v1.1

2.tag2 ： 通用Mapper的分页 tag-name =v1.2

实现了分页单表的分页

1.在pom 里配置依赖

        <!--分页插件-->
        <dependency>
            <groupId>com.github.pagehelper</groupId>
            <artifactId>pagehelper</artifactId>
            <version>5.0.0</version>
        </dependency>

2.在applicationContext.xml 里配置映射

    <bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
        <property name="dataSource" ref="dataSource"/>
        <!-- 注意其他配置 -->
        <property name="plugins">
            <array>
                <bean class="com.github.pagehelper.PageInterceptor">
                    <property name="properties">
                        <!--使用下面的方式配置参数，一行配置一个 -->
                        <value>
                            params=value1
                        </value>
                    </property>
                </bean>
            </array>
        </property>

        <property name="typeAliasesPackage" value="com.spring.domain"/>
        <!--mapper 的映射文件-->
        <property name="mapperLocations" value="classpath:mapper/*.xml"/>
        <!--<property name="mapperLocations" value="classpath:com/spring/mapper/*Mapper.xml"/>-->
    </bean>

3.测试类中

@Test
    public void testSelectAll(){
        //获取第1页，2条内容，默认查询总数count
        PageHelper.startPage(1,2);
        //紧跟着的第一个select方法会被分页
        List<UserDo>  list= userDoMapper.selectAll();

        log.info("影响的行 {}",list);
    }
}
