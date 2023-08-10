package ex005;

public class Ingresso {
	
	
	private String nome;
	private String genero;
	private String assento;
	private int duracao;
	private String classificacao;
	
	public Ingresso(String nome, String genero, String assento, int duracao, String classificacao) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.assento = assento;
		this.duracao = duracao;
		this.classificacao = classificacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAssento() {
		return assento;
	}
	public void setAssento(String assento) {
		this.assento = assento;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	
	
	public void vizualizar() {
		
		System.out.printf("\nFilme: %s, com duracao de %d minutos, do Genero %s, recomendado para maiores de %s, Assento: %s.",nome,duracao,genero,classificacao,assento);
		
	}
	
	
	
	
	
	

}
