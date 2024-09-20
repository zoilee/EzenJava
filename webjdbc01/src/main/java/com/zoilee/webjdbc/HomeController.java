package com.zoilee.webjdbc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoilee.webjdbc.model.MemberDto;
import com.zoilee.webjdbc.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private MemberService mem;
	
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
		mem.getAllMem(model);
	
		return "list";
		
	}
	@GetMapping("/write")
	public String writeMembers(Model model) {
		System.out.println("write 실행");
		return "write";
	}
	@PostMapping("/write")
	public String writePost(MemberDto dto, Model model) {
		System.out.println("write post 실행");
		int rs = 0;
		rs = mem.insertMem(dto);
		String alert="";
//		if(rs == 0 ) {
//			alert = "<script>alert('문제가 발생했습니다.');</script>";	
//		}
//		model.addAttribute("alert", alert );
		return "redirect:/list";
	
	};
	//HttpServletRequest request
	@GetMapping("/edit")
	public String editMembers(@RequestParam("num") int num, Model model) {
		System.out.println("edit 실행");
		mem.getMemByNum(num, model);
		return "edit";
	}
	@PostMapping("/edit")
	public String editPost(MemberDto dto, Model model) {
		System.out.println("edit post run");
		mem.updateMem(dto);
		System.out.println(dto);
		return "redirect:/list";
	}
	
	@GetMapping("/delete")
	public String deleteMembers(HttpServletRequest request, Model model) {
		System.out.println("delete 실행");
		int num = Integer.parseInt(request.getParameter("num"));
		mem.delMem(num);
		return "delete";
	}
	@GetMapping("/view")
	public String viewMember(HttpServletRequest request, Model model) {
		System.out.println("view 실행");
		mem.getMemByNum(Integer.parseInt(request.getParameter("userid")), model);
		//System.out.println(model.asMap());
		return "view";
	}
}
