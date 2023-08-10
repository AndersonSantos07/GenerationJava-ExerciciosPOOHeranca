package ex002;

public class Gerente extends Funcionario{
	
	private String funcao;
	
	public Gerente(String nome, int idade, String cargo, double salario, String sexo, String funcao) {
		super(nome,idade,cargo,salario,sexo);
		
		this.funcao = funcao;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public void vizualizar() {
		System.out.printf("\nNome: %s, cargo: %s %s, idade: %d, sexo: %s, salario: %.2f",getNome(),getCargo(),funcao,getIdade(),getSexo(),getSalario());
	}

}
