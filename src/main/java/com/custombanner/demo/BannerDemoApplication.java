package com.custombanner.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BannerDemoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BannerDemoApplication.class);
		app.setBanner(new com.custombanner.demo.custom.CustomBanner());
		app.setLogStartupInfo(false);
		app.run(args);
	}
}
