package aula;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class SenaTest {

	/* a anotação @Mock indica que este
	 * atributo deverá receber um objeto Mock */
	@Mock
	private Sena op = null;
	@Before
	public void setUp() throws Exception {
		op = mock(Sena.class);
		when(op.create(5)).thenThrow(new NullPointerException());
		when(op.create(6)).thenReturn(new int[]{1,2,3,4,5,6});
		when(op.create(12)).thenReturn(new int[]{1,2,3,4,5,6,7,8,9,10,11,12});
		when(op.create(13)).thenThrow(new NullPointerException());
	}

	@Test(expected=NullPointerException.class)
	public void test1a1() {
		assertEquals(5, op.create(5).length, 0 );
	}

	@Test
	public void test1a2() {
		assertEquals(6, op.create(6).length, 0 );
	}

	@Test
	public void test1a3() {
		assertEquals(12, op.create(12).length, 0 );
	}

	@Test(expected=NullPointerException.class)
	public void test1a4() {
		assertEquals(13, op.create(13).length, 0 );
	}

	//Testar se todos os números gerados no objeto Sena estão no intervalo [1,60]
	@Test
	public void exer1b() throws Exception{		
		for(int elemento: op.create(12) ){
			if (elemento > 60 || elemento < 1) fail("Fora do range definido");
		}
	}

	//Testar se os números do objeto Sena estão ordenados
	@Test
	public void exer1c() throws Exception{
		//pega todos os numeros da lista gerada
		int antigo = 0;
		for(int elemento: op.create(12) ){
			if (antigo > elemento) fail("Não está ordenada");
			antigo = elemento;
		}
	}

	//Testar se existem números repetidos no objeto Sena.
	@Test
	public void exer1d() throws Exception{
		//pega todos os numeros da lista gerada
		ArrayList<Integer> contidos = new ArrayList<Integer>();
		for(int elemento : op.create(12) ){
			if(contidos.contains(elemento)) fail("Elemento repetido");
		}
	}

}
