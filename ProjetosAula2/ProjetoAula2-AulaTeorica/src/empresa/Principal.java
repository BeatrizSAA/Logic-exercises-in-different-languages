package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.matricula=1001;
		a.nome="Super Mario";
		a.cpf="111222333";
		a.info();
		
/*		System.out.println("Matricula: " + a.matricula);
		System.out.println("Nome: " + a.nome);
		System.out.println("CPF: " + a.cpf);
*/		
		a.nome="Super Luigi";
		
		a.info();
		
		Aluno b = new Aluno();
		b.matricula=1002;
		b.nome="Yoshi";
		b.cpf="777222555";
		b.info();
		
		//Tema 3
		
		Carro c  = new Carro();
		
		//Carro.PI = 70;
		System.out.println(Carro.milhasParaMetros(10));
		
		
		//Tema 4
		
		Turma nova = new Turma();
		nova.prof  = new Professor();
		nova.prof.nome = "Leonardo";
		nova.alunos = new ArrayList<Aluno>();
		nova.alunos.add(new Aluno());
		nova.alunos.get(0).nome="Super Mario";
		
		
		//Tema 5
		
		Aluno d = new Aluno(1002,"Super Luigi","222.333.444-55");
		d.info();
		
		Aluno e = new Aluno(1003);
		e.info();
		
		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
		listaAlunos.add(e);
		listaAlunos.add(new Aluno(1005,"Bowser","555.666.777-88"));
		
		
		
	}
}
