package aula;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class OperacaoTest {
	private Operacao op;
	
	@Before
	public void setUp(){
		op = new Operacao();		
	}		
	
	//Exercico 1
	
	@Test
	@Ignore
	public void exer1a(){
		assertEquals(0.5, op.divisao(1, 2), 0);
	}
	
	@Test
	@Ignore
	public void exer1b(){
		assertEquals(0, op.divisao(0, 2), 0);
	}
	
	@Test
	@Ignore
	public void exer1c(){
		assertEquals(0, op.divisao(0, 0), 0);
	}
		
	@Test
	@Ignore
	public void exer1d(){
		assertEquals(0, op.divisao(2,0 ), 0);
	}
	
	@Test(expected=ArithmeticException.class)
	@Ignore
	public void exer1e(){
		assertEquals(0, op.divisao(2, 0), 0);
	}
	
	
	//Exercicio 2
	
	@Test
	@Ignore
	public void exer2a(){
		assertEquals(0.5, op.divisao(1.0, 2.0),0);
	}
	
	@Test
	@Ignore
	public void exer2b(){
		assertEquals(0, op.divisao(0.0, 2.0),0);
	}
	
	@Test
	@Ignore
	public void exer2c(){
		assertEquals(0, op.divisao(0.0, 0.0),0);
	}
	
	@Test
	@Ignore
	public void exer2d(){
		assertEquals(0, op.divisao(2.0, 0.0),0);
	}
	
	@Test(expected=ArithmeticException.class)
	@Ignore
	public void exer2e(){
		assertEquals(0, op.divisao(2.0, 0.0), 0);
	}
	
	//Exercicio 3
	
	@Test
	@Ignore
	public void exer3a(){
		assertEquals(1, op.fatorial(0));
	}
	
	@Test
	@Ignore
	public void exer3b(){
		assertEquals(1, op.fatorial(1));
	}
	
	@Test
	@Ignore
	public void exer3c(){
		assertEquals(50, op.fatorial(20));
	}
	
	
	//Exercicio 4
	
	@Test
	@Ignore
	public void exer4a(){
		assertEquals(1, op.fibonacci(0));
	}
	
	@Test
	@Ignore
	public void exer4b(){
		assertEquals(1, op.fibonacci(2));
	}
	
	@Test
	@Ignore
	public void exer4c(){
		assertEquals(610, op.fibonacci(15));
	}
	
	//Exercicio 5
	
	@Test
	public void exer5a(){
		assertEquals(1, op.loop(1));
	}
	
	@Test
	public void exer5b(){
		assertEquals(1, op.loop(1));
	}
	@Test
	public void exer5c(){
		assertEquals(1, op.loop(1));
	}
}
