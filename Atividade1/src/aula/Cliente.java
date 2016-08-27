package aula;

public class Cliente {
	
	private String nome;
	private Integer idade;
	
	public static Cliente create(String nome, Integer idade){
		return ( nome != null && idade != null )?
				new Cliente(nome, idade) : null;
	}
	
	public Cliente(String nome, Integer idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public boolean isDeMenor(){
		return this.idade < 18;
	}
	
	@Override
	public String toString() {
		return nome + "," + idade;
	}
	
	public Object[] asArray(){
		Object[] v = {nome,idade};
		return v;
	}
}
