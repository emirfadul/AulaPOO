package cursojava.thread;

import java.util.concurrent.ConcurrentLinkedQueue;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {

		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {
		
		System.out.println("fila rodando......");

		Iterator iteracao = (Iterator) pilha_fila.iterator();

		synchronized (iteracao) {

			while (iteracao.hasNext()) {

				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
				
				System.out.println("---------------------");
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());


				/* processa o que quiser */

				iteracao.remove();

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
