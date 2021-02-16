package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * Created by jt on 12/26/19.
 */
@Controller
public class ConstructorInjectedController {
	private final GreetingService greetingService;

	// @Autowired --> is optional
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
