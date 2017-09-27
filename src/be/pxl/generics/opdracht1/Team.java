package be.pxl.generics.opdracht1;

import java.util.ArrayList;

public class Team<E> {

	private String name;
	private int played;
	private int won;
	private int lost;
	private int tied;
	private ArrayList<? extends Player> members = new ArrayList<Player>();
	
	public Team(String name){
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
	public ArrayList<?> getMembers() {
		return members;
	}
	
	public void addPlayer(){
		
	}
	
	public int numberOfPlayers(){
		return members.size();
	}
}
