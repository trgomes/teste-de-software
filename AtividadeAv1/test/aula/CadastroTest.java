package aula;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class CadastroTest {
	
	Cadastro cad;

	//Exercicio 2 - a
	
	@Test // "teste.txt"
	public void construtor1() throws IOException{
		cad = new Cadastro("teste.txt");
		assertNotNull(cad);
	}

	@Test(expected=IOException.class) // ""
	public void construtor2() throws IOException{
		cad = new Cadastro("");
		assertNotNull(cad);
	}
	
	@Test(expected=NullPointerException.class)// null
	public void construtor3() throws IOException{
		cad = new Cadastro(null);
		assertNotNull(cad);
	}
	
	//Exercicio 2 - b
	
	@Test //1 e "De volta para o futuro I"
	public void testInsert() throws IOException{
		cad = new Cadastro("filmes.txt");		
		cad .insert(1, "De volta para o futuro I");
		
		cad.imprimir();
		
//		assertEquals("1;De volta para o futuro I", cad.imprimir());	
	}
	
	
}
