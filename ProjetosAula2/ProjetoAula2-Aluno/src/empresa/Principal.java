package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Avaliacao mario = new Avaliacao(7,4,10);
		System.out.println("Media Aritmetica do Mario: " + mario.mediaAritmetica());
		System.out.println("Media Ponderada do Mario: " + mario.mediaPonderada());
		
		Avaliacao luigi = new Avaliacao();
		luigi.n1=8;
		luigi.n2=3;
		luigi.n3=7.5;
		
		System.out.println("Media Aritmetica do Luigi: " + luigi.mediaAritmetica());
		System.out.println("Media Ponderada do Luigi: " + luigi.mediaPonderada());
	}
}