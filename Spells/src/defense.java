
public class defense extends spells
	{
protected String situation;
	@Override
	public void declareWhatDoes()
		{
		
			System.out.println("When defending yourself in " + situation + ", This defense spell would " + result + ".");
		}
	@Override
	public void tellColor()
	{
		System.out.println("This defense spell is " + color + ".");
		System.out.println();
		
	}

	}
