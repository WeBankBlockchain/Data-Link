package com.webank.datalink.query.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/31
 */
@Configuration
@ConfigurationProperties("system")
@Data
public class SystemConfig {

}
