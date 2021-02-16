package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.service.GreetingService;

public class PropertyInjectedController {

	public GreetingService greetingService;

	public String getGreeting() {
		return greetingService.greet();
	}
}
