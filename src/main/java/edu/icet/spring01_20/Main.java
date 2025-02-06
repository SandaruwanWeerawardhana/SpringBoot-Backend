package edu.icet.spring01_20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication (exclude = DataSourceAutoConfiguration.class) => database auto configuration off
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}