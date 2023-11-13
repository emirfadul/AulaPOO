package cursojava.excecao;

public class ExcecaoProcessarNota extends Exception {

	public ExcecaoProcessarNota(String erro) {
		super("\n\n*** [ERRO] Processamento do arquivo de notas não concluído ****\n\n");
	
	}

}
