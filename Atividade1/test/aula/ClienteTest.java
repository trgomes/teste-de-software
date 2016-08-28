package aula;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ClienteTest {

	private Cliente cli;

	//Exercicio 6	
	@Test
	@Ignore
	public void exer6a(){
		cli = new Cliente(null, 17);
		assertTrue(cli.isDeMenor());
	}

	@Test
	@Ignore
	public void exer6b(){
		cli = new Cliente(null, 18);
		assertFalse(cli.isDeMenor());
	}
	
	@Test(expected=NullPointerException.class)
	@Ignore
	public void exer6c(){
		cli = new Cliente(null, null);
		assertTrue(cli.isDeMenor());
	}
	
	@Test(expected=NullPointerException.class)
	@Ignore
	public void exer6d(){
		cli = new Cliente(null, 18);
		assertFalse(cli.isDeMenor());
	}
	
	//Exercicio 7
	
	@Test
	@Ignore
	public void exer7a(){
		assertNull(Cliente.create(null, 18));
	}
	
	@Test
	@Ignore
	public void exer7b(){
		assertNotNull(Cliente.create("Ana", 0));
	}
	
	@Test	
	@Ignore
	public void exer7c(){		
		assertSame(Cliente.create("Ana", 0), Cliente.create("Ana", 0));
	}
	
	//Exercicio 8
	
	@Test
	public void exer8a(){
		Object[] a = {"Ana",0};
		Object[] b = Cliente.create("Ana", 0).asArray();
		assertArrayEquals(a,b);
	}
	
	@Test(expected=NullPointerException.class)
	public void exer8b(){
		Object[] a = {null,0};
		Object[] b = Cliente.create(null, 0).asArray();
		assertArrayEquals(a,b);
	}
	
	@Test
	public void exer8c(){	
		Object[] a = {null,0};
		Object[] b = new Cliente(null, 0).asArray();
		assertArrayEquals(a,b);	
	}
	
	

}
