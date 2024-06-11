package org.sai.controller;

import org.sai.service.Flames_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MailController {
	
	@Autowired
	public Flames_service help;
	
	@Autowired
	public JavaMailSender mailsender;
	
	String out=null;
	String name1=null;
	
	@RequestMapping("/uinput")
	public String Uinput(Model m)
	{
//		System.out.println("hello sai -its working");
		return "userInput";
	}
	
	
	
	@RequestMapping("/gdata")
	public String data(@RequestParam(name = "n1") String n1, @RequestParam(name = "n2") String n2,@RequestParam(name="em") String email, Model m) {

		String resut = help.falmes(n1, n2);
           out=email;
         name1=n1;
		m.addAttribute("data", resut);
		m.addAttribute("n1", n1);
		m.addAttribute("n2", n2);
		return "display";

	}
	
	@RequestMapping("/email")
	public String  SendEmail( Model m)
	{
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setTo(out);
		smm.setText("Flames Project Source code Repositroy Link.....\nhttps://gitlab.com/sainagendra/flames_project/-/tree/flames_Mail?ref_type=heads");
		smm.setSubject("Flames_project Source code");
		mailsender.send(smm);
		m.addAttribute("res",  name1+  ".........");
		return "output2";
		
	}

}
