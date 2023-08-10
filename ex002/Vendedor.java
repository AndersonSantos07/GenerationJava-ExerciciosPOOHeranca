package ex002;

public class Vendedor extends Funcionario {
	
	private String tipo;
	
	public Vendedor(String nome, int idade, String cargo, double salario, String sexo, String tipo) {
		super(nome,idade,cargo,salario,sexo);
		
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void vizualizar() {
		System.out.printf("\nNome: %s, cargo: %s de %s, idade: %d, sexo: %s, salario: %.2f",getNome(),getCargo(),tipo,getIdade(),getSexo(),getSalario());
	}

}
