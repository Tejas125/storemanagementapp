package com.shivtejworld.storemanagementapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StoremanagementappApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoremanagementappApplication.class, args);
		System.out.println("Current User: " + getCurrentUser());

	}

	public static String getCurrentUser() {
		// In a real application, you would retrieve the current user from the security
		// context or session
		// For this example, we will return a hardcoded username
		return "admin"; // Replace with actual logic to get the current user
	}

}
