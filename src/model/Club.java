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
	private ArrayList<Alignment> alignments=new ArrayList<Alignment>();

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
	
	public void orederOffMainCoach(String coachName){
		for(int i=0; i<mainCoachs.size(); i++){
			if(coachName.equalsIgnoreCase(mainCoachs.get(i).getName())){
				mainCoachs.get(i).setStatus(false);
				
				for(int j=0; j<teams.length; j++){
					String[] coachsAux=teams[j].getMainCoach();
					
					if(coachName.equalsIgnoreCase(coachsAux[i])){
						coachsAux[i]=null;
						
						teams[j].setMainCoach(coachsAux);
						
						i=mainCoachs.size();
					}
				}
			}
		}		
	}
	
	public void addAssistantCoach(String name, double salary, int id, boolean status, int experienceYears, int professionalSelect){
		assistantCoachs.add(new AssistantCoach(name, salary, id, status, experienceYears, professionalSelect));
		
		
	}
	
	public void orederOffAssistantCoach(String coachName){
		for(int i=0; i<assistantCoachs.size(); i++){
			if(coachName.equalsIgnoreCase(assistantCoachs.get(i).getName())){
				assistantCoachs.get(i).setStatus(false);
				
				for(int j=0; j<teams.length; j++){
					String[] coachsAux=teams[j].getAssistantCoachs();
					
					if(coachName.equalsIgnoreCase(coachsAux[i])){
						coachsAux[i]=null;
						
						teams[j].setAssistantCoachs(coachsAux);
						
						i=assistantCoachs.size();
					}
				}
			}
		}		
	}
	
	public void addPlayer(String name, double salary, int id, boolean status, int shirtNum, int goals, double qualification, int positionSelect, int experticiesSelect){
		players.add(new Players(name,salary,id,status,shirtNum,goals,qualification,positionSelect,experticiesSelect));
		
	}
	
	public void orederOffPlayer(String playerName){
		for(int i=0; i<players.size(); i++){
			if(playerName.equalsIgnoreCase(players.get(i).getName())){
				players.get(i).setStatus(false);
				
				
				for(int j=0; j<teams.length; j++){
					String[] playersAux=teams[j].getPlayers();

					if(playerName.equalsIgnoreCase(playersAux[i])){
						playersAux[i]=null;
						
						teams[j].setPlayers(playersAux);
						
						i=players.size();
					}
				}
			}
		}		
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
				playerPrice=players.get(i).calculatePrice();
				
				i=players.size();
			}
		}
		
		return playerPrice;
	}
	
	public double calculateMarketPriceCoach(String coachName){
		double coachPrice=0;
		
		for(int i=0; i<mainCoachs.size(); i++){
			if(coachName.equalsIgnoreCase(mainCoachs.get(i).getName())){
				coachPrice=mainCoachs.get(i).calculatePrice();
				
				i=mainCoachs.size();
			}
		}
		
		return coachPrice;
	}
	
	public double calculateLevelPlayer(String playerName){
		double playerLevel=0;
		
		for(int i=0; i<players.size(); i++){
			if(playerName.equalsIgnoreCase(players.get(i).getName())){
				players.get(i).calculateLevel();
				
				i=players.size();
			}
		}
		
		return playerLevel;
	}
	
	public double calculateLevelCoach(String coachName){
		double coachLevel=0;
		
		for(int i=0; i<mainCoachs.size(); i++){
			if(coachName.equalsIgnoreCase(mainCoachs.get(i).getName())){
				coachLevel=mainCoachs.get(i).calculateLevel();
				
				i=mainCoachs.size();
			}
		}
		
		return coachLevel;
	}
	
	public String getAllInfo(){
		String info="";
		
		info+="\n----------------------------Informacion general---------------------------\n\n** Nombre: " + getName() + "\n** NIT: " +
		getNIT() + "\n** Fecha de fundacion: " + getFundationDate() + "\n\n----------Jugadores----------\n" + 
		getInfoPlayers() + "\n\n----------Entrenadores principales----------\n" + getInfoMainCoach() +
		"\n\n----------Entrenadores asistentes----------\n" + getInfoAssistantCoach() + 
		"\n\n----------Equipos----------\n" + getInfoTeams();
		
		return info;
	}
	
	public void addAlignment(){	
		String[] formation1=new String[7];
		String[] formation2=new String[7];
		String[] formation3=new String[7];
		
		for(int i=0; i<formation1.length;i++){
			if(i==0){
				formation1[i]="0001000";
			}
			
			else if(i==1){
				formation1[i]="0100010";
			}
			
			else if(i==2){
				formation1[i]="0000000";
			}
			
			else if(i==3){
				formation1[i]="0000000";
			}
			
			else if(i==4){
				formation1[i]="0110110";
			}
			
			else if(i==5){
				formation1[i]="0000000";
			}
			
			else if(i==6){
				formation1[i]="0110110";
			}
		}

		alignments.add(new Alignment("4-4-2","23/09/2002","Hay 2 defensas, 4 volantes y 4 delanteros que atacan al equipo contrario.",formation1));
		
		for(int i=0; i<formation2.length;i++){
			if(i==0){
				formation2[i]="0001000";
			}
			
			else if(i==1){
				formation2[i]="0110110";
			}
			
			else if(i==2){
				formation2[i]="0000000";
			}
			
			else if(i==3){
				formation2[i]="0000000";
			}
			
			else if(i==4){
				formation2[i]="0101010";
			}
			
			else if(i==5){
				formation2[i]="0000000";
			}
			
			else if(i==6){
				formation2[i]="0101010";
			}
		}
			
			alignments.add(new Alignment("4-3-3","23/07/2002","Hay 4 defensas, 3 volantes y 3 delanteros que atacan al equipo contrario.",formation2));
		
		for(int i=0; i<formation3.length;i++){
			if(i==0){
				formation3[i]="0001000";
			}
			
			else if(i==1){
				formation3[i]="0110110";
			}
			
			else if(i==2){
				formation3[i]="0000000";
			}
			
			else if(i==3){
				formation3[i]="0101010";
			}
			
			else if(i==4){
				formation3[i]="0100010";
			}
			
			else if(i==5){
				formation3[i]="0000000";
			}
			
			else if(i==6){
				formation3[i]="0001000";
			}
		}
		
		alignments.add(new Alignment("4-3-2-1","01/07/2002","Hay 4 defensas, 3 volantes y 3 delanteros que atacan al equipo contrario.",formation3));
	}
	
	public void addAlignmentTeam(String teamName, String alignmentName){
		for(int i=0; i<teams.length; i++){
			if(teamName.equalsIgnoreCase(teams[i].getName())){
				for(int j=0; j<alignments.size();j++){
					if(alignmentName.equalsIgnoreCase(alignments.get(j).getName())){	
						teams[i].addAlignment(alignmentName);
						
						i=teams.length;
					}
				}
				
			}
		}
	}
	
	public String getAlignment(){
		String alignmentsInfo="";
		
		for(int i=0; i<alignments.size(); i++){
			alignmentsInfo+="\n-------------------------------------------------------\n** Nombre: " + alignments.get(i).getName() + 
			"\n** Tactica: " + alignments.get(i).getTactic() + "\n** Fecha: " + alignments.get(i).getDate() + 
			"\n** Formacion:\n" + alignments.get(i).getFormationString() + "\n-------------------------------------------------------";
			
		}
		
		return alignmentsInfo;
	}
}