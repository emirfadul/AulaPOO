package cursojava.executavel;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {

		/* double[] valores = {9.5, 8.0, 10.0}; */

		String[] valores = { "emir", "98,5", "92 98130-8070", "emirfadul@gmail.com" };

		for (int pos = 0; pos < valores.length; pos++) {
			System.out.println("valor na posição " + (pos + 1) + " é " + valores[pos]);
		}

		/*
		 * String[] valores = new String[4]; valores[0] = "alex"; valores[1] = "98,5";
		 * valores[2] = "curso java"; valores[3] = "contato@email.com";
		 */

		String posicoes = JOptionPane.showInputDialog("Quantas posicoes o Array deve ter: ");

		double[] notas = new double[Integer.parseInt(posicoes)];

		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da nota " + pos);
			notas[pos] = Double.valueOf(valor);
		}

		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " é " + notas[pos]);
		}

	}

}
