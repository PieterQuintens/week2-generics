package be.pxl.generics.opdracht1;

public class TestClassApp {

	public static void main(String[] args) {
		
		SoccerPlayer player1 = new SoccerPlayer("Jos");
		SoccerPlayer player3 = new SoccerPlayer("Joseph");
		VolleyballPlayer player2 = new VolleyballPlayer("Mieke");
		
		Team<Player> team1 = new Team<>("team1");
		Team<Player> team3 = new Team<>("team3");
		Team<Player> team4 = new Team<>("team4");
		
		League<Team<Player>> league1 = new League<>();
		
		league1.addTeam(team1);
		league1.addTeam(team3);
		league1.addTeam(team4);

		Team<VolleyballPlayer> team2 = new Team<>("team2");
		
		team1.addPlayer(player1);
		team1.addPlayer(player3);
		//team1.addPlayer(player2);
		
		// team1.matchResult(team2, 20, 10);
		
		for(int i = 0 ; i < team1.getMembers().size() ; i++) {
			System.out.println(team1.getMembers().get(i).getName());			
		}
		//System.out.println(team1.getMembers());
		
		league1.printTeams();
		
	}

}
