package com.jaydeep.projects.au;

import org.junit.jupiter.api.Test;

public class TestUserBuilder {

	@Test
	public void test() {
		User user = new UserBuilder().setId(0).setName("JD").build();
		System.out.println(user);
	}

}
