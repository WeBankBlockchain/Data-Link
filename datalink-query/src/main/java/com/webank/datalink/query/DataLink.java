package com.webank.datalink.query;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wesleywang
 * @Description:
 * @date 2021/4/21
 */
@SpringBootApplication
@MapperScan("com.webank.datalink.query.dao")
public class DataLink {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DataLink.class);
    }
}
