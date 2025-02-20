package com.example.demo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ArithmeticException.class)
    public ModelAndView handleArithmeticException(ArithmeticException ex) {
        ModelAndView modelAndView = new ModelAndView("error"); // Redirects to "error.html"
        modelAndView.addObject("error", ex.getMessage());
        return modelAndView;
    }
}
