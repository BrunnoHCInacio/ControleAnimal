package com.controleanimal.resources;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animais")
public class AnimalResources {
	
	@RequestMapping(value="/novo", method = RequestMethod.GET)
	public String novo() {
		return "cadastro-animaisFoda";
	}



	/*@RequestMapping(method = RequestMethod.POST)
	public String salvar(Animal animal) {

		return "cadastro-animais";
	}*/
}
