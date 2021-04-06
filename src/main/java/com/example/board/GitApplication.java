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
		System.out.println("다시 올리기");
		System.out.println("마지막 테스트");
		System.out.println("이건 원격 저장소에만 등록");
	}

}
