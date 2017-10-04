package be.pxl.generics.opdracht1;

import java.util.ArrayList;

public class League<T extends Player> {
	
	private ArrayList<Team<T>> league = new ArrayList<>();
	
	public void addTeam(Team<T> team) {
		if(!league.contains(team)) {
			league.add(team);
		}
	}
	
	public void printTeams() {
		for(Team<?> team: league) {
			System.out.println(team.getName() + " " + team.ranking());
		}
	}
	
}
