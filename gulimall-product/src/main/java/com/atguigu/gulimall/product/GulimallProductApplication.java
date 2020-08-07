package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合MyBatis-Puls
 *   1.引入依赖
 *   2.配置
 *     2.1  配置数据源
 *        2.1.1  导入数据库驱动
 *        2.1.2  在application.yml中配置数据源相关信息
 *     2.2  配置MyBatis-Puls
 *        2.2.1  使用@MapperScan配置mapper接口路径
 *        2.2.2  告诉MyBatis-Puls sql映射文件位置（application.yml中）
 */
@SpringBootApplication
@MapperScan("com.atguigu.gulimall.product.dao")
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run( GulimallProductApplication.class, args );
    }

}
