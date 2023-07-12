package ProjetoCofre;

import java.util.Scanner;

 public class Menu {

    private Scanner Teclado;

    public Menu (){
        Teclado = new Scanner (System.in);
    }

    public void opcoesDoCofre(){

        System.out.println("1. Adicionar moeda");
        System.out.println("2. Remover moeda");
        System.out.println("3. Listar moedas");
        System.out.println("4. Calcular valor total em reais");
        System.out.println("0. Encerar");

        String opcaoSelecionada = Teclado.next();

        System.out.println("Voce Selecionou a opção " + opcaoSelecionada);

        switch (opcaoSelecionada){
            case "0":
                break;

            case "1":
            



        }
    }



}

