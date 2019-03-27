package com.giggs13.spring.library.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "library-service.message=Hello")
public class LibraryServiceTest {

    @Autowired
    private LibraryService myService;

    @Test
    public void contextLoads() {
        assertThat(myService.message()).isNotNull();
    }

    @SpringBootApplication
    static class TestConfiguration {
    }
}
