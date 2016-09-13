package aula;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	SenaTest.class,
	CadastroTest.class,
	CelulaTest.class,
	FilaTest.class,
	NoTest.class
})

public class GrupoTest {
	
}
