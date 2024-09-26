package app;
import models.*;
/*
 * Essa é a classe principal que instancia os objetos mencionados
 * nas classes em "models".
 * 
 * @author taynara
 * version 1.0
 */

public class Main {

	public static void main(String[] args) {
		//Instanciando objeto aluno com 2 notas
		Aluno aluno1 = new Aluno("Taynara", "249295", Aluno.Modalidade.EAD, 10,17);
		aluno1.mediaNota(10, 8);
		
		//Instanciando objeto aluno com 3 notas
		Aluno aluno2 = new Aluno("Carlos", "249296", Aluno.Modalidade.Presencial, 10,60);
		aluno2.mediaNota(10, 8, 4);

		//Instanciando objeto aluno com 4 notas
		Aluno aluno3 = new Aluno("Taynara", "249297", Aluno.Modalidade.EAD, 10, 11);
		aluno3.mediaNota(10, 8, 5, 0);
		
		
		//Printando os objetos e suas informações
		System.out.println(aluno1.getValues() + "\n");
		System.out.println(aluno2.getValues() + "\n");
		System.out.println(aluno3.getValues() + "\n");

	}

}
