package model;
import java.util.*;

public class Team{
	private String name;
	private String[] mainCoach=new String[1];
	private String[] assistantCoachs=new String[3];
	private String[] players=new String[25];
	
	public Team(String name){
		this.name=name;
		
	}
	
	public void setName(String name){
		this.name=name;
		
	}
	
	public String getName(){
		return name;
		
	}
	
	public void setMainCoach( String[] mainCoach){
		this.mainCoach=mainCoach;
		
	}
	
	public String[] getMainCoach(){
		return mainCoach;
		
	}
	
	public void setAssistantCoachs(String[] assistantCoachs){
		this.assistantCoachs=assistantCoachs;
		
	}
	
	public String[] getAssistantCoachs(){
		return assistantCoachs;
		
	}
	
	public void setPlayers(String[] players){
		this.players=players;
		
	}
	
	public String[] getPlayers(){
		return players;
		
	}
	
	public void addMainCoach(String coachName){
		for(int i=0; i<mainCoach.length; i++){
			if(mainCoach[i]==null){
				mainCoach[i]=coachName;
			
			}
		}
	}
	
	public void addAssistantCoach(String coachName){
		for(int i=0; i<assistantCoachs.length; i++){
			if(assistantCoachs[i]==null){
				assistantCoachs[i]=coachName;
				i=assistantCoachs.length;
				
			}
		}
	}
	
	public void addPlayer(String playerName){
		for(int i=0; i<players.length; i++){
			if(players[i]==null){
				players[i]=playerName;
				i=players.length;
				
			}
		}
	}
	
	public String getMainCoachString(){
		String mainCoachAux="";
		String[] mainCoachArrayAux=getMainCoach();
		
		for(int i=0; i<mainCoachArrayAux.length; i++){
			if(mainCoachArrayAux[i]!=null){
				mainCoachAux=mainCoachArrayAux[i];
				
				i=mainCoachArrayAux.length;
				
			}
		}
		
		return mainCoachAux;
	}
	
	public String getAssistantCoachsString(){
		String assistantCoachsAux="";
		String[] assistantCoachsArrayAux=getAssistantCoachs();
		
		for(int i=0; i<assistantCoachsArrayAux.length; i++){
			if(assistantCoachsArrayAux[i]!=null){
				assistantCoachsAux+=assistantCoachsArrayAux[i];
				
				i=assistantCoachsArrayAux.length;
				
			}
		}
		
		return assistantCoachsAux;
	}
	
	public String getPlayersString(){
		String playersAux="";
		String[] playersArrayAux=getPlayers();
		
		for(int i=0; i<playersArrayAux.length; i++){
			if(playersArrayAux[i]!=null){
				playersAux+=playersArrayAux[i];
				
				i=playersArrayAux.length;
				
			}
		}
		
		return playersAux;
	}
	
	public String showContents(){
		String info="";
		
		info+="\n-------------------------------------------------------\n\n** Nombre: " + getName() +
		"\n** Entrenador principal: " + getMainCoachString() + "\n** Entrenadores asistentes: " + 
		getAssistantCoachsString() + "\n** Jugadores:" + getPlayersString() + "\n\n-------------------------------------------------------";
		
		return info;
	}
}