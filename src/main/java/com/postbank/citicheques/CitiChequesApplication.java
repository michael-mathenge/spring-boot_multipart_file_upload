package com.postbank.citicheques;

import com.postbank.citicheques.service.FilesStorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class CitiChequesApplication implements CommandLineRunner {
    @Resource
    FilesStorageService storageService;

    public static void main(String[] args) {

        SpringApplication.run(CitiChequesApplication.class, args);
    }

    @Override
    public void run(String... arg) throws Exception {
        storageService.deleteAll();
        storageService.init();
    }
}
