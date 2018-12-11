package com.min.encoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestEncoder {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodeString = encoder.encode("admin");
		System.out.println(encodeString);
	}
}
