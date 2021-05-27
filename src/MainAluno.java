
public class MainAluno {

	public static void main(String[] args) {
		
		Aluno [] ListaAlunos = new Aluno[15];
		
		ListaAlunos[0]= new Aluno();
		ListaAlunos[0].setNome("Lucas");
		ListaAlunos[0].setSerie("Primeira Serie");
		ListaAlunos[0].setGrau("Segundo");
		
		System.out.println("O "+ ListaAlunos[0].getNome());
		System.out.println("Está na "+ListaAlunos[0].getSerie());
		System.out.println("E no "+ListaAlunos[0].getGrau());
		System.out.println(" ");
		
		ListaAlunos[1]= new Aluno();
		ListaAlunos[1].setNome("Matheus");
		ListaAlunos[1].setSerie("Segunda Serie");
		ListaAlunos[1].setGrau("Terceiro");
		
		System.out.println("O "+ ListaAlunos[1].getNome());
		System.out.println("Está na "+ListaAlunos[1].getSerie());
		System.out.println("E no "+ListaAlunos[1].getGrau());
		System.out.println(" ");
		
		ListaAlunos[2]= new Aluno();
		ListaAlunos[2].setNome("Vitor");
		ListaAlunos[2].setSerie("Terceira Serie");
		ListaAlunos[2].setGrau("Quarto");
		
		System.out.println("O "+ ListaAlunos[2].getNome());
		System.out.println("Está na "+ListaAlunos[2].getSerie());
		System.out.println("E no "+ListaAlunos[2].getGrau());
		System.out.println(" ");
	    
		ListaAlunos[2] = null;
		System.gc();
		
		
		System.exit(0);

	}

}
