package com.taolue.baoxiao.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class BaoxiaoEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaoxiaoEurekaApplication.class, args);
	}
}
