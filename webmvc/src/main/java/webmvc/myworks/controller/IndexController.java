package webmvc.myworks.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("index controller  가 실행됨");
		ModelAndView mv = new ModelAndView();
		mv.addObject("data","반갑다,  나는 스프링MVC다");
		mv.setViewName("index");
		return mv;
	}

}
