package com.examen.cloud.demojhuacaniclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/usuario/client/{userid}")
public class ResponderUsuario {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String usuario(@PathVariable("userid") String userid) {
		String url ="http://demojhuacani-server/rest/usuario/server/"+userid;		
		return restTemplate.getForObject(url,String.class);
	}
}
