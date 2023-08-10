package ex006;

public class Curso {
	
	
	private String nome;
	private String genero;
	private String certificado;
	private Boolean tcc;
	private double valorMensalidade;
	public Curso(String nome, String genero, String certificado, Boolean tcc, double valorMensalidade) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.certificado = certificado;
		this.tcc = tcc;
		this.valorMensalidade = valorMensalidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCertificado() {
		return certificado;
	}
	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}
	public Boolean getTcc() {
		return tcc;
	}
	public void setTcc(Boolean tcc) {
		this.tcc = tcc;
	}
	public double getValorMensalidade() {
		return valorMensalidade;
	}
	public void setValorMensalidade(double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
	
	public void vizualizar() {
		
		if(tcc == true) {
			
			System.out.printf("\nO curso de %s, genero: %s, precisa de TCC para se formar em %s, com o valor por mês de %.2f Reais por mes.",nome,genero,certificado,valorMensalidade);
			
		}else {
			System.out.printf("\nO curso de %s, genero: %s, não precisa de TCC para se formar em %s, com o valor por mês de %.2f Reais por mes.",nome,genero,certificado,valorMensalidade);
		}
		
		
	}

}
