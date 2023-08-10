package ex004;

public class Perfumaria extends Farmacia {
	
	private String marca;
	
	public Perfumaria(String nome, String tipo, int peso, int quantidade, double preco, String marca) {
		super(nome,tipo,peso,quantidade,preco);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void vizualizar() {
		
		System.out.printf("\nPerfume: %s, tipo: %s, seu peso é de %d ml, com %d ml e o valor %.2f, Marca: %s.",getNome(),getTipo(),getPeso(),getQuantidade(),getPreco(),marca);
		
		
	}

}
