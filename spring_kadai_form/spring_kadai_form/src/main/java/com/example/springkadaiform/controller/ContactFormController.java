package com.example.springkadaiform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springkadaiform.form.ContactForm;

@Controller
public class ContactFormController {

	@GetMapping("/form")
	public String showView(@ModelAttribute ContactForm form) {
		return "contactFormView";
	}
	
	@PostMapping("/confirm")
	public String confirm(@Validated
			@ModelAttribute ContactForm form,
			BindingResult result) {
		
		if(result.hasErrors()) {
			return "contactFormView";
		}
		return "confirmView";
	}
}
