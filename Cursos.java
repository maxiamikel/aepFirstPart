package aep_01.cursos;

public class Cursos {
	private String nomeCurso;
	private double duracaoCurso;
	private double precoCurso;
	 
	public String toString() {
		return "\n =======================\n Curso: "+getNomeCurso()+ "  \nDuracao: "+getDuracaoCurso()+" \nPreco Total: " +getPrecoCurso()+"\nPreco com Desconto: "+getPrecoCursoComDesconto();
	}
	public Cursos() {
		System.out.println("CRIANDO OS CURSOS!!");

	}

	public Cursos(String nomeCurso, double duracaoCurso, double precoCurso) {
		setNomeCurso(nomeCurso);
		setDuracaoCurso(duracaoCurso);
		setPrecoCurso(precoCurso);
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public void setDuracaoCurso(double duracaoCurso) {
		this.duracaoCurso = duracaoCurso;
	}

	public void setPrecoCurso(double precoCurso) {
		this.precoCurso = precoCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public double getDuracaoCurso() {
		return duracaoCurso;
	}

	public double getPrecoCurso() {
		return precoCurso;
	}

	public double getPrecoCursoComDesconto() {
		double precoComDesconto = 0.00;
		if (duracaoCurso < 3) {
			precoComDesconto = getPrecoCurso()- getPrecoCurso() * 0.2;
		} else if (duracaoCurso == 3) {
			precoComDesconto = getPrecoCurso()- getPrecoCurso() * 0.28;
		} else {
			precoComDesconto = getPrecoCurso()- getPrecoCurso() * 0.31;
		}
		return precoComDesconto;
	}

}
