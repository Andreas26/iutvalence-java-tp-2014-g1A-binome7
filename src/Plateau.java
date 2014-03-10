public class Plateau
{
	private static final int NOMBRE_DE_LIGNES = 9;

	private static final int NOMBRE_DE_COLONNES = 9;

	private Case[][] cases;

	/**
	 * Construire un nouveau plateau de démineur, vide
	 */

	public Plateau()
	{
		this.cases = new Case[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];

		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++);
	}
}