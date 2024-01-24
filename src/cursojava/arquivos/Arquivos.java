package cursojava.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("emir fadul");
		pessoa1.setEmail("emirfadul@gmail.com");
		pessoa1.setIdade(52);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("emir fadoul");
		pessoa2.setEmail("emirfadoul@hotmail.com");
		pessoa2.setIdade(32);
				
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("joao cleber");
		pessoa3.setEmail("joao@email.com");
		pessoa3.setIdade(25);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
			
	
		File arquivo = new File("//home/emirfadul/ONEDRIVE/JAVA/POO-Modulo9/src/cursojava/arquivos/arquivo.txt");

		if (!arquivo.exists()) {

			arquivo.createNewFile();

		}

		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for (Pessoa p : pessoas) {
			
			escrever_no_arquivo.write(p.getNome()+" ; "+p.getEmail()+" ; "+p.getIdade()+"\n");
		}
		
		escrever_no_arquivo.flush();

		escrever_no_arquivo.close();
		
		
		/*
		for (int i = 0; i <= 5; i++) {

			escrever_no_arquivo.write("Texto na linha " + i + "\n");
		}

		escrever_no_arquivo.write("Meu texto no arquivo criado pelo metodo FILE");

		escrever_no_arquivo.write("\n");

		escrever_no_arquivo.write("MInha segunda linha escrita no arquivo");

		escrever_no_arquivo.write("\n");

		escrever_no_arquivo.write("Minha terceira linha no arquivo com metodo FILE");

		escrever_no_arquivo.flush();

		escrever_no_arquivo.close();
		
		*/
	}

}
