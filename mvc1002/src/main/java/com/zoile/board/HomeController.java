package com.zoile.board;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoile.board.model.BoardDto;
import com.zoile.board.service.BoardService;
import com.zoile.board.util.Paging;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private BoardService board;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@GetMapping("/list")
	public String listBoard(@RequestParam(defaultValue = "1") int pg, Model model) {
		int recordsPerPage = 10;
	    int totalRecords = board.getTotalBoardCount();

	    // pg가 1보다 작을 경우 1로 설정
	    if (pg < 1) {
	        pg = 1;
	    }

	    int limit = (pg - 1) * recordsPerPage;

	    List<BoardDto> boardList = board.getAllBoard(limit, recordsPerPage);
	    model.addAttribute("list", boardList);

	    Paging paging = new Paging(totalRecords, recordsPerPage, pg, 10);
	    model.addAttribute("paging", paging);

	    return "list";
	}
	@GetMapping("/write")
	public String writeBoard(Model model) {
		System.out.println("write 실행");
		return "write";
	}
	@PostMapping("/write")
	public String writePost(BoardDto dto, Model model) {
		System.out.println("write post 실행");
		board.insertBoard(dto);
		System.out.println(dto);
		return "redirect:/list";
	
	};
	//HttpServletRequest request
	@GetMapping("/edit")
	public String editBoard(@RequestParam("id") int id, Model model) {
		System.out.println("edit 실행");
		board.getBoardById(id, model);
		return "edit";
	}
	@PostMapping("/edit")
	public String editPost(BoardDto dto, Model model) {
		System.out.println("edit post run");
		board.updateBoard(dto);
		System.out.println(dto);
		return "redirect:/list";
	}
	
	@GetMapping("/delete")
	public String deleteBoard(HttpServletRequest request, Model model) {
		System.out.println("delete 실행");
		int id = Integer.parseInt(request.getParameter("id"));
		board.delBoard(id);
		return "redirect:/list";
	}
	@ExceptionHandler(NumberFormatException.class)
    public String handleNumberFormatException(NumberFormatException ex, Model model) {
        model.addAttribute("error", "잘못된 요청입니다.");
        return "error"; // 에러 페이지로 리턴
    }
	@GetMapping("/view")
    public String viewBoard(@RequestParam("id") String idStr, Model model) {
        int id;
        try {
            id = Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
            return "redirect:/list"; // 잘못된 값일 경우 리스트 페이지로 리다이렉트
        }
        
        try {
            board.getBoardById(id, model);
        } catch (EmptyResultDataAccessException e) {
            return "redirect:/list"; // 게시글이 없을 경우 리스트로 리다이렉트
        }
        
        return "view"; // 정상적으로 게시글이 있을 경우 view 페이지로
    }
}
