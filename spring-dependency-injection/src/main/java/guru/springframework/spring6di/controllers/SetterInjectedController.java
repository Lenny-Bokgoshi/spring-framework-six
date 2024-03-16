package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

public class SetterInjectedController {
    // Not Optimal
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
