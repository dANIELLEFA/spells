import java.util.Scanner;

public class SpellRunner
	{
		static Scanner stringInput = new Scanner (System.in);
		public static void main(String[] args)
			{
				spells [] resource = new spells[4];
				Transfiguration badgering  = new Transfiguration();
				charms engorgio = new charms();
				defense protego = new defense();
				attack crucio = new attack();
				badgering.color = "green";
				badgering.lastTime = 20;
				badgering.result = "badger";
				badgering.bestThing = "cauldron";
				badgering.makeNoise();
				badgering.declareWhatDoes();
				badgering.declareHowLong();
				badgering.undoSpell();
				badgering.tellColor();
				engorgio.lastTime = 2;
				engorgio.color = "light blue";
				engorgio.result = "causes swelling";
				engorgio.makeNoise();
				engorgio.declareWhatDoes();
				engorgio.declareHowLong();
				engorgio.tellColor();
				protego.color = "transparent";
				protego.situation = "fight";
				protego.lastTime = 5;
				protego.result = "shield you";
				protego.makeNoise();
				protego.declareWhatDoes();
				protego.declareHowLong();
				protego.tellColor();
				crucio.color = "red";
				crucio.hurt = 19;
				crucio.lastTime = 7;
				crucio.result = "Excruciating pain";
				crucio.makeNoise();
				crucio.declareWhatDoes();
				crucio.declareHowLong();
				crucio.hurtMainCharacter();
				crucio.tellColor();

			}

	}
