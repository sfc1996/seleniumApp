package com.sfc.auto_generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sfc.auto_generator")
@MapperScan("com.sfc.auto_generator")
public class AutoGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoGeneratorApplication.class, args);
	}

}
