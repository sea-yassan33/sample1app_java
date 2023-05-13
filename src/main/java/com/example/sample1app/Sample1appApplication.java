package com.example.sample1app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
public class Sample1appApplication {
	String[][] data = {
		{"noname","no email address","0"},
		{"taro","taro@sample.com","39"},
		{"hanako","hanako@sample.com","28"},
		{"sachiko","sachiko@sample.com","17"},
		{"jiro","jiro@change","6"}
	};
	public static void main(String[] args) {
		SpringApplication.run(Sample1appApplication.class, args);
	}

	@RequestMapping("/{num}")
	public String index(@PathVariable int num){
		int n = num < 0 ? 0 :num >= data.length ? 0 : num;
		String[] item = data[n];
		String msg = "ID=%s. {name: %s, mail: %s, age: %s}";
		return String.format(msg, num, item[0], item[1],item[2]);
	}
}