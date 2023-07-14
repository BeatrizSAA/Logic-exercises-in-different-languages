package ProjetoCofre;

import java.util.Scanner;

 public class MenuCofre {

    private Scanner Teclado;
    private Cofrinho cofrinho;

    public MenuCofre (){
        Teclado = new Scanner (System.in);
        cofrinho = new Cofrinho();
    }

    public void opcoesDoCofre(){ 

        System.out.println("1. Adicionar moeda");
        System.out.println("2. Remover moeda");
        System.out.println("3. Listar moedas");
        System.out.println("4. Calcular valor total em reais");
        System.out.println("0. Encerar");

        String opcaoSelecionada = Teclado.next();

        System.out.println("Voce Selecionou a opção " + opcaoSelecionada);

        switch (opcaoSelecionada){ //caso designado para cada opção escolhida
            case "0":
                System.out.println("Encerrando sistema...");
                break;

            case "1":
                opcoesDeAdicao(); //se encontra ao final da pagina
                opcoesDoCofre();
                break;

                
            case "2":
                opcoesDeRemocao(); //se encontra ao final da pagina
                opcoesDoCofre();
                break;

            case "3":
                cofrinho.ListarMoedas();
                opcoesDoCofre();
                break;

            case "4":
            double valorTotalConvertido = cofrinho.totalConvertido();
                System.out.println("O valor total em reais é: " +valorTotalConvertido);
                opcoesDoCofre();
                break;

            default:
                System.out.println("Opção invalida");
                opcoesDoCofre();
                break;

    
        }

       
    }

    private void opcoesDeAdicao(){

        System.out.println("Escolha a moeda a ser depositada: ");
                System.out.println("1- Real");
                System.out.println("2- Dolar");
                System.out.println("3- Euro");
                
                int opcaoMoeda = Teclado.nextInt();
                System.out.println("Voce selecionou: " +opcaoMoeda);
                System.out.println("Digite o valor: ");

                String quantidadeMoeda = Teclado.next();
                quantidadeMoeda = quantidadeMoeda.replace(",", "."); //para evitar problemas de compatibilidade
                double quantidadeMoedaNovo = Double.valueOf(quantidadeMoeda);
                System.out.println("O valor depoistado foi: " + quantidadeMoedaNovo);
                
                Moeda moeda = null;

                if (opcaoMoeda ==1) {
                     moeda = new Real(quantidadeMoedaNovo);
                }
                else if (opcaoMoeda == 2){
                     moeda = new Dolar(quantidadeMoedaNovo);
                }
                else if (opcaoMoeda == 3){
                     moeda = new Euro (quantidadeMoedaNovo);
                }
                else{System.out.println("Opção invalida");
                opcoesDoCofre();
            }
                
                cofrinho.adicionarMoedas(moeda);
                System.out.println("Moeda adicionada");
    }

    private void opcoesDeRemocao() {
        
            System.out.println("Escolha a moeda a ser removida: ");
                System.out.println("1- Real");
                System.out.println("2- Dolar");
                System.out.println("3- Euro");
                
                int opcaoMoeda = Teclado.nextInt();
                System.out.println("Voce selecionou: " + opcaoMoeda);
                System.out.println("Digite o valor da moeda: ");

                String quantidadeMoeda = Teclado.next();
                quantidadeMoeda = quantidadeMoeda.replace(",", ".");
                double quantidadeMoedaNovo = Double.valueOf(quantidadeMoeda);
                System.out.println("O valor Retirado foi: " + quantidadeMoedaNovo);
                
                Moeda moeda = null;

                if (opcaoMoeda ==1) {
                     moeda = new Real(quantidadeMoedaNovo);
                }
                else if (opcaoMoeda == 2){
                     moeda = new Dolar(quantidadeMoedaNovo);
                }
                else if (opcaoMoeda == 3){
                     moeda = new Euro (quantidadeMoedaNovo);
                }
                else{System.out.println("Opção invalida");
                opcoesDoCofre();
            }

                boolean removeuMoeda = cofrinho.removerMoedas(moeda);                
                    if(removeuMoeda) {
                    System.out.println("Moeda removida com sucesso");
                }
                    else{System.out.println("Moeda não encontrada");

                    }
                }
            }
        





