package com.jimm0063.magi.music;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConnectMusicPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectMusicPlatformApplication.class, args);
	}

}
