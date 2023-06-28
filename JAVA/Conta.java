package JAVA;
public class Conta {

      //atributos
   double saldo; //0
   int agencia; //0
   int numero; //0
   String titular; //string fica "??"

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

      else { return false;
      }

   }


}

