package mapHashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String, String> aluno = new HashMap<>();
		
		aluno.put("Nome","Marcelo");
		aluno.put("Idade","62");
		aluno.put("Curso","Engenharia");
		aluno.put("Universidade","UniBH");
		aluno.put("Local","Butitis");
		
		System.out.println(aluno);
		
		System.out.println(aluno.keySet());
		
		System.out.println(aluno.values());
		
		System.out.println(aluno.size());		
	}

}
