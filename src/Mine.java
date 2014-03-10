public class Mine
{

    private final static int nbMines = 10;

    public enum mine {
	
	MINE,

	VIDE;

	
	public String toString()
	{
	    if (this.mine == MINE)
		return "M";
	    else
		return "V";
	    }
	}
    
    public void PlaceMines()
    {
	
    int CompteMines;
    for (CompteMines=0;CompteMines<NbMines;CompteMines++)
    
    {
    
	lignes=(int) (Math.random()%10);
    
	colonnes=(int) (Math.random()%10);
    
	if(t2[lignes][colonnes]=='0')//On vérifie que la case est libre
    {
    	    t2[lignes][colonnes]='M';//on place un M pour indiquer qu'il y a une mine
    }

    else
    {
    NbMines++;//Sinon, il y a déjà un M et il faut faire un tour de plus
    }
    }
    }
}

