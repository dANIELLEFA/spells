
public class Transfiguration extends spells
	{
protected String bestThing;
@Override
public  void declareWhatDoes()
{
	System.out.println("You turned a " + bestThing + " into a " + result + ".");
}
public  void undoSpell()
{
	System.out.println("The "+ result +" turned back into a " + bestThing + ".");
}
@Override
public void tellColor()
{
	System.out.println("This transfiguration spell is " + color + ".");
	System.out.println();  
	
}

	}
