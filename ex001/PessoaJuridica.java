package ex001;

public class PessoaJuridica extends Cliente {
	
private String cnpj;
	
public PessoaJuridica( String nome, int idade, String sexo, String estado, String email, String cnpj  ) {
	super(nome,idade,sexo,estado,email);
		
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	public void vizualizar() {
		System.out.println(
				"\nNome: " + getNome() +
				"\nIdade: " + getIdade() +
				"\nCNPJ: " + cnpj +
				"\nEmail: " + getEmail() +
				"\nSexo: " + getSexo() +
				"\nEstado: " + getEstado()
				);
	}

}
