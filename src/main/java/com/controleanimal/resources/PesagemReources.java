package com.controleanimal.resources;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pesagens")
public class PesagemReources {
	@RequestMapping(value = "novo", method = RequestMethod.GET)
	public String novo() {
		return "";
	}
}
