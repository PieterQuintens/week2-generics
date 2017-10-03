package be.pxl.generics.opdracht1;

import java.util.ArrayList;

public class League<T extends Team<Player>> {
	
	private ArrayList<T> league = new ArrayList<>();
	
	public void addTeam(T team) {
		league.add(team);
	}
	
	public void printTeams() {
		for(Team<Player> team: league) {
			System.out.println(team.getName() + " " + team.ranking());
		}
	}
	
}
