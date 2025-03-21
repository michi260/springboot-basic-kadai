package com.example.springkadaiform.controller;

import org.springframework.core.Conventions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.springkadaiform.form.ContactForm;

@Controller
public class ContactFormController {

	@GetMapping("/form")
	public String showView(Model model) {
//		初期表示の時にイフ文の中身が実行される
		if(!model.containsAttribute("contactForm")) {
		model.addAttribute("contactForm",new ContactForm());//初期表示なので、新しい空のフォームを作る
		
		}
		return "contactFormView";
	}
	
	@PostMapping("/confirm")
	public String confirm(Model model,
			RedirectAttributes redirectAttributes,
			@Validated
			ContactForm form,
			  //指定の場所に送る,エラーを出しつつ
			BindingResult result) {
		
		if(result.hasErrors()) {
//			ポストで送られてきた入力内容をリダイレクト先に渡す　　　　
//入力画面の内容をそのまま引き継ぐため
			redirectAttributes.addFlashAttribute("contactForm",form); 
//	redirectAttributusを使うと、いきたい先のメソットに直接飛ばす。新しく画面に飛ぶとクリアされるから、
//			ユーザーが入力して送信する直前の状態に保つ。（入力内容は保持される。）"redirect:/form"
			
			
			redirectAttributes.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX           
					+Conventions.getVariableName(form), result);
			return "redirect:/form";//画面を指定
		}
		model.addAttribute("contactForm",form);
		
		return "confirmView";
	}
}
