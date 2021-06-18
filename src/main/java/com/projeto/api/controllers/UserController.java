package com.projeto.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.api.dtos.UserRequestDTO;
import com.projeto.api.dtos.UserResponseDTO;
import com.projeto.api.entities.User;
import com.projeto.api.repositories.UserRepository;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public ResponseEntity<List<UserResponseDTO>> getAllUsers() {
		List<User> users = userRepository.findAll();
		List<UserResponseDTO> responseUser = new ArrayList<>();
		for (User user : users) {
			responseUser.add(new UserResponseDTO(user));
		}
	    return ResponseEntity.ok(responseUser);
	}

	@PostMapping
	public ResponseEntity<UserResponseDTO> newUser(@RequestBody UserRequestDTO newUser) {
	    User user = userRepository.save(newUser.getUser());
	    return ResponseEntity.ok(new UserResponseDTO(user));
	}
}
