package ex003;

public class TestaGame {

	public static void main(String[] args) {
		//nome,genero,plataforma,tipoMidia,desenvolvedora,multiplayer/memoria
		
		Jogo[] games = new Jogo[2];
		
		games[0] = new Jogo("GTA IV","Ação","PS5","Digital","Rockstar Games",false);
		games[1] = new Jogo("FIFA 24","Esportes","PC","Digital","EA Sports",true);
		
		for(Jogo jogos:games) {
			jogos.vizualizar();
		}
		
		Console[] consoles = new Console[2];
		
		consoles[0] = new Console("PS5","Video Games","Playstation","Físico","Sony","512gb");
		consoles[1] = new Console("PS4","Video Games","Playstation","Físico","Sony","1TB");
		
		for(Console console:consoles) {
			console.vizualizar();
		}

	}

}
