/*public class testesJava{         (como imprimir algo)
    public static void main (String [] args){
        System.out.println("ola mundo");

    }
}*/

/*public class testesJava {            (como constrir variaveis)
    public static void main (String [] args) {
        System.out.println("ola de novo");
        
        int idade;
        idade = 37;
        System.out.println("a idade é "+ idade);
    }

}*/

/*public class testesJava {   
    public static void main (String [] args) {
        double salario;
        salario = 1000.50;
        int valor = (int) salario; //pois não entra naturalmente um double em um inteiro
        System.out.println(valor);

        //long numeroGrande = 9876543458L; //maior que isso se usa objeto
        //short numeroPequeno =3454;
        //byte b = 123;

    }

}*/

public class testesJava {
    public static void main (String [] args) {
        //char letra = 'a'; // guarda só um caracter 
        //System.out.println  (letra);

        System.out.println("testando condicionais");
        int idade = 15;
        int quantidadePessoas = 3;

        if (idade >= 18 || quantidadePessoas >= 2){
            System.out.println("Pode entrar");
        }
        else {System.out.println("Proibido entrada");

        }
        //variaveis boleanas
        boolean acompanhado;
        if (quantidadePessoas >= 2){
            acompanhado = true;
        }
        else{
            acompanhado = false;
        }
    }
}



