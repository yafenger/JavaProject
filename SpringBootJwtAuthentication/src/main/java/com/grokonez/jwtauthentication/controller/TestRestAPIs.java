package com.grokonez.jwtauthentication.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TestRestAPIs {
	
	@GetMapping("/api/test/employee")
	@PreAuthorize("hasRole('EMPLOYEE') or hasRole('ADMIN')")
	public String employeeAccess() {
		return ">>> User Contents!";
	}

	@GetMapping("/api/test/manager")
	@PreAuthorize("hasRole('MANAGER') or hasRole('ADMIN')")
	public String managerAccess() {
		return ">>> Project Management Board";
	}

	@GetMapping("/api/test/owner")
	@PreAuthorize("hasRole('SHOPOWNER') or hasRole('ADMIN')")
	public String mangerAccess() {
		return ">>> Project Management Board";
	}

	@GetMapping("/api/test/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return ">>> Admin Contents";
	}
}