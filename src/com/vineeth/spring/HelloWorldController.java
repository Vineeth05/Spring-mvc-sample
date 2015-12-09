package com.vineeth.spring;

import java.io.IOException;
import javax.servlet.http.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
 
    @RequestMapping("Hello")
    public ModelAndView helloWorld() 
    {
    	
       System.out.println("in controller");
        String message = "Hello World, Spring 3.0!";
        return new ModelAndView("Hello", "message", message);
    }

    @RequestMapping("/")
    public ModelAndView helloWorld1() 
    {
    	
       /*System.out.println("in controller");
        String message = "Hello World, Spring 3.0!";
        return new ModelAndView("Hello", "message", message);*/
    	return new ModelAndView("index");
    }
}