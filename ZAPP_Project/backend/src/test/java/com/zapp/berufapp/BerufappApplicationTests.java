package com.zapp.berufapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class BerufappApplicationTests {

	@Test
	void contextLoads() {
		assertEquals("true", true, true);
	}

}
