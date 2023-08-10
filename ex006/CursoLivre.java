package ex006;

public class CursoLivre extends Curso{
	
	private int cargaHoraria ;
	
	public CursoLivre(String nome, String genero, String certificado, Boolean tcc, double valorMensalidade, int cargaHoraria) {
		super(nome,genero,certificado,tcc,valorMensalidade);
		
		this.cargaHoraria = cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public void vizualizar() {
		if(getTcc() == true) {
			
			System.out.printf("\nO curso de %s, genero: %s, precisa de TCC para se formar em %s, com o valor por mês de %.2f Reais por mes, com Carga Horária de: %d Horas.",getNome(),getGenero(),getCertificado(),getValorMensalidade(),cargaHoraria);
			
		}else {
			System.out.printf("\nO curso de %s, genero: %s, não precisa de TCC para se formar em %s, com o valor por mês de %.2f Reais por mes, com Carga Horária de: %d Horas.",getNome(),getGenero(),getCertificado(),getValorMensalidade(),cargaHoraria);
		}
	}

}
