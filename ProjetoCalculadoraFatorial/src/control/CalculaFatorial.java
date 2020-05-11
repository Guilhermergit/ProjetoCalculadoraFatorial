package control;

import java.util.Scanner;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class CalculaFatorial {

	@WebMethod
	public int fatorial(@WebParam(name="num") int num) {
	       int fat = 1;

	        	for(int i = 1;i <= num; i++){
	                fat = fat * i;
	            }
	            
	        	return fat;
	    }
}
