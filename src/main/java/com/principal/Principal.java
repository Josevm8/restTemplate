package com.principal;


import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.model.User;

public class Principal {
	
	private static final String URL_API_BOOKS =
            "http://localhost:8080/user/get/";
 
    public static void main(String[] args) {
    	RestTemplate restTemplate = new RestTemplate();
    	ResponseEntity<User> response =
                restTemplate.getForEntity(URL_API_BOOKS + "{id}", User.class, 1);
     
    System.out.println();
    System.out.println("GET StatusCode = " + response.getStatusCode());
    System.out.println("GET Headers = " + response.getHeaders());
    System.out.println("GET Body (object): " + response.getBody());
       
    }

}
