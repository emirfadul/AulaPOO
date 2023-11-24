package cursojava.thread;

import javax.swing.JOptionPane;

public abstract class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		Thread threadNF = new Thread(thread2);
		threadNF.start();

		JOptionPane.showMessageDialog(null, "Sistema continua executando....", "Alerta", JOptionPane.ERROR_MESSAGE);
	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			for (int pos = 0; pos < 5; pos++) {

				System.out.println((pos + 1) + ") Executando envio EMAIL!");

				try {

					Thread.sleep(2000);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			System.out.println("==== FIM ====");

			JOptionPane.showMessageDialog(null, "Fim do envio de EMAIL", "Alerta", JOptionPane.WARNING_MESSAGE);

		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			for (int pos = 0; pos < 5; pos++) {

				System.out.println((pos + 1) + ") Executando NOTA FISCAL");

				try {

					Thread.sleep(2000);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			System.out.println("==== FIM ====");

			JOptionPane.showMessageDialog(null, "Fim do envio de NOTA FISCAL", "Alerta", JOptionPane.WARNING_MESSAGE);

		}
	};

}
