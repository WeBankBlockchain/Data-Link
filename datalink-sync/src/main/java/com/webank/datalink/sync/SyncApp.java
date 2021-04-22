package com.webank.datalink.sync;

import com.webank.datalink.query.DataLink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wesleywang
 * @Description:
 * @date 2021/4/22
 */
@SpringBootApplication
public class SyncApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DataLink.class);
    }
}
