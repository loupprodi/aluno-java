import javax.swing.*;

public class Aluno {
	
	private static int quantidade = 0; 
	
	private String nome;
	private String serie;
	private String grau;

	//Construtores
	public Aluno(String nome, String serie, String grau){
		this.nome = nome;
		this.serie = serie;
		this.grau = grau;
	}
	
	public Aluno (){
		quantidade++;
	}
	
	//Finalizador
	protected void finalize() {
		quantidade--;
		System.out.println("Finalizou um objeto");
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public void setSerie(String serie) {
		this.serie=serie;
	}
	
	public void setGrau(String grau) {
		this.grau=grau;
	}
	
	//Getters
	
	public String getNome() {
		return nome;
	}
	
	public String getSerie() {
		return serie;
	}
	
	public String getGrau() {
		return grau;
	}

}
