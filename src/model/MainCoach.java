package model;

public class MainCoach extends Plant implements CalculatePriceNLevel{
	private int experienceYears;
	private int quantityTeams;
	private int championshipsWon;
	
	public MainCoach(String name, double salary, int id, boolean status, int experienceYears, int quantityTeams, int championshipsWon){
		super(name,salary,id,status);
		this.experienceYears=experienceYears;
		this.quantityTeams=quantityTeams;
		this.championshipsWon=championshipsWon;
		
	}
	
	public void setExperienceYears(int experienceYears){
		this.experienceYears=experienceYears;
		
	}
	
	public int getExperienceYears(){
		return experienceYears;
		
	}
	
	public void setQuantityTeams(int quantityTeams){
		this.quantityTeams=quantityTeams;
		
	}
	
	public int getQuantityTeams(){
		return quantityTeams;
		
	}
	
	public void setChampionshipsWon(int championshipsWon){
		this.championshipsWon=championshipsWon;
		
	}
	
	public int getChampionshipsWon(){
		return championshipsWon;
		
	}
	
	@Override
	public double calculatePrice(){
		double price=0;
		
		price=(getSalary()*10)+((double)getExperienceYears()*100)+((double)getChampionshipsWon()*50);
		
		return price;
	}
	
	@Override
	public double calculateLevel(){
		double level=0;

		level=5+((double)getChampionshipsWon()/10);
		
		return level;
	}
	
	@Override
	public String showContents(){
		String info="";
		
		info+=super.showContents() + "\n** Anios de experiencia: " + getExperienceYears() + "\n** Equipos: " + 
		getQuantityTeams() + "\n** Campeonatos: " + getChampionshipsWon() + "\n-------------------------------------------------------";
		
		return info;
	}
}