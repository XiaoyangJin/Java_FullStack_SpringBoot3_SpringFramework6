package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //tell that this is a spring bean
public class SayHelloController {
	//"say-hello" => "Hello! What are you learning today?"
	
	@RequestMapping("say-hello")
	@ResponseBody //instead of return a view
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody //instead of return a view
	public String sayHelloHtml() {
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First HTML Page </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My First html page hello!");
		sb.append("</body>");
		sb.append("</html>");
		
		
		return sb.toString();
	}
}
