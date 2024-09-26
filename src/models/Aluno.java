package models;

/* A classe "Aluno" tem o objetivo de criar um aluno
 * e os atributos que o compoem. Além de calcular a presença e nota
 * para definir a situação do aluno. Sistema designado para uso de DOCENTE.
 * 
 * @author taynara
 * @version 1.0
 */
public class Aluno {
	//Declarando atributos
	private String nome;
	private String RA;
	private double nota;
	private int presenca;
	private Modalidade modalidade;
	private int aulas;
	
	//Construtor da classe Aluno
	public Aluno(String nome, String RA, Modalidade modalidade, int presenca, int aulas) {
		this.nome = nome;
		this.RA = RA;
		this.modalidade = modalidade;
		this.presenca = presenca;
		this.aulas = aulas;
	}
	
	//Método printa os valores
	public String getValues() {
		return
				"Nome: " + nome + 
				"\nRA: " + RA +
				"\nModalidade " + modalidade +
				"\nNota: " + nota +
				"\nAulas presente: " + presenca +
				"\nSituação: " + situacaoAluno();
	}

	//Enum das modalidades possíveis
	public enum Modalidade{
		EAD, Presencial;
	}
	
	//Método para cadastrar 2 notas	
	public void mediaNota(int nota1, int nota2) {
			nota = (nota1 + nota2)/2;
	}
	
	//Método para cadastrar 3 notas
	public void mediaNota(int nota1, int nota2, int nota3) {
			nota = (nota1 * 1 + nota2 * 2 + nota3 * 4) / (1 + 2 + 4);
	}
	
	//Método para cadastrar 4 notas
	public void mediaNota(double ac1, double ac2, double ag, double af) {
			nota = (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);
	}
	
	//Método para avaliar a situação do aluno: Aprovado/Reprovado
	public String situacaoAluno() {
		if (nota >= 5) {
			if(modalidade == Modalidade.EAD) {
				return "Aprovado";
			} else if ((presenca/aulas) * 100 > 75) {
				return "Aprovado"; 
			}
		}
		return "Reprovado";
	}
	
}


