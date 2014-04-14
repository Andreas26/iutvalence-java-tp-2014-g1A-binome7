public class Case
{
    private boolean minee; // La case est soit minée, soit vide
    private boolean decouverte; // La case est soit découverte, soit non découverte
    private boolean drapeau; // La case est marquée d'un drapeau, ou non
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
	if (decouverte && !minee && minesAdjacentes==0) {
	    return ".";
	}
	if (decouverte && !minee) {
	    return Integer.toString(minesAdjacentes);
	}
	if (decouverte && minee) {
	    return "*";
	}
	if (drapeau) {
	    return "!";
	}
	if (!decouverte) {
	    return "#";
	}
	return "X";
    }
}
