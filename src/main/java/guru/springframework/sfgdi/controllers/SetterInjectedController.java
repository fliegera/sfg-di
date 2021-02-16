package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.service.GreetingService;

public class SetterInjectedController {

	private GreetingService greetingService;

	/**
	 * @param greetingService the greetingService to set
	 */
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.greet();
	}
}
