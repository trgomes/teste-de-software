package aula;

import java.util.concurrent.TimeUnit;
public class Operacao {
	
	public double divisao( int a, int b ){
		return a/b;
	}
	
	public double divisao( double a, double b ){
		return a/b;
	}
	
	public long fatorial(long n) {
		if( n < 2 ) return 1;
		long r=1;
		while(n>1) {
			r *= n;
			n--;
		}
		return r;
	}
	
	public long fibonacci(long n) {
		return n < 2? n : fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public int loop(int n) {
		int r = n;
		try{
			while( n-- > 0){
				TimeUnit.SECONDS.sleep(1);
			}
		}
		catch(Exception e){
			System.out.println("Exceção: "+ e.getMessage() );
		}
		return r;
	}
}
