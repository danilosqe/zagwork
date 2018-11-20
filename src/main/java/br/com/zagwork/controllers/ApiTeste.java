package br.com.zagwork.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;


import io.swagger.annotations.Api;


@RestController
@CrossOrigin
@RequestScope
@RequestMapping(value = "/teste", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "TESTE", tags = {"TESTE API"})
public class ApiTeste {
	

}
