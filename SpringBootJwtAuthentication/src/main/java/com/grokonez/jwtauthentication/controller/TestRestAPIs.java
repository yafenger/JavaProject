package com.grokonez.jwtauthentication.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TestRestAPIs {
	
	@GetMapping("/api/test/employee")
	@PreAuthorize("hasRole('Employee') or hasRole('Admin')")
	public String employeeAccess() {
		return ">>> User Contents!";
	}

	@GetMapping("/api/test/manager")
	@PreAuthorize("hasRole('Manager') or hasRole('Admin')")
	public String managerAccess() {
		return ">>> Project Management Board";
	}

	@GetMapping("/api/test/owner")
	@PreAuthorize("hasRole('Shopowner') or hasRole('Admin')")
	public String mangerAccess() {
		return ">>> Project Management Board";
	}
	
	@GetMapping("/api/test/admin")
	@PreAuthorize("hasRole('Admin')")
	public String adminAccess() {
		return ">>> Admin Contents";
	}
}