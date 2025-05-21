class Tecnico extends Pessoa {

	private String setor;
	private String cargo;

	public Tecnico(String nome, String idade, String cpf, String setor, String cargo) {
		super(nome, idade, cpf);
		this.setor = setor;
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void exibirDados() {
		super.exibirDados();
		System.out.println("Setor: " + setor);
		System.out.println("Cargo: " + cargo);
	}
}