package ex002;

public class TestaFuncionario {

	public static void main(String[] args) {
		Gerente[] gerente = new Gerente[2];
		
		//nome,idade,cargo,salario,sexo,funcao
		gerente[0] = new Gerente("Anderson Santos",21,"Gerente",20000,"Masculino","Comercial");
		gerente[1] = new Gerente("Maria Silva",37,"Gerente",35000,"Feminino","Financeiro");
		
		for(Gerente pessoa:gerente) {
			pessoa.vizualizar();
		}
		
		Vendedor[] vendedores = new Vendedor[2];
		
		vendedores[0] = new Vendedor("João Silva",40,"Vendedor",12000,"Masculino","Roupa");
		vendedores[1] = new Vendedor("Marina Souza",57,"Vendedora",15000,"Feminino","Carro");
		
		for(Vendedor pessoa:vendedores) {
			pessoa.vizualizar();
		}
		
	}	

}
