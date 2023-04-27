package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {

	@Autowired
	PostService postService;

	@GetMapping("/custom-posts")
	ResponseEntity<Object> getCustomPosts() {
		return ResponseEntity.ok(postService.getCustomPosts());
	}

}
