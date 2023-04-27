package com.example.demo.service;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.model.PostModel;
import com.example.demo.model.PostResponseModel;
import com.example.demo.model.UserModel;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	RestTemplate restTemplate;

	@Override
	public Object getCustomPosts() {

		final List<UserModel> userModel = getAllUsers();
		final List<PostModel> postModel = getAllPosts();

		Map<Long, PostModel> postMap = postModel.stream()
				.collect(Collectors.toMap(PostModel::getId, Function.identity()));

		List<PostResponseModel> customModelResponseList = userModel.stream().map(user -> {
			PostModel post = postMap.get(user.getId());
			return new PostResponseModel(user.getId(), post.getTitle(), post.getBody(), user.getAddress().getGeo(),
					user.getCompany().getName());
		}).collect(Collectors.toList());

		return customModelResponseList;
	}

	private List<UserModel> getAllUsers() {
		final URI builder = UriComponentsBuilder.fromHttpUrl("https://jsonplaceholder.typicode.com/users").build("");
		final ResponseEntity<List<UserModel>> responseEntity = restTemplate.exchange(builder.toString(), HttpMethod.GET,
				getHeader(), new ParameterizedTypeReference<List<UserModel>>() {
				});
		return responseEntity.getBody();
	}

	private List<PostModel> getAllPosts() {
		final URI builder = UriComponentsBuilder.fromHttpUrl("https://jsonplaceholder.typicode.com/posts").build("");
		final ResponseEntity<List<PostModel>> responseEntity = restTemplate.exchange(builder.toString(), HttpMethod.GET,
				getHeader(), new ParameterizedTypeReference<List<PostModel>>() {
				});
		return responseEntity.getBody();
	}

	private HttpEntity<String> getHeader() {
		final HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		return new HttpEntity<>(headers);
	}

}
