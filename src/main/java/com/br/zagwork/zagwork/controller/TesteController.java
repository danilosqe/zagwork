package com.br.zagwork.zagwork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/teste")
@RestController
public class TesteController {

	@GetMapping
	public String teste() {
		return "OK - DANILO CUSAO";
	}
}
