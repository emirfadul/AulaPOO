package modulos_datas;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava7 {

	public static void main(String[] args) throws ParseException, InterruptedException {

		/*LocalDate localDate = LocalDate.now();

		System.out.println("Data atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());

		System.out.println("Dia do mes: " + localDate.getDayOfMonth());

		System.out.println("Mês: " + localDate.getMonth());

		System.out.println("Ano: " + localDate.getYear());
		
		*/
		
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Duração em nano segundos: "+duracao.toNanos());
		
		System.out.println("Duração em minutos: "+duracao.toMinutes());
		
		System.out.println("Duração em horas: "+duracao.toHours());
		
		System.out.println("Duração em milissegundos: "+duracao.toMillis());
		
		System.out.println("Duração em dias: "+duracao.toDays());

		
		
	}

}
