package cursojava.thread;

import javax.swing.JOptionPane;

public abstract class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		new Thread() {

			public void run() {

				for (int pos = 0; pos < 5; pos++) {

					System.out.println((pos + 1) + ") Executando uma rotina!");

					try {

						Thread.sleep(2000);

					} catch (Exception e) {
						e.printStackTrace();
					}

				}

				System.out.println("==== FIM ====");

				JOptionPane.showMessageDialog(null, "Fim do processso !", "Alerta", JOptionPane.WARNING_MESSAGE);

			}

		}.start();

		JOptionPane.showMessageDialog(null, "Sistema continua executando....", "Alerta", JOptionPane.ERROR_MESSAGE);
	}

}
