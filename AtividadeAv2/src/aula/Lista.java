package aula;

public interface Lista {
	
	public void add(String nome );
	/* retorna o nome que est� na posi��o n
	* ou lan�a uma exce��o caso a posi��o n�o exista */
	public String get(int n) throws ArrayIndexOutOfBoundsException;
}
