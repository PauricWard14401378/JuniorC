import java.util.Random;
public class DiceRoll {
	 int DiceNumber;
		public int Roll(){
		Random rand = new Random();
		DiceNumber = (rand.nextInt(6) + 1);
		return DiceNumber;
		}
}
