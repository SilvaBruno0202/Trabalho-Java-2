class Aluno extends Pessoa {

	private String matricula;
	private String curso;
	private String ingressamento;

	public Aluno(String nome, String idade, String cpf, String matricula, String curso, String ingressamento) {
		super(nome, idade, cpf);
		this.matricula = matricula;
		this.curso = curso;
		this.ingressamento = ingressamento;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getCurso() {
		return curso;
	}
	
	public String getIngressamento() {
		return ingressamento;
	}

	public void exibirDados() {
		super.exibirDados();
		System.out.println("Matricula: " + matricula);
		System.out.println("Curso: " + curso);
		System.out.println("Ingressamento" + ingressamento);
	}
}