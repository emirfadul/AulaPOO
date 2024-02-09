package cursojava.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.IfFunc;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws Exception {

		File file = new File("//home/emirfadul/ONEDRIVE/JAVA/POO-Modulo9/src/cursojava/arquivos/planilha_excel.xls");

		if (!file.exists()) {

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
		
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setNome("camila fadul");
		pessoa4.setEmail("camilafadul@email.com");
		pessoa4.setIdade(18);

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		HSSFWorkbook hssfworkbook = new HSSFWorkbook();
		HSSFSheet linhasPessoa = hssfworkbook.createSheet("Planilha de pessoas");

		int numeroLinha = 0;

		for (Pessoa p : pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinha++);

			int celula = 0;

			Cell celNome = linha.createCell(celula++);
			celNome.setCellValue(p.getNome());

			Cell celemail = linha.createCell(celula++);
			celemail.setCellValue(p.getEmail());

			Cell celIdade = linha.createCell(celula++);
			celIdade.setCellValue(p.getIdade());

		}
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfworkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Planilha criada!!");
	}

}
