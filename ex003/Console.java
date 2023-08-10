package ex003;

public class Console extends Produto{

private String memoria;
	
	public Console(String nome, String genero, String plataforma, String tipoMidia, String desenvolvedora, String memoria) {
		super(nome,genero,plataforma,tipoMidia,desenvolvedora);
		
		this.memoria = memoria;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	
	
	
	public void vizualizar() {
		System.out.println(
				"\nNome: "+getNome()+
				", Genero: "+getGenero()+
				", Plataforma: "+getPlataforma()+
				", TipoMidea: "+getTipoMidia()+
				", Desenvolvedora: "+getDesenvolvedora()+
				", Memória: "+memoria
				);
	}
}
