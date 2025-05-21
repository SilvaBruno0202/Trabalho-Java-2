class Professor extends Pessoa {

	private String siape;
	private String disciplina;

	public Professor(String nome, String idade, String cpf, String siape, String disciplina) {
		super(nome, idade, cpf);
		this.siape = siape;
		this.disciplina = disciplina;
	}

	public String getSiape() {
		return siape;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void exibirDados() {
		super.exibirDados();
		System.out.println("Siape: " + siape);
		System.out.println("Disciplina: " + disciplina);
	}
}