package cliente;

import java.util.Scanner;

public class ClienteCalcula {
	
public static void main(String[] args){
	    Scanner ler = new Scanner(System.in);
	    CalculaFatorial calFat = new CalculaFatorialService().getCalculaFatorialPort();
       

        System.out.println("Digite um número para o calulo de seu fatorial: ");
        int num = ler.nextInt();
        
        	
        System.out.println("O fatorial do número " + num + " é = " + calFat.fatorial(num));     
       
    }
}
