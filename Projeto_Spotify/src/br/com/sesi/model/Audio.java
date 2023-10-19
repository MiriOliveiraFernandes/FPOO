package br.com.sesi.model;

public class Audio {
	protected String titulo;
	protected double duracao;
	protected int totalDeReproducao;
	protected int curtidas;
	protected int classificacao;
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public int getTotalDeReproducao() {
		return totalDeReproducao;
	}

	public void setTotalDeReproducao(int totalDeReproducao) {
		this.totalDeReproducao = totalDeReproducao;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificao) {
		this.classificacao = classificao;
	}
	
	public void imprimeInfo(){
		System.out.println("Nome: " + titulo);
		System.out.println("Duraçao em minutos " + duracao);
		System.out.println("Classificacao " + classificacao);
	}
	
	public void reproduzir() {
		totalDeReproducao ++;
		
	}
	
	public void curtir(){
		curtidas++;
		
	}
	
	public void verificaReproducao() {
		 if (totalDeReproducao > 10 ) {
			 System.out.println("Musica adiconada aos favoritos");
			
		}
	}

}

