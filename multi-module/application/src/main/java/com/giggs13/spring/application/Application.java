package com.giggs13.spring.application;

import com.giggs13.spring.library.service.LibraryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackages = "com.giggs13.spring")
// @Import(LibraryService.class)
@RestController
public class Application {

    private final LibraryService libraryService;

    public Application(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/")
    public String getMessage() {
        System.out.println(libraryService.message());
        return libraryService.message();
    }
}
