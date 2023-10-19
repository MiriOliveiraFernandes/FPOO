package br.com.sesi.model;
import java.util.Scanner;
public class Podcast extends Audio {
	private int episodio;
	private String descricaoEpisodio;
	private String tematica;
	private String convidados;
	Scanner scan = new Scanner(System.in);
	
	public int getEpisodio() {
		return episodio;
	}
	public void setEpisodio(int episodio) {
		this.episodio = episodio;
	}
	public String getDescricaoEpisodio() {
		return descricaoEpisodio;
	}
	public void setDescricaoEpisodio(String descricaoEpisodio) {
		this.descricaoEpisodio = descricaoEpisodio;
	}
	public String getTematica() {
		return tematica;
	}
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	public String getConvidados() {
		return convidados;
	}
	public void setConvidados(String convidados) {
		this.convidados = convidados;
	}
	
	@Override
	public void imprimeInfo() {
		// TODO Auto-generated method stub
		super.imprimeInfo();
		System.out.println("Convidado da semana:  " + convidados);
		System.out.println("Número do episódio: "+ episodio);
		System.out.println("Temática do Episodio: "+ tematica);
		System.out.println("Descricao do episódio: " + descricaoEpisodio);
	}
	
	public void pedeInfoPodcast() {
		System.out.println("Digite o nome do podcast:");
		setTitulo(scan.next());
		System.out.println("Digite o número do episódio:");
		setEpisodio(scan.nextInt());
		System.out.println("Digite a temática desse episódio: ");
		setTematica(scan.next());
		System.out.println("Digite a descrição desse episódio:");
		setDescricaoEpisodio(scan.next());
		System.out.println("Nome do convidados(as) desse episódio :");
		setConvidados(scan.next());
		System.out.println("Duraçao desse episódio:");
		setDuracao(scan.nextDouble());
		System.out.println("Digite a classificação");
		setClassificacao(scan.nextInt());
	
		
	}
	
	
}
