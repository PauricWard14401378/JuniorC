import java.util.Random;

public class Sprint1 {
	private static final String winner = null;
	
	public static int Roll(){
		int DiceNumber=0;
		Random rand = new Random();
		DiceNumber = (rand.nextInt(6) + 1);
		return DiceNumber;
		}
	
	public static int Country_Search(String Country){
		int countryNum=0;
		for(int i=0;i<42;i++){
			if(Country==GameData.COUNTRY_NAMES[i]){
				countryNum=i;
			}
			
		}
		return countryNum;
	}
	
	
	public static void main (String args[]) {	   
		Board board = new Board();
		UI ui = new UI(board);
		int playerId, countryId;
		String name;
		
		// display blank board
		ui.displayMap();
		
		// get player names
		for (playerId=0; playerId<GameData.NUM_PLAYERS; playerId++) {
			ui.displayString("Enter the name of player " + (playerId+1));
			name = ui.getCommand();
			ui.displayString("> " + name);
			ui.displayString("Player "+ (playerId+1)+" is the color "+ MapPanel.PLAYER_COLORS_NAMES[playerId]);
		}
	
		// add units
		countryId = 0;
		for (playerId=0; playerId<GameData.NUM_PLAYERS; playerId++) {
			for (int i=0; i<GameData.INIT_COUNTRIES_PLAYER; i++) {
				board.addUnits(countryId, playerId, 1);
				countryId++;
			}
		}
		for (; playerId<GameData.NUM_PLAYERS_PLUS_NEUTRALS; playerId++) {
			for (int i=0; i<GameData.INIT_COUNTRIES_NEUTRAL; i++) {
				board.addUnits(countryId, playerId, 1);
				countryId++;
			}
		}		

		// display map
		ui.displayMap();

		
		//Sprint 2
		int P1=0;
		int P2=0;
		while(P1==P2){
		P1=Roll();
		P2=Roll();
		}
		String winner="";
		String loser="";
		int w=0;
		int l=1;
		if(P1>P2){
			winner = "Player 1";
			w=0;
			loser = "Player 2";
			l=1;
			}
		else{
			winner = "Player 2";
			w=1;
			loser = "Player 1";
			l=0;
			}
			
			for(int i=0;i<18;i++){
				int Units_Per_Turn=3;
				int Units=1;
				if(i%2==0){
					ui.displayString(winner+", take your turn! Place 3 units of own and 1 of the neutral terrorities. Enter the country you want to reinforce.");
					while(Units_Per_Turn!=0){
					String Selected=ui.getCommand();
					
					//board.addUnits(, w, Units);
						}
					}
				if(i%2==1){
					ui.displayString(loser+", take your turn!");
					ui.getCommand();
					}
			}
		return;
	}
}

