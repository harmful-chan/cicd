package com.example.cicd;

import com.example.cicd.services.MyService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	MyService myService;

	@Test 
	void TestAdd(){
		int ret = myService.Add(100, 200);
		assert ret == 300;
	}
}
