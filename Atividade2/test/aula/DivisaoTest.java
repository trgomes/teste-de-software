package aula;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class DivisaoTest {

	
	@Mock
	private Operacao op;
	
	@Before
	public void setUp(){
		op = mock(Operacao.class);
		when(op.divisao(1, 2)).thenReturn(0.5);
		when(op.divisao(0, 2)).thenReturn(0.0);
		when(op.divisao(0, 0)).thenReturn(0.0);
		when(op.divisao(2, 0)).thenThrow(new ArithmeticException());
		when(op.divisao(1.0, 0.5)).thenCallRealMethod();		
	}
	

	@Test
	public void test1a(){
		assertEquals(0.5, op.divisao(1, 2), 0);
	}
	
	@Test
	public void test1b(){
		assertEquals(0, op.divisao(0, 2), 0);
	}
	
	@Test
	public void test1c(){
		assertEquals(0, op.divisao(0, 0), 0);
	}
	
	@Test
	public void test1d(){
		assertEquals(0, op.divisao(2, 0), 0);
	}
	
	@Test(expected=ArithmeticException.class)
	public void test1e(){
		assertEquals(0, op.divisao(2, 0), 0);
	}
	
	@Test
	public void test1f(){
		assertEquals(2, op.divisao(1.0, 0.5), 0);
	}





	

}
