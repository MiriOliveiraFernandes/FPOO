package br.com.sesi.app;
import br.com.sesi.model.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Musica musica = new Musica();
		Podcast podcast = new Podcast();
		int dado;
		boolean ativa = true;
		while (ativa == true) {
			System.out.println("\nDigite o que você deseja fazer: ");
			System.out.println("1| Criar uma música");
			System.out.println("2| Criar um podcast");
			System.out.println("3| Imprimir todas as informações");
			System.out.println("4| Imprimir as informações de Música");
			System.out.println("5| Imprimir as informações de Podcast");
			System.out.println("6| Reproduzir uma música");
			System.out.println("7| Curtir a música");
			System.out.println("8| Reproduzir um podcast");
			System.out.println("9| Curtir o podcast");
			System.out.println("10| Total de Reprodução e Curtida");
			System.out.println("11| Sair");
			
			dado = scan.nextInt();
			
			switch (dado) {
			case 1:
				musica.pedirInfoMusic();
				break;
			case 2:
				podcast.pedeInfoPodcast();
				break;
			case 3:
				System.out.println("\n******************************Informações da Música******************************");
				musica.imprimeInfo();
				System.out.println("-----------------------------------------------------------------------------------");
				System.out.println("******************************Informações da Podcast******************************");
				podcast.imprimeInfo();	
				System.out.println("-----------------------------------------------------------------------------------");

				break;
			case 4:
				musica.imprimeInfo();	
				break;
				
			case 5:
				podcast.imprimeInfo();				
				break;
				
			case 6:
				musica.reproduzir();
				System.out.println("A música esta tocando");
				break;
			case 7:
				musica.curtir();
				System.out.println("VOCÊ CURTIU ESSA MÚSICA");
				break;
			case 8:
				podcast.reproduzir();
				System.out.println("Você está escultando um podcast");
				break;
			case 9:
				podcast.curtir();
				System.out.println("VOCÊ CURTIU ESSA PODCAST");
				break;
			case 10:
				System.out.println("Total de Curtidas da Musica: "+ musica.getCurtidas());
				System.out.println("Total de Reprodução da Musica: "+ musica.getTotalDeReproducao());
				System.out.println("Total de Curtidas da Podcast: "+ podcast.getCurtidas());
				System.out.println("Total de Reprodução da Podcast: "+ podcast.getTotalDeReproducao());
				break;
			case 11:
				ativa = false;
				System.out.println("----------------------FIM DO PROGRAMA------------------------\nObrigada por ter utilizado");
			default:
				break;
			}
		}
		

		
	}

}
