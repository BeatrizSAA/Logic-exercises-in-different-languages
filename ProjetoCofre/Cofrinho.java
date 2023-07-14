package ProjetoCofre;

import java.util.ArrayList;

public class Cofrinho { //lista central de todos os metodos do cofre

    private ArrayList <Moeda> listadeMoedas;

    public Cofrinho(){
        this.listadeMoedas = new ArrayList<>();
    }

    public void adicionarMoedas(Moeda moeda){
        this.listadeMoedas.add(moeda);
    }

    public boolean removerMoedas(Moeda moeda){
        return this.listadeMoedas.remove(moeda);
    }

    public void ListarMoedas(){

        if (this.listadeMoedas.isEmpty()){
             System.out.println("O cofrinho esta vazio");
             return;
        }
        for (Moeda moeda: this.listadeMoedas){
             moeda.info();

        }
    }
    public double totalConvertido() {
        if (this.listadeMoedas.isEmpty()){
        return 0;
        }

        double valorConvertido = 0;

        for (Moeda moeda: this.listadeMoedas){
             valorConvertido = valorConvertido + moeda.converter();
        }
        return valorConvertido;
    }

}
