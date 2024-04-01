package cursojava.arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscreveJSON {

	public static void main(String[] args) throws IOException {
		
		Usuario usuario1 = new Usuario();
		
		usuario1.setCpf("34766464249");
		usuario1.setLogin("emirfadul");
		usuario1.setSenha("0212");
		usuario1.setNome("emir fadul");
		
		Usuario usuario2 = new Usuario();
		
		usuario2.setCpf("33344466655");
		usuario2.setLogin("joaogabriel");
		usuario2.setSenha("021205");
		usuario2.setNome("joao gabriel");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("//home/emirfadul/ONEDRIVE/JAVA/POO-Modulo9/src/cursojava/arquivos/filejson.json");
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		// ---------------------------
		
		
		
		
		
		
				
				
		
	}

}
