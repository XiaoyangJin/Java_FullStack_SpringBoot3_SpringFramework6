package com.in28minutes.learndocker;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloWorldController {

	@GetMapping(path = "/")
	public String helloWorld() {
		// Implemented using String Templates
        return """
                { message: Hello World Java v1 }
               """;
    }
}
