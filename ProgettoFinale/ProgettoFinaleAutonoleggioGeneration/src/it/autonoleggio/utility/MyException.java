package it.autonoleggio.utility;

public class MyException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private String str; 
	
	public MyException(String str) {
		this.str=str;
	}
	
	@Override
	public String toString() {
		return str;
	}

}
