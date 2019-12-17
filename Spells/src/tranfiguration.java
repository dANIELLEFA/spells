
public class tranfiguration extends spells
	{
protected String bestThing;
@Override
public  void declareWhatDoes()
{
	System.out.println("You turned a " + bestThing + "into a " + result + ".");
}
public  void undoSpell()
{
	System.out.println("The "+ result +" turned back into a " + bestThing + ".");
}

	}
