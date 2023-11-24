package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		
		String texto = "emir, java, 80, 99, 65, 89";
		
		String[] valoresArray =	texto.split(",");
			
		System.out.println("nome: "+valoresArray[0]);
		System.out.println("curso: "+valoresArray[1]);
		System.out.println("nota1: "+valoresArray[2]);
		System.out.println("nota2: "+valoresArray[3]);
		System.out.println("nota3: "+valoresArray[4]);
		System.out.println("nota4: "+valoresArray[5]);
		
		List<String> list = Arrays.asList(valoresArray);
		
		for (String valorString : list) {
			
			System.out.println(valorString);
		}
		
		String[] conversaoArray = list.toArray(new String[6]);
		
		for (int pos = 0; pos < conversaoArray.length; pos++) {
			
			System.out.println( conversaoArray[pos]);
		}
				

	}

}
