package JAVA;
public class Conta {

      //atributos
   private double saldo; //0
   private int agencia; //0
   private int numero; //0
   private Cliente titular; // referencia para informações do cliente
   private static int total;

   //construtor para iniciar tudo
   public Conta(int agencia, int numero){
      Conta.total++;
      System.out.println("O total de contas é " + Conta.total);
      this.agencia = agencia;
      this.numero = numero;
      this.saldo = 100;
      System.out.println("Estou criando a conta:  " + this.numero);
   }
 //comportamentos = metodo
// o void é para explicar que não vai retornar nada apos o comportamento, o double pq é obrif=gatorio explicar o tipo de variavel e valor que estamos recebendo. 
 //this é para especificar que é para o objeto chamado junto com a função, uma conta especifica
   public void deposita (double valor){
      this.saldo +=  valor;
   }
   public boolean saca(double valor ){
      if (this.saldo >= valor){
      this.saldo -= valor;
      return true;
      }
      return false;
   }

   public boolean transfere (double valor, Conta destino){
      if (this.saldo >= valor){
         this.saldo -= valor;
         destino.deposita(valor);
         return true;
      }
      return false;
   }
//getSaldo procura o saldo
   public double getSaldo () {
      return this.saldo;
   }
//get imprime o numero
   public int getNumero() {
      return this.numero;
   }
   
   //set altera
   public void setNumero(int numero) {
      if (numero <= 0){
         System.out.println("não pode valor menor que igual a 0");
         return;
      }
      this.numero = numero;
      }
      
   public int getAgencia() {
       return this.agencia;
   }

   public void setAgencia(int agencia) {
      if(agencia <= 0 ){
         System.out.println("não pode valor menor que igual a 0");
         return;
      }
      this.agencia = agencia;
   }

   public void setTitular(Cliente titular) {
       this.titular = titular;
   }

   public Cliente getTitular() {
       return titular;
   }

   public static int getTotal() {
       return Conta.total;
   }//(Nome da conta + .getTotal());




   }






