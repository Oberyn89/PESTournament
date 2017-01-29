import java.util.HashMap;


public class Matchup {
	private Player player1;
	private Player player2;
	private int matchesPlayed;
	private HashMap<String, Integer> cummulativeData;

	public Matchup(Player player1, Player player2){
		this.player1 = player1;
		this.player2 =  player2;
		this.matchesPlayed = 0;
		this.cummulativeData = new HashMap<String, Integer>();
	}
	
	public void updateMatchup(Result result){
		for (int i=0;i==result.getList().length-1;i++){
			String attributeName = result.getList()[i];
			int newStat = result.getExtendedResultData().get(attributeName);
			int oldStat = cummulativeData.get(attributeName);
			cummulativeData.put(attributeName, oldStat + newStat);
		}
	}

}
