package ex004;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		Medicamento[] remedios = new Medicamento[2];
		Perfumaria[] perfumes = new Perfumaria[2];
		//nome,tipo,peso,quantidade,preco,receitaMedica/marca
		
		remedios[0] = new Medicamento("Dipirona","Dor e Febre",500,20,10,false);
		remedios[1] = new Medicamento("BeneGrip","Gripe",120,6,20,false);
		
		perfumes[0] = new Perfumaria("212","Suave",600,600,200,"Gelniche");
		perfumes[1] = new Perfumaria("Ferrari Black","Suave",300,300,150,"Eau de Toilette");
		
		for(Medicamento remedio:remedios) {
			remedio.vizualizar();
		}
		
		for(Perfumaria perfume:perfumes) {
			perfume.vizualizar();
			
		}

	}

}
