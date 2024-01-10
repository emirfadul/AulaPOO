package modulos_datas;

import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava8 {

	public static void main(String[] args) {

		LocalDate dataAntiga = LocalDate.parse("2023-10-21");

		LocalDate dataNova = LocalDate.parse("2023-12-25");

		System.out.println("Data antiga: " + dataAntiga + "\nData nova:   " + dataNova);

		System.out.println("Data antiga é posterior a data nova: : " + dataAntiga.isAfter(dataNova));

		System.out.println("Data antiga é anterior a data nova: : " + dataAntiga.isBefore(dataNova));

		System.out.println("As datas são iguais: " + dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias entre data antiga e data atual: "+periodo.getDays());
		
		System.out.println("Quantos meses entre data antiga e data atual : "+periodo.getMonths());
		
		System.out.println("Quantos anos entre data antiga e data atual : "+periodo.getYears());



	}

}
