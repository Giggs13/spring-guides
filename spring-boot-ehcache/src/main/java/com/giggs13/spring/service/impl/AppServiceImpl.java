package com.giggs13.spring.service.impl;

import com.giggs13.spring.service.AppService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service("numberService")
@Slf4j
public class AppServiceImpl
        implements AppService {

    @Override
    @Cacheable(cacheNames = "messageCache", key = "#root.methodName")
    public String getMessage() {
        logger.info("=>>> Inside of getMessage() method witin a Service");

        return "Hello there!";
    }

    @Override
    @Cacheable(cacheNames = "anotherMessageCache", key = "#root.methodName")
    public String getAnotherMessage() {
        logger.info("=>>> Inside of getAnotherMessage() method witin a Service");

        return "Go to the Hell!";
    }

    @Override
    @Cacheable(cacheNames = "squareCache", key = "#number")
    public BigDecimal getSquare(Long number) {
        BigDecimal square = BigDecimal.valueOf(number)
                .multiply(BigDecimal.valueOf(number));
        logger.info("getSquare of {} is {}", number, square);

        return square;
    }
}
