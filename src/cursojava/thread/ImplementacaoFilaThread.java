package cursojava.thread;

import java.util.concurrent.ConcurrentLinkedQueue;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.List;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {

		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {

		System.out.println("fila rodando......");

		while (true) {

			synchronized (pilha_fila) {

				java.util.Iterator<ObjetoFilaThread> iteracao = pilha_fila.iterator();

				while (((java.util.Iterator<ObjetoFilaThread>) iteracao).hasNext()) {

					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();

					System.out.println("---------------------");
					System.out.println(processar.getNome());
					System.out.println(processar.getEmail());
					System.out.println("---------------------");

					/* processa o que quiser */

					try {
						Thread.sleep(1000);

					} catch (Exception e) {
						e.printStackTrace();
					}

				}

			}

			try {

				Thread.sleep(1000);
			} catch (Exception e) {

				e.printStackTrace();
			}

		}

	}
}
