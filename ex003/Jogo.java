package ex003;

public class Jogo extends Produto{
	
	private Boolean multiplayer;
	
	public Jogo(String nome, String genero, String plataforma, String tipoMidia, String desenvolvedora, Boolean multiplayer) {
		super(nome,genero,plataforma,tipoMidia,desenvolvedora);
		
		this.multiplayer = multiplayer;
	}

	public Boolean getMultiplayer() {
		return multiplayer;
	}

	public void setMultiplayer(Boolean multiplayer) {
		this.multiplayer = multiplayer;
	}
	
	
	
	public void vizualizar() {
		System.out.println(
				"\nNome: "+getNome()+
				", Genero: "+getGenero()+
				", Plataforma: "+getPlataforma()+
				", TipoMidea: "+getTipoMidia()+
				", Desenvolvedora: "+getDesenvolvedora()+
				", Multiplayer? "+multiplayer
				);
	}

}
