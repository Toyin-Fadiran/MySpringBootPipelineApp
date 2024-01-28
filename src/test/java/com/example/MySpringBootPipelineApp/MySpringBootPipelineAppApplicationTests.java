package com.example.MySpringBootPipelineApp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MySpringBootPipelineAppApplicationTests {

	@Autowired
	private NewsController newsController;
	
	@Test
	void contextLoads() {
		assertNotNull(newsController);
	}

}
