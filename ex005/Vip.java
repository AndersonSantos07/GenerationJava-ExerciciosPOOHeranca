package ex005;

public class Vip extends Ingresso{
	
	private Boolean servido;
	
	public Vip(String nome, String genero, String assento, int duracao, String classificacao, Boolean servido) {
		super(nome,genero,assento,duracao,classificacao);
		
		this.servido = servido;
	}

	public Boolean getServido() {
		return servido;
	}

	public void setServido(Boolean servido) {
		this.servido = servido;
	}
	
	public void vizualizar() {
		
		System.out.printf("\nFilme: %s, com duracao de %d minutos, do Genero %s, recomendado para maiores de %s, Assento: %s, Deseja ser servido na poltrona? %b.",getNome(),getDuracao(),getGenero(),getClassificacao(),getAssento(),servido);
		
	}

}
