package aula;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class OperacaoFatorialTest {

	private long entrada;
	private long esperado;
	private Operacao op;

	
	@Before
	public void setUp(){
		op = new Operacao();
	}
	
	public OperacaoFatorialTest(long entrada, long esperado)
	{
		this.entrada = entrada;
		this.esperado = esperado;
	}
	
	@Parameterized.Parameters
	public static Collection parametros(){
		return Arrays.asList(new Object[][]{
			{0,1},
			{1,1},
			{2,1},
			{2,2},
			{10,3628800}
			
		});		
	}
	
	@Test
	public void test1(){
		assertEquals(esperado, op.fatorial(entrada));
	}

}
