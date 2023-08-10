package ex006;

public class TestaCurso {

	public static void main(String[] args) {
		
		CursoLivre[] cursos = new CursoLivre[2];
		Especializacao[] especializacao = new Especializacao[2];
		
		//nome,genero,certificado,tcc,valorMensalidade,cargaHoraria
		
		cursos[0] = new CursoLivre("JavaScript","Programação","Curso Livre",false,50,80);
		cursos[1] = new CursoLivre("TypeScript","Programação","Curso Livre",false,50,40);
		
		especializacao[0] = new Especializacao("FrontEnd","Programação","Formação",false,200,180);
		especializacao[1] = new Especializacao("BackEnd","Programação","Formação",false,200,180);
		
		for(CursoLivre curso:cursos) {
			curso.vizualizar();
		}
		
		for(Especializacao curso:especializacao) {
			curso.vizualizar();
		}
		
		
		
		
		

	}

}
