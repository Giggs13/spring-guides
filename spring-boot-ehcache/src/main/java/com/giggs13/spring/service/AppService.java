package com.giggs13.spring.service;

import java.math.BigDecimal;

public interface AppService {

    String getMessage();

    String getAnotherMessage();

    BigDecimal getSquare(Long number);
}
