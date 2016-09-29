package aula;

public abstract class Operacao {
	
	public abstract double divisao( int a, int b );
	
	public double divisao( double a, double b ){
		return a/b;
	}
	
	public void imprimir(String msg){
		System.out.println(msg);
	}

	public long fatorial(long n){
		if( n < 2 ) return 1;
		long r=1;
		while(n>1) {
			r *= n;
			n--;
		}
		return r;
	}
	
	public abstract int getElemento();
	protected abstract long fibonacci(long n);
}
