package empresa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Conta c1 = new Conta(111,"Mario",2000,500);
		
		c1.info();
		
		if(!c1.sacar(2000)) {
			System.out.println("Problema ao sacar");
		}
		if(!c1.depositar(-500)) {
			System.out.println("Problema ao depositar");
		}
		c1.info();
		
		
		Conta c2 = new Conta(222,"Luigi",4000,600);
		
		c1.transferir(c2, 2000);
		c1.info();
		c2.info();
	
	}
	
}
