package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.service.GreetingService;

public class ConstructorInjectedController {

	private final GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.greet();
	}
}
