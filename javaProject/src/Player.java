import java.util.HashMap;


public class Player {
	private String name;
	private HashMap<Player, Matchup> leagueMatchups;
	
	public void Player(String name){
		this.name = name;
	}
	
	public int addMatch(Player opponent, Result result){
		return 0;
	}
}
