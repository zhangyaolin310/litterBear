package com.zhang.mgc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhang.mgc.dao.mapper")
public class LittlrBearApplication {

	public static void main(String[] args) {
		SpringApplication.run(LittlrBearApplication.class, args);
	}

}
