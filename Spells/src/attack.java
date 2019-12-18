
public class attack extends spells
	{
 //protected String damage;
 protected int hurt;

@Override
public void declareWhatDoes()
	{
		System.out.println("This attack spell causes " + result + ".");
		
	}

public void hurtMainCharacter()
{
	System.out.println("It hurt a main character " + hurt + " times.");
}


@Override
public void tellColor()
{
	System.out.println("This attack spell is " + color + ".");
	System.out.println();
	
}

	}
