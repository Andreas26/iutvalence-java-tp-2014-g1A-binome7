public class Case
{
    private boolean minee; // La case est soit min�e, soit vide
    private boolean decouverte; // La case est soit d�couverte, soit non d�couverte
    private boolean drapeau; // La case est marqu�e d'un drapeau, ou non
    private int minesAdjacentes;
    
    public Case() {
	minee = false;
	decouverte = false;
	drapeau = false;
	minesAdjacentes = 0;
    }
    
    public boolean minee() {
	return minee;
    }
    
    public void miner() {
	minee = true;
    }
    
    public void decouvrir() {
	decouverte = true;
    }
    
    public void incrementerAdjacent() {
	minesAdjacentes++;
    }
    
    public int adjacents() {
	return minesAdjacentes;
    }
    
    @Override
    public String toString() {
	if (decouverte && !minee) {
	    return ".";
	}
	if (decouverte && minee) {
	    return "*";
	}
	/* XXX */
	if (!decouverte) {
	    return "#";
	}
	return "X";
    }
}