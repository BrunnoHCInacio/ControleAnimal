package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PesagemController {
	@RequestMapping("/pesagem/novo")
	public String novo() {
		return "";
	}
}