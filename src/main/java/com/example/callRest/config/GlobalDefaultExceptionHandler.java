package com.example.callRest.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalDefaultExceptionHandler extends RuntimeException {
	
	public static final String DEFAULT_ERROR_VIEW = "errorPage";
	private static final long serialVersionUID = 1L;
	
	@ExceptionHandler(value = Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {

		e.printStackTrace();
		if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null)
			throw e;
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.addObject("url", req.getRequestURL());
		mav.setViewName(DEFAULT_ERROR_VIEW);
		
//		return errorPage;
		return mav;
	}
	
	@ExceptionHandler(value = NumberFormatException.class)
	public ResponseEntity<Object> defaultNumberFormatException(NumberFormatException e) {

		e.printStackTrace();
		
//		if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null)
//			throw e;
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("exception", e);
//		mav.addObject("url", req.getRequestURL());
//		mav.setViewName(DEFAULT_ERROR_VIEW);
//		return errorPage;
//		return mav;
		
		return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
	}
}

