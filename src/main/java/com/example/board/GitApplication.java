package com.example.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitApplication.class, args);
		System.out.println("최초의 PUSH");
		System.out.println("두번째 PUSH");
		System.out.println("내려받기 테스트");
	}

}
