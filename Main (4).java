import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite sua matricula: ");
		String matriculaDev = scanner.nextLine();


		int soma = 0;
		for (char c : matriculaDev.toCharArray()) {
			soma += Character.getNumericValue(c);
		}

		int modulo = soma % 3;
		System.out.println("Soma dos dC-gitos: " + soma + " | MC3dulo 3 = " + modulo);

		Map<String, Pessoa> mapaPessoas = new HashMap<>();

		System.out.println("==> Cadastrar Aluno <==");
		System.out.printf("Nome: ");
		String nomeAluno = scanner.nextLine();
		System.out.printf("Idade: ");
		String idadeAluno = scanner.nextLine();
		System.out.printf("CPF: ");
		String cpfAluno = scanner.nextLine();
		System.out.printf("Matricula: ");
		String matriculaAluno = scanner.nextLine();
		System.out.printf("Curso: ");
		String cursoAluno = scanner.nextLine();
		System.out.printf("Ingressamento: ");
		String IngressamentoAluno = scanner.nextLine();

		Aluno aluno = new Aluno(nomeAluno, idadeAluno, cpfAluno, matriculaAluno, cursoAluno,IngressamentoAluno);

		System.out.println("\n==> Cadastrar Professor <==");
		System.out.printf("Nome: ");
		String nomeProfessor = scanner.nextLine();
		System.out.printf("Idade: ");
		String idadeProfessor = scanner.nextLine();
		System.out.printf("CPF: ");
		String cpfProfessor = scanner.nextLine();
		System.out.printf("Siape: ");
		String siapeProfessor = scanner.nextLine();
		System.out.printf("Disciplina: ");
		String disciplinaProfessor = scanner.nextLine();

		Professor professor = new Professor(nomeProfessor, idadeProfessor, cpfProfessor, siapeProfessor, disciplinaProfessor);

		System.out.println("\n==> Cadastrar Tecnico <==");
		System.out.printf("Nome: ");
		String nomeTecnico = scanner.nextLine();
		System.out.printf("Idade: ");
		String idadeTecnico = scanner.nextLine();
		System.out.printf("CPF: ");
		String cpfTecnico = scanner.nextLine();
		System.out.printf("Setor: ");
		String setorTecnico = scanner.nextLine();
		System.out.printf("Cargo: ");
		String cargoTecnico = scanner.nextLine();

		Tecnico tecnico = new Tecnico(nomeTecnico, idadeTecnico, cpfTecnico, setorTecnico, cargoTecnico);

		System.out.println("\n==> Dados Cadastrados <==");
		System.out.println("\nDados do Aluno:");
		aluno.exibirDados();
		System.out.println("\nDados do Professor:");
		professor.exibirDados();
		System.out.println("\nDados do Tecnico:");
		tecnico.exibirDados();

		mapaPessoas.put(aluno.getCpf(), aluno);
		mapaPessoas.put(professor.getCpf(), professor);
		mapaPessoas.put(tecnico.getCpf(), tecnico);

		System.out.println("\n==> (chave = CPF) <==");
		for (String chave : mapaPessoas.keySet()) {
			Pessoa p = mapaPessoas.get(chave);
			System.out.println("hashCode: " + p.hashCode());
			System.out.println();
		}
	}
}
