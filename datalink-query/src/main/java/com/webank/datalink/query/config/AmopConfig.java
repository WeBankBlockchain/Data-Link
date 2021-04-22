package com.webank.datalink.query.config;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.fisco.bcos.sdk.BcosSDK;
import org.fisco.bcos.sdk.amop.Amop;
import org.fisco.bcos.sdk.client.Client;
import org.fisco.bcos.sdk.config.ConfigOption;
import org.fisco.bcos.sdk.config.exceptions.ConfigException;
import org.fisco.bcos.sdk.config.model.ConfigProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author aaronchu
 * @Description
 * @data 2021/03/31
 */

@Configuration
@ConfigurationProperties("system")
@Data
public class AmopConfig {

    //cert
    private String certPath;
    private int groupId;
    private String nodeStr;

    //topic
    private String topic;

    @Bean
    public Client getClient(@Autowired BcosSDK sdk) throws ConfigException {
        return sdk.getClient(this.groupId);
    }

    @Bean
    public BcosSDK getSDK() throws ConfigException {
        ConfigProperty configProperty = new ConfigProperty();
        setPeers(configProperty);
        setCertPath(configProperty);
        ConfigOption option = new ConfigOption(configProperty);
        return new BcosSDK(option);
    }

    public void setPeers(ConfigProperty configProperty) {
        String[] nodes = StringUtils.split(this.nodeStr, ";");
        List<String> peers = Arrays.asList(nodes);
        Map<String, Object> network = new HashMap<>();
        network.put("peers", peers);
        configProperty.setNetwork(network);
    }

    public void setCertPath(ConfigProperty configProperty) {
        Map<String, Object> cryptoMaterial = new HashMap<>();
        cryptoMaterial.put("certPath", "config");
        configProperty.setCryptoMaterial(cryptoMaterial);
    }

    @Bean
    public Amop getAmop(@Autowired BcosSDK sdk) {
        return sdk.getAmop();
    }


}
