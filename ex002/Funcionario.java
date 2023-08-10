package ex002;

public class Funcionario {
	private String nome;
	private int idade;
	private String cargo;
	private double salario;
	private String sexo;
	
	
	public Funcionario(String nome, int idade, String cargo, double salario, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
		this.sexo = sexo;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void vizualizar() {
		System.out.printf("\nNome: %s, cargo: %s, idade: %d, sexo: %s, salario: %.2f",nome,cargo,idade,sexo,salario);
	}
	

}
