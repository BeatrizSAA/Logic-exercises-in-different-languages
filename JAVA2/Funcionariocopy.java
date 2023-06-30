public class Funcionariocopy {

private String nome;
private String cpf;
private double salario;
private int tipo = 0; // 0 - funcionario, 1 - gerente, 2 - diretor

// no construtor não precisa especificar o tipo de atributo que ele é, string, double, etc.


public double getBonificacao(){//funcionario
	if (this.tipo == 0){
        return this.salario * 0.1;
	}
	else if(this.tipo == 1){//gerente
        return this.salario;
	}
	else{
		return this.salario + 1000.00;//diretor
	}

}

    public void setTipo (int tipo) {
		this.tipo = tipo;
	}
		public int getTipo() {
		return this.tipo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}






}