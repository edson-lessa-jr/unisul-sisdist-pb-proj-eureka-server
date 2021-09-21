package br.unisul.aula.projeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ProjEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjEurekaServerApplication.class, args);
    }

}
