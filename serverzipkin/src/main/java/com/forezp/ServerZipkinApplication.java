package com.forezp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * Created by sgyz(上官永忠) on 2017/12/12.
 */
@SpringBootApplication
@EnableZipkinServer
public class ServerZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerZipkinApplication.class, args);
    }
}
