package com.giggs13.spring.library.configuration.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "library-service")
@Data
public class ServiceProperties {

    private String message;
}
