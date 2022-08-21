package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
  public String home() {
    return "Hello Docker World!";
  }

   @RequestMapping("/")
   public String home() {
    return "Hello Docker World!";
  }

@RequestMapping("/")
  public int method(){
	public string mySring;
	return 1 ;
  }

@RequestMapping("/")
   public String welcome() {
    return "Welcome Home";
  }
}
