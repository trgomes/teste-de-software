package aula;

import static org.junit.Assert.*;



import org.junit.Test;

public class SenaTest {

	Sena sn;
	
	@Test (expected = Exception.class)
	public void testConst1() throws Exception{
		sn = new Sena(5);		
	}
	
	@Test
	public void testConst2() throws Exception{
		sn = new Sena(6);
	}
	
	@Test
	public void testConst3() throws Exception{
		sn = new Sena(11);
	}
	
	@Test
	public void testConst4() throws Exception{
		sn = new Sena(12);
	}
	
	@Test (expected = Exception.class)
	public void testConst5() throws Exception{
		sn = new Sena(13);
	}
	
	

	
}

