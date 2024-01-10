package modulos_datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasEmJava6 {

	public static void main(String[] args) {

		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data atual: "+dataAtual.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("A hora atual é: "+horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
				
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
	
		System.out.println("Data e hora atual: "+dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
	}

}
