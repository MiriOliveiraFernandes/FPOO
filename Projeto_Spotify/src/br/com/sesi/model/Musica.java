package br.com.sesi.model;
import java.util.Scanner;
public class Musica extends Audio{
	private String cantor;
	private String album;
	private String estiloMusical;
	Scanner scan = new Scanner(System.in);
	public String getCantor() {
		return cantor;
	}
	public void setCantor(String cantor) {
		this.cantor = cantor;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getEstiloMusical() {
		return estiloMusical;
	}
	public void setEstiloMusical(String estiloMusical) {
		this.estiloMusical = estiloMusical;
	}
	 
	@Override
	public void imprimeInfo() {
		// TODO Auto-generated method stub
		super.imprimeInfo();
		System.out.println("Nome do Cantor(a): " + cantor);
		System.out.println("Albúm:" + album);
		System.out.println("Genero Musical: " + estiloMusical);
	}

	public void pedirInfoMusic() {
		System.out.println("Digite o nome da musica:");
		setTitulo(scan.next());
		System.out.println("Digite o nome do cantor(a):");
		setCantor(scan.next());
		System.out.println("Digite o Gênero Musical");
		setEstiloMusical(scan.next());
		System.out.println("Digite o nome do Álbum");
		setAlbum(scan.next());
		System.out.println("Digite a duração de musica");
		setDuracao(scan.nextDouble());
		System.out.println("Digite a classificação");
		setClassificacao(scan.nextInt());
	}

}