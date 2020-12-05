package model;
import java.util.*;

public class Club{
	private String name;
	private int NIT;
	private String fundationDate;
	private ArrayList<MainCoach> mainCoachs=new ArrayList<MainCoach>();
	private ArrayList<AssistantCoach> assistantCoachs=new ArrayList<AssistantCoach>();
	private ArrayList<Players> players=new ArrayList<Players>();
	private Team[] teams=new Team[2];

	public Club(String name, int NIT, String fundationDate){
		this.name=name;
		this.NIT=NIT;
		this.fundationDate=fundationDate;
		
	}
	
	public void setName(String name){
		this.name=name;
		
	}
	
	public String getName(){
		return name;
	
	}
	
	public void setNIT(int NIT){
		this.NIT=NIT;
		
	}
	
	public int getNIT(){
		return NIT;
		
	}
	
	public void setFundationDate(String fundationDate){
		this.fundationDate=fundationDate;
		
	}
	
	public String getFundationDate(){
		return fundationDate;
		
	}
	
	public void addTeam(String name){
		for(int i=0; i<teams.length; i++){
			if(teams[i]==null){
				teams[i]=new Team(name);
				i=teams.length;
				
			}
		}
	}
	
	public void addMainCoach(String name, double salary, int id, boolean status, int experiencieYears, int quantityTeams, int championshipsWon){
		mainCoachs.add(new MainCoach(name, salary, id, status, experiencieYears, quantityTeams, championshipsWon));
		
	}
	
	public void addAssistantCoach(String name, double salary, int id, boolean status, int experienceYears, int professionalSelect){
		assistantCoachs.add(new AssistantCoach(name, salary, id, status, experienceYears, professionalSelect));
		
		
	}
	
	public void addPlayer(String name, double salary, int id, boolean status, int shirtNum, int goals, double qualification, int positionSelect, int experticiesSelect){
		players.add(new Players(name,salary,id,status,shirtNum,goals,qualification,positionSelect,experticiesSelect));
		
	}
	
	public String getInfoMainCoach(){
		String info="";
		
		for(int i=0; i<mainCoachs.size(); i++){
			info+=mainCoachs.get(i).showContents();
			
		}
		
		return info;		
	}
	
	public String getInfoAssistantCoach(){
		String info="";
		
		for(int i=0; i<assistantCoachs.size(); i++){
			info+=assistantCoachs.get(i).showContents();
			
		}
		
		return info;
	}
	
	public String getInfoPlayers(){
		String info="";
		
		for(int i=0; i<players.size(); i++){
			info+=players.get(i).showContents();
			
		}
		
		return info;
	}
	
	public void addMainCoachTeam(String coachName, String teamName){
		for(int i=0; i<mainCoachs.size(); i++){
			if(coachName.equalsIgnoreCase(mainCoachs.get(i).getName()) && teamName.equalsIgnoreCase(teams[i].getName())){
				teams[i].addMainCoach(coachName);
				i=mainCoachs.size();
				
			}
		}
	}
	
	public void addAssistantCoachTeam(String coachName, String teamName){
		for(int i=0; i<assistantCoachs.size(); i++){
			if(coachName.equalsIgnoreCase(assistantCoachs.get(i).getName()) && teamName.equalsIgnoreCase(teams[i].getName())){
				teams[i].addAssistantCoach(coachName);
				i=assistantCoachs.size();
				
			}
		}
	}
	
	public void addPlayerTeam(String playerName, String teamName){
		for(int i=0; i<players.size(); i++){
			if(playerName.equalsIgnoreCase(players.get(i).getName()) && teamName.equalsIgnoreCase(teams[i].getName())){
				teams[i].addPlayer(playerName);
				i=players.size();
				
			}
		}
	}
	
	public String getInfoTeams(){
		String info="";
		
		for(int i=0; i<teams.length; i++){
			if(teams[i]!=null){
				info+=teams[i].showContents();
				
			}
		}
		
		return info;
	}
	
	public double calculateMarketPricePlayer(String playerName){
		double playerPrice=0;
		
		for(int i=0; i<players.size(); i++){
			if(playerName.equalsIgnoreCase(players.get(i).getName())){
				if(players.get(i).getPosition().equalsIgnoreCase("Portero")){
					Players playerAux=players.get(i);
					
					playerPrice=(playerAux.getSalary()*12)+(playerAux.getQualification()*150);
				}
				
				else if(players.get(i).getPosition().equalsIgnoreCase("Defensor")){
					Players playerAux=players.get(i);
					
					playerPrice=(playerAux.getSalary()*13)+(playerAux.getQualification()*125)+(playerAux.getGoals()*100);
				}
				
				else if(players.get(i).getPosition().equalsIgnoreCase("Volante")){
					Players playerAux=players.get(i);
					
					playerPrice=(playerAux.getSalary()*14)+(playerAux.getQualification()*135)+(playerAux.getGoals()*125);
				}
				
				else if(players.get(i).getPosition().equalsIgnoreCase("Delantero")){
					Players playerAux=players.get(i);
					
					playerPrice=(playerAux.getSalary()*15)+(playerAux.getQualification()*145)+(playerAux.getGoals()*150);
				}
			}
		}
		
		return playerPrice;
	}
}