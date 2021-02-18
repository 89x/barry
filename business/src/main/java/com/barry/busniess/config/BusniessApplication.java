package com.barry.busniess.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.barry")
@MapperScan("com.barry.server.mapper")
public class BusniessApplication {
    private static final Logger LOG = LoggerFactory.getLogger(BusniessApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BusniessApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("Busniess地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}
