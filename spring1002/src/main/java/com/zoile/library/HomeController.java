package com.zoile.library;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoile.library.model.BookDto;
import com.zoile.library.service.BookService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	  @InitBinder
	    public void initBinder(WebDataBinder binder) {
	        binder.registerCustomEditor(LocalDateTime.class, new PropertyEditorSupport() {
	            private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");

	            @Override
	            public void setAsText(String text) {
	                if (text != null && !text.isEmpty()) {
	                    setValue(LocalDateTime.parse(text, formatter));
	                } else {
	                    setValue(null);
	                }
	            }
	        });
	    }
	@Autowired
	private BookService book;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		System.out.println("home.jsp 실행됨");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@GetMapping("/list")
	public String listBooks(Model model) {
		System.out.println("list 실행");
		book.getAllBook(model);
		return "list";
		
	}
	@GetMapping("/write")
	public String writeBooks(Model model) {
		System.out.println("write 실행");
		return "write";
	}
	@PostMapping("/write")
	public String writePost(BookDto dto, Model model) {
		System.out.println("write post 실행");
		book.insertBook(dto);
		return "redirect:/list";
	
	};
	//HttpServletRequest request
	@GetMapping("/edit")
	public String editBooks(@RequestParam("bookId") int BookId, Model model) {
		System.out.println("edit 실행");
		
		
		book.getBookByid(BookId, model);
		
		return "edit";
	}
	@PostMapping("/edit")
	public String editPost(BookDto dto, Model model) {
		System.out.println("edit post run");
		book.updateBook(dto);
		System.out.println(dto);
		return "redirect:/list";
	}
	
	@GetMapping("/delete")
	public String deleteBooks(HttpServletRequest request, Model model) {
		System.out.println("delete 실행");
		int bookid = Integer.parseInt(request.getParameter("bookId"));
		book.delBook(bookid);
		return "redirect:/list";
	}

}
