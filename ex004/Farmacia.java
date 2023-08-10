package ex004;

public class Farmacia {

	
	private String nome;
	private String tipo;
	private int peso;
	private int quantidade;
	private double preco;
	public Farmacia(String nome, String tipo, int peso, int quantidade, double preco) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.peso = peso;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void vizualizar() {
		
		System.out.printf("\nRemédio: %s, serve para: %s, seu peso é de %d mg, com %d comprimidos e o valor %.2f",nome,tipo,peso,quantidade,preco);
		
	}
	
	
	
}
