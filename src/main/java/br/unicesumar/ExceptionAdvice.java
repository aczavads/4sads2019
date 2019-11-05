package br.unicesumar;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvice {
		
	
	@ExceptionHandler({RuntimeException.class})
	public void tratarRuntimeException(RuntimeException ex) {
		System.out.println("Ulha! Uma runtime exception foi gerada! " + ex.getMessage());
	}
	
	@ExceptionHandler({SQLException.class})
	public void tratarSQLException(SQLException ex) {
		System.out.println("Ulha! Uma runtime exception foi gerada! " + ex.getMessage());
	}

}
