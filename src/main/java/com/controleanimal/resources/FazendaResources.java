package com.controleanimal.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fazendas")
public class FazendaResources {
	@RequestMapping(value = "/novo",method = RequestMethod.GET)
	public String novo() {
		return "";
	}
}
