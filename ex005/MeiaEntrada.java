package ex005;

public class MeiaEntrada extends Ingresso{
	
	private String situacao;
	
	public MeiaEntrada(String nome, String genero, String assento, int duracao, String classificacao, String situacao) {
		super(nome,genero,assento,duracao,classificacao);
		
		this.situacao = situacao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public void vizualizar() {
		
		System.out.printf("\nFilme: %s, com duracao de %d minutos, do Genero %s, recomendado para maiores de %s, Assento: %s, Situação para meia entrada: %s",getNome(),getDuracao(),getGenero(),getClassificacao(),getAssento(),situacao);
		
	}

}
