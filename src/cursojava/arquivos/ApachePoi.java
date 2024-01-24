package cursojava.arquivos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.formula.functions.IfFunc;

public class ApachePoi {
	
	public static void main(String[] args) throws Exception {
		
		
		File file = new File("//home/emirfadul/ONEDRIVE/JAVA/POO-Modulo9/src/cursojava/arquivos/planilha_excel.xls");
				
			if(!file.exists()) {
				
				file.createNewFile();
			}
			
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
		
		
	}

}
