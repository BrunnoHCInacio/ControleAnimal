package controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import models.Animal;
import repository.Animais;

@Controller
@RequestMapping("/animais")
public class AnimalController {
	
	@Autowired
	private Animais animais;
	
	@RequestMapping("/novo")
	public String novo() {
		return "cadastro-animais";
	}
	@RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
	public String salvar(Animal animal) {
		animais.save(animal);
		return "cadastro-animais";
	}
}
