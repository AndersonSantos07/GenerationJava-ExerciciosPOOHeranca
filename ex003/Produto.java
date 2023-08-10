package ex003;

public class Produto {
	
	private String nome;
	private String genero;
	private String plataforma;
	private String tipoMidia;
	private String desenvolvedora;
	public Produto(String nome, String genero, String plataforma, String tipoMidia, String desenvolvedora) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.plataforma = plataforma;
		this.tipoMidia = tipoMidia;
		this.desenvolvedora = desenvolvedora;
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
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getTipoMidia() {
		return tipoMidia;
	}
	public void setTipoMidia(String tipoMidia) {
		this.tipoMidia = tipoMidia;
	}
	public String getDesenvolvedora() {
		return desenvolvedora;
	}
	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}
	
	public void vizualizar() {
		System.out.printf("\nGame: %S, de %s, pode ser jogado no %s, seu tipo é %s e foi desenvolvido pela: %s.",nome,genero,plataforma,tipoMidia,desenvolvedora);
	}
	

}
