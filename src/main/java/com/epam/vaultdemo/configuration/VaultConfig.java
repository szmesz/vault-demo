package com.epam.vaultdemo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VaultConfig {

    @Value("${user}")
    private String user;

    public String getUser() {
        return user;
    }

}
