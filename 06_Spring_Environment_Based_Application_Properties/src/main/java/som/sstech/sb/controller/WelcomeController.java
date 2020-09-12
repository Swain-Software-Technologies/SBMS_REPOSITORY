package som.sstech.sb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@Value("${custom.prop}")
	private String var;
	
	@GetMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("name","Welcome To Spring Boot");
		return "welcomestatic";
	}
	@RequestMapping("/welcome/prop")
	public String welcomePro(Model model) {
		model.addAttribute("name",var);
		return "welcomedynamic";
	}
}
