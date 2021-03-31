package com.shopping.terminal.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.shopping.terminal.dto.ErrorMessage;

@ControllerAdvice
public class TerminalExceptionsHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value= {Exception.class})
	public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest req){
		
		String erroMessage = ex.getLocalizedMessage();
		
		if (erroMessage.isEmpty()) erroMessage = ex.toString();
		
		ErrorMessage errorMsgVo = new ErrorMessage(new Date(),  "Exception:" + erroMessage);
		
		return new ResponseEntity<>(errorMsgVo, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value= {InvalidPricingException.class})
	public ResponseEntity<Object> handleInvalidPricingException(Exception ex, WebRequest req){
		
		String erroMessage = ex.getLocalizedMessage();
		
		if (erroMessage.isEmpty()) erroMessage = ex.toString();
		
		ErrorMessage errorMsgVo = new ErrorMessage(new Date(),  erroMessage);
		
		return new ResponseEntity<>(errorMsgVo, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
