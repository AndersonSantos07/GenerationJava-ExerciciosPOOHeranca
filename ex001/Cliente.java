package ex001;

public class Cliente {
	


	private String nome;
	private int idade;
	private String sexo;
	private String estado;
	private String email;
	
	
	public Cliente(String nome, int idade, String sexo, String estado, String email) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.estado = estado;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void vizualizar() {
		
		System.out.printf("\nCliente: %s, com idade de %d anos, sexo: %s, Estado onde mora: %s e email: %s ",nome,idade,sexo,estado,email);
		
	}
	
	
	
	
	

}
