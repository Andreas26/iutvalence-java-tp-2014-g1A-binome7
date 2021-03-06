import java.util.Arrays;
import java.util.Scanner;

public class Demineur {
	/** D�finition des attributs */

	// Les compteurs
	private int compteurDeCoups;
	private int compteurDeCasesDecouvertes;
	private int compteurDeDrapeaux;

	// D�finition de la taille du tableau et du nombre de mines
	private final static int NOMBRE_DE_LIGNES = 4;
	private final static int NOMBRE_DE_COLONNES = 4;
	private final static int NOMBRE_DE_MINES = 4;

	// Le plateau de jeu
	private Case[][] plateauDeJeu;

	public Demineur() {
		this.compteurDeCoups = 0;
		this.compteurDeCasesDecouvertes = 0;
		this.compteurDeDrapeaux = 0;

		// On crée les 3 tableaux composant le démineur
		this.plateauDeJeu = new Case[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];

		// Définir que toutes les cases ne sont pas minées, par défaut
		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
				plateauDeJeu[numeroDeLigne][numeroDeColonne] = new Case();
	}
	
	public void jouer() {
	    placerBombesAleatoirement();
	    System.out.println(this);
	    this.demandeDeSaisie();
	    }
	
	public int demandeDeSaisie()
	{
	    System.out.println("Saisissez la case à découvrir :");	    
	    Scanner selectionCase = new Scanner(System.in);
	    int numeroDeLigne = selectionCase.nextInt();
	    int numeroDeColonne = selectionCase.nextInt();
	    
	}

	// Méthode qui place des bombes de façon aléatoire sur l'ensemble du plateau
	// de jeu
	public void placerBombesAleatoirement()
    {
	    int nbMines = 0;
	    while (nbMines < NOMBRE_DE_MINES) {
	    for(int numeroDeLigne=0 ; numeroDeLigne<NOMBRE_DE_LIGNES ; numeroDeLigne++){
	    	for(int numeroDeColonne=0 ; numeroDeColonne<NOMBRE_DE_COLONNES ; numeroDeColonne++){
	    	    if (Math.random()*100 < 10) {
	    		plateauDeJeu[numeroDeLigne][numeroDeColonne].miner();
	    		nbMines++;
	    		if (nbMines == NOMBRE_DE_MINES) {
	    		    return;
	    		}
	    	    }
		}
	    }
	}
    }

	/** Calcul l'ensemble des nombres de bombes adjacentes des cases du plateau. */
	public void determinerNombreDeBombesAdjacentes()
    {
	for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++) {
	    for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++) {
		Case caseCourante = this.plateauDeJeu[numeroDeLigne][numeroDeColonne];
		if (plateauDeJeu[numeroDeLigne-1][numeroDeColonne-1].minee()) {
		    caseCourante.incrementerAdjacent();
		}
		
		if (plateauDeJeu[numeroDeLigne-1][numeroDeColonne].minee()) {
		    caseCourante.incrementerAdjacent();
		}
		
		if (plateauDeJeu[numeroDeLigne-1][numeroDeColonne+1].minee()) {
		    caseCourante.incrementerAdjacent();
		}
		
		if (plateauDeJeu[numeroDeLigne][numeroDeColonne-1].minee()) {
		    caseCourante.incrementerAdjacent();
		}
		
		if (plateauDeJeu[numeroDeLigne][numeroDeColonne+1].minee()) {
		    caseCourante.incrementerAdjacent();
		}
		
		if (plateauDeJeu[numeroDeLigne+1][numeroDeColonne-1].minee()) {
		    caseCourante.incrementerAdjacent();
		}
		
		if (plateauDeJeu[numeroDeLigne+1][numeroDeColonne].minee()) {
		    caseCourante.incrementerAdjacent();
		}
		
		if (plateauDeJeu[numeroDeLigne+1][numeroDeColonne+1].minee()) {
		    caseCourante.incrementerAdjacent();
		}

	    }
	}
    }

	public String toString()
	{
	    String demineurAsciiArt = "";
		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++) {
			demineurAsciiArt += '|';
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++) {
				demineurAsciiArt += plateauDeJeu[numeroDeLigne][numeroDeColonne] + "|";
			}
			demineurAsciiArt += '\n';					
		}
		return demineurAsciiArt;
	}
	
	
}
