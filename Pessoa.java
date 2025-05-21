class Pessoa {

	private String nome;
	private String idade;
	private String cpf;

	public Pessoa(String nome, String idade, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getIdade() {
		return idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("CPF: " + cpf);
	}
}