package com.giggs13.spring.library.service;

import com.giggs13.spring.library.configuration.properties.ServiceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class LibraryService {

    private final ServiceProperties serviceProperties;

    public LibraryService(ServiceProperties serviceProperties) {
        this.serviceProperties = serviceProperties;
    }

    public String message() {
        return this.serviceProperties.getMessage();
    }
}
