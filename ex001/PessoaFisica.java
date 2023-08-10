package ex001;

public class PessoaFisica extends Cliente {
	
	private String cpf;
	
	public PessoaFisica( String nome, int idade, String sexo, String estado, String email, String cpf  ) {
		super(nome,idade,sexo,estado,email);
		
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public void vizualizar() {
		System.out.println(
				"\nNome: " + getNome() +
				"\nIdade: " + getIdade() +
				"\nCPF: " + cpf +
				"\nEmail: " + getEmail() +
				"\nSexo: " + getSexo() +
				"\nEstado: " + getEstado()
				);
	}
	

}
