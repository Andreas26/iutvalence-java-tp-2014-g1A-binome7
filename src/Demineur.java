public class Demineur
{
    /** Définition des attributs */
    
    // Les compteurs
    private int compteurDeCoups;
    private int compteurDeCasesDecouvertes;
    private int compteurDeDrapeaux;
    
    
    // Les différents tableaux
    private boolean[][] tableauPourCacher;
    private boolean[][] tableauDesDrapeaux;
    
    // Définition de la taille du tableau et du nombre de mines
    
    private final static int NOMBRE_DE_LIGNES = 10;
    private final static int NOMBRE_DE_COLONNES = 10;
    private final static int NOMBRE_DE_MINES = 10;
    
    // Le plateau de jeu
    
    private Case[][] plateauDeJeu;
      
    private boolean estMinee;
    private int nombreDeMinesAdjacentes;
    
   /** Fin des définitions des attributs */
    /** la ligne suivante : public Demineur() est le constructeur*/
    public Demineur()
    {
	this.compteurDeCoups = 0;
	this.compteurDeCasesDecouvertes = 0;
	this.compteurDeDrapeaux = 0;
	this.nombreDeMinesAdjacentes = 0;

	// On crée les 3 tableaux composant le démineur
	
	this.plateauDeJeu = new Case[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];
	this.tableauPourCacher = new boolean[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];
	this.tableauDesDrapeaux = new boolean[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];
	
	for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
	    for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
		this.estMinee=false;
		
    }
    
    public void placerBombesAleatoirement()
    {
	    for(int numeroDeLigne ; numeroDeLigne<nombreDeLignes ; numeroDeLigne++){
	for(int numeroDeColonne ; numeroDeColonne<nombreDeColonnes ; numeroDeColonne++){
	    Math.random()*100 < pourcent)
		}
	}
    }

    public void decouvrirCase()
    {
	
    }
    
    public void determinerNombreDeBombesAdjacentes()
    {
	for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
	    for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
		if 
    }
}