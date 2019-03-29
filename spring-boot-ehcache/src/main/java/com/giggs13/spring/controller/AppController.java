package com.giggs13.spring.controller;

import com.giggs13.spring.service.AppService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Slf4j
public class AppController {

    @Setter(onMethod_ = {@Autowired})
    private AppService appService;

    @GetMapping(path = "/message", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getMessage() {
        logger.info("=>>> Inside of getMessage() method within a Controller");

        return appService.getMessage();
    }

    @GetMapping(path = "/another-message", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getAnotherMessage() {
        logger.info("=>>> Inside of getAnotherMessage() method within a Controller");

        return appService.getAnotherMessage();
    }

    @GetMapping(path = "/square/{number}")
    public String getSquare(@PathVariable Long number) {
        logger.info("call appService to getSquare {}", number);

        return String.format("{\"getSquare\": %s}", appService.getSquare(number));
    }
}
