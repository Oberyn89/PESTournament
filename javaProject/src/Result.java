import java.io.IOException;
import java.util.HashMap;


public class Result {
	private Player homePlayer;
	private Player awayPlayer;
	private static String[] attributeList = {"nHomePlayerPossession", "nAwayPlayerPossession", "nHomePlayerShots", "nAwayPlayerShots", "nHomePlayerOnTargetShots", "nAwayPlayerOnTargetShots", "nHomePlayerFouls", "nAwayPlayerFouls", "nHomePlayerOffside", "nAwayPlayerOffside", "nHomePlayerCornerKicks", "nAwayPlayerCornerKicks", "nHomePlayerFreeKicks", "nAwayPlayerFreeKicks", "nHomePlayerPassesCompleted", "nAwayPlayerPassesCompleted", "nHomePlayerCrosses", "nAwayPlayerCrosses", "nHomePlayerInterception", "nAwayPlayerInterception", "nHomePlayerTackles", "nAwayPlayerTackles", "nHomePlayerSaves", "nAwayPlayerSaves", "homePlayerTeamName", "awayPlayerTeamName"};
	private HashMap<String, Integer> extendedResultData;
	private String homeTeamName;
	private String awayTeamName;
	private int configLevel;
	
	
	public Result(Player homePlayer, Player awayPlayer){
		this.awayPlayer = awayPlayer;
		this.homePlayer = homePlayer;
		extendedResultData = new HashMap<String, Integer>();
	}
	
	public void consoleDataInput(int level){
		this.configLevel = level;
		boolean correctInput = false; 
		while (!correctInput){
			System.out.println("give home side goals: ");
			try{
				this.extendedResultData.put("nHomePlayerGoals",System.in.read());
				System.out.println("give away side goals: ");
				this.extendedResultData.put("nAwayPlayerGoals",System.in.read());
				correctInput = true;
			}
			catch (Exception e){
				System.out.println("Error reading from user, please input integer");
			}
		}
		if (level>1){
			correctInput = false;
			while (!correctInput){
				System.out.println("give home side possession: ");
				try{
					this.extendedResultData.put("nHomePlayerPossession", System.in.read());
					System.out.println("give away side possession: ");
					this.extendedResultData.put("nAwayPlayerPossession", System.in.read());
					correctInput = true;
					
				}
				catch (Exception e){
					System.out.println("Error reading from user, please input integer");
				}
			}
		}
	}
	
	public String[] getList(){
		return attributeList;
	}
	
	public HashMap<String, Integer> getExtendedResultData(){
		return extendedResultData;
	}
	
	public void intelligentResultBuild(){
		this.configLevel = 2;
		// to complete with image recognition
	}
	
}
