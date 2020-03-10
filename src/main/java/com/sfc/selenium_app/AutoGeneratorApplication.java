package com.sfc.selenium_app;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sfc.selenium_app")
@MapperScan("com.sfc.selenium_app")
public class AutoGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoGeneratorApplication.class, args);
	}

	/**
	 * 设置分页插件
	 * @return
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}

}
