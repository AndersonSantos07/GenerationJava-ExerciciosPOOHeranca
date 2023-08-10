package ex004;

public class Medicamento extends Farmacia{
	
	private Boolean receitaMedica;
	
	public Medicamento(String nome, String tipo, int peso, int quantidade, double preco, Boolean receitaMedica) {
		super(nome,tipo,peso,quantidade,preco);
		this.receitaMedica = receitaMedica;
	}

	public Boolean getReceitaMedica() {
		return receitaMedica;
	}

	public void setReceitaMedica(Boolean receitaMedica) {
		this.receitaMedica = receitaMedica;
	}
	
	public void vizualizar() {
		
		System.out.printf("\nRemédio: %s, serve para: %s, seu peso é de %d mg, com %d comprimidos e o valor %.2f, Precisa de receita médica? %b",getNome(),getTipo(),getPeso(),getQuantidade(),getPreco(),receitaMedica);
		
		
	}
	
	

}
