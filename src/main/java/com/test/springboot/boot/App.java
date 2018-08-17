package com.test.springboot.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
public class App {
	@RequestMapping("/")
	public String hello() {
		return "Hello world!";
	}
}
