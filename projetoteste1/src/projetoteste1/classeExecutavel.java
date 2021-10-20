package projetoteste1;

public class classeExecutavel {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Jossana");
		aluno.setIdade(32);
		
		System.out.println("Nome: "+aluno.getNome());
		System.out.println("Idade: "+aluno.getIdade());
	}

}
