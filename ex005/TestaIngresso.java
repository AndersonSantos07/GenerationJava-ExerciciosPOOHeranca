package ex005;

public class TestaIngresso {

	public static void main(String[] args) {
		//nome,genero,assento,duracao,classificacao,servido/situacao
		
		Vip[] clientesVip = new Vip[2];
		MeiaEntrada[] clientesMeia = new MeiaEntrada[2];
		
		clientesVip[0] = new Vip("Velozes e Furiosos 11","Ação","JK12",120,"16 Anos",true);
		clientesVip[1] = new Vip("Sniper Americano","Ação","A01",150,"18 Anos",false);
		
		clientesMeia[0] = new MeiaEntrada("Barbie","Aventura","BA12",140,"12 Anos","Estudante");
		clientesMeia[1] = new MeiaEntrada("Duro de Matar","Ação","BE1",190,"18 Anos","Bradesco");
		
		for(Vip cliente:clientesVip) {
			cliente.vizualizar();
		}
		
		for(MeiaEntrada cliente:clientesMeia) {
			cliente.vizualizar();
		}

	}

}
