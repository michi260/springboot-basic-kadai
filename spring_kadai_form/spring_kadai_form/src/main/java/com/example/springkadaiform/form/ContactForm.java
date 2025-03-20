package com.example.springkadaiform.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class ContactForm {

	@NotNull(message="お名前を入力してください。")
	private String name;
	
	@NotNull(message="メールアドレスを入力してください。")
	@Email(message="メールアドレスの入力形式が正しくありません。")
	private String email;
	
	@NotNull(message="お問い合わせ内容を入力してください。")
	private String message;
}
