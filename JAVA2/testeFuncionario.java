public class testeFuncionario {
    public static void main (String [] args){

        Funcionario nico = new Funcionario();
        nico.setNome("Nico Silva");
        nico.setCpf("123456789");
        nico.setSalario(2600.00);

        Funcionariocopy f0 = new Funcionariocopy();
        f0.setSalario(3000.0);
        System.out.println(f0.getTipo());
        System.out.println(f0.getBonificacao());

        Funcionariocopy f1 = new Funcionariocopy();
        f1.setTipo(2);
        f1.setSalario(5000.00);
        System.out.println(f1.getTipo());
        System.out.println(f1.getBonificacao());





    }


}