package ex001;

public class TestaCliente {

	public static void main(String[] args) {
		
		PessoaFisica[] pessoasF = new PessoaFisica[2];
		//nome,idade,sexo,estado,email,cpf
		pessoasF[0] = new PessoaFisica("Anderson Santos",21,"Masculino","São Paulo", "anderson@gmail.com","12345678904");
		pessoasF[1] = new PessoaFisica("Maria Silva",37,"Feminino","Pará","mariasilva@gmail.com","32165498710");
		
		for(PessoaFisica pessoas:pessoasF) {
			pessoas.vizualizar();
		}
		
		PessoaJuridica[] pessoasJ = new PessoaJuridica[2];
		
		pessoasJ[0] = new PessoaJuridica("Rockstar Games",21,"Masculino","Brasilia","rockstar@gmail.com","10.333.455/0001-12");
		pessoasJ[1] = new PessoaJuridica("Epic Games",35,"Masculino","São Paulo","epick@gmail.com","12.666.457/0001-24");
		
		for(PessoaJuridica pessoas:pessoasJ) {
			pessoas.vizualizar();
		}

	}

}
