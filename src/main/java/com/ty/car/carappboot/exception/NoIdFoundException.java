package com.ty.car.carappboot.exception;

public class NoIdFoundException extends RuntimeException {
	private String message = "Given ID does not exist";
	
	public NoIdFoundException() {
		
	}
	
	public NoIdFoundException(String message) {
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
