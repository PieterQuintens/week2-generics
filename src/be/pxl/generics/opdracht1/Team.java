package be.pxl.generics.opdracht1;

import java.util.ArrayList;

public class Team<P extends Player> {

	private String name;
	private int played;
	private int won;
	private int lost;
	private int tied;
	private ArrayList<P> members = new ArrayList<P>();

	public Team(String name) {
		this.name = name;
		this.played = 0;
		this.won = 0;
		this.lost = 0;
		this.tied = 0;
	}

	public String getName() {
		return name;
	}

	public int getPlayed() {
		return played;
	}

	public int getWon() {
		return won;
	}

	public int getLost() {
		return lost;
	}

	public int getTied() {
		return tied;
	}

	public ArrayList<P> getMembers() {
		return members;
	}

	public void addPlayer(P player) {
		members.add(player);
	}

	public int numberOfPlayers() {
		return members.size();
	}

	public void matchResult(Team<P> opponent, int ourScore, int theirScore) {
		if (ourScore > theirScore) {
			opponent.lost = opponent.getLost() + 1;
			won = getWon() + 1;
		} else if (ourScore < theirScore) {
			opponent.won = opponent.getWon() + 1;
			lost = getLost() + 1;
		} else {
			opponent.tied = opponent.getTied() + 1;
			tied = getTied() + 1;
		}
		opponent.played = opponent.getPlayed() + 1;
		played = getPlayed() + 1;
	}
	
	public int ranking(){
		int ranking = (won * 3) + tied;
		
		return ranking;
	}
}
