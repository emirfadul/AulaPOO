package cursojava.executavel;

import java.util.Iterator;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		/*
		 * double[] valores = {9.5, 8.0, 10.0};
		 * 
		 * String[] valores = { "emir", "98,5", "92 98130-8070", "emirfadul@gmail.com"
		 * };
		 * 
		 * for (int pos = 0; pos < valores.length; pos++) {
		 * System.out.println("valor na posição " + (pos + 1) + " é " + valores[pos]); }
		 * 
		 * /* String[] valores = new String[4]; valores[0] = "alex"; valores[1] =
		 * "98,5"; valores[2] = "curso java"; valores[3] = "contato@email.com";
		 * 
		 * 
		 * String posicoes =
		 * JOptionPane.showInputDialog("Quantas posicoes o Array deve ter: ");
		 * 
		 * double[] notas = new double[Integer.parseInt(posicoes)];
		 * 
		 * for (int pos = 0; pos < notas.length; pos++) { String valor =
		 * JOptionPane.showInputDialog("Qual o valor da nota " + pos); notas[pos] =
		 * Double.valueOf(valor); }
		 * 
		 * for (int pos = 0; pos < notas.length; pos++) { System.out.println("Nota " +
		 * (pos + 1) + " é " + notas[pos]); }
		 */

		double[] notasCalculo = { 8.0, 9.0, 9.8, 3.7 };
		double[] notasSistemas = { 7.0, 8.0, 4.8, 8.7 };

		Aluno aluno = new Aluno();
		aluno.setNome("emir fadul");
		aluno.setNomeEscola("UNICESUMAR");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Calculo Integral");
		disciplina.setNota(notasCalculo);

		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Sistemas operacionais");
		disciplina2.setNota(notasSistemas);

		aluno.getDisciplinas().add(disciplina2);

		// -----------------------------------------------------

		Aluno aluno2 = new Aluno();
		aluno.setNome("joao silva");
		aluno.setNomeEscola("UNICESUMAR");

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Calculo Integral2");
		disciplina3.setNota(notasCalculo);

		aluno2.getDisciplinas().add(disciplina3);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Sistemas operacionais2");
		disciplina4.setNota(notasSistemas);

		aluno2.getDisciplinas().add(disciplina4);

		// --------------------------------------------------
		/*
		 * System.out.println("Nome do aluno: " + aluno.getNome() +
		 * ", inscrito no curso: " + aluno.getNomeEscola());
		 * System.out.println("------------- DISCIPLINA----------");
		 * 
		 * for (Disciplina d : aluno.getDisciplinas()) {
		 * 
		 * double notaMax = 0.0; double notaMin = 0.0;
		 * 
		 * System.out.println("Disciplina do aluno: " + d.getDisciplina());
		 * System.out.println("As notas a disciplina são: ");
		 * 
		 * for (int pos = 0; pos < d.getNota().length; pos++) {
		 * System.out.println("A nota " + (pos + 1) + " é igual " + d.getNota()[pos]);
		 * 
		 * if (notaMax == 0) { notaMax = d.getNota()[pos]; } else { if (d.getNota()[pos]
		 * > notaMax) { notaMax = d.getNota()[pos]; } } if (notaMin == 0) { notaMin =
		 * d.getNota()[pos]; } else { if (d.getNota()[pos] < notaMin) { notaMin =
		 * d.getNota()[pos]; } }
		 * 
		 * } System.out.println("A maior nota da disciplina " + d.getDisciplina() +
		 * " foi " + notaMax); System.out.println("A menor nota da disciplina " +
		 * d.getDisciplina() + " foi " + notaMin); }
		 */
		// -----------------------------------------------------------------------

		Aluno[] arrayAlunos = new Aluno[2];

		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;

		for (int pos = 0; pos < arrayAlunos.length; pos++) {
			System.out.println("O nome do aluno é " + arrayAlunos[pos].getNome());

			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina " + d.getDisciplina());

				for (int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println("A nota numero " + (posnota + 1) + " = " + d.getNota()[posnota]);
				}
			}
		}
	}
}
