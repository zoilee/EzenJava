package com.zoilee.webjdbc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("home.jsp 실행됨");
		System.out.println("db 접속 성공");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@GetMapping("/list")
	public String listMembers(Model model) {
		System.out.println("list 실행");
		return "list";
	}
	@GetMapping("/write")
	public String writeMembers(Model model) {
		System.out.println("write 실행");
		return "write";
	}
	@GetMapping("/edit")
	public String editMembers(Model model) {
		System.out.println("edit 실행");
		return "edit";
	}
	@GetMapping("/delete")
	public String deleteMembers(Model model) {
		System.out.println("delete 실행");
		return "delete";
	}
	
}
