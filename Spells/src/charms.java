
public class charms extends spells
{
	
	@Override
	public void declareWhatDoes()
		{
			System.out.println("This charms spell " + result + ".");
			
		}

	@Override
	public void tellColor()
	{
		System.out.println("This charms spell is " + color + ".");
		System.out.println();
		
	}

	}
