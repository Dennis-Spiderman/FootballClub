package model;

public class Alignment{
	private String date;
	private String tactic;
	private int formation;
	
	public Alignment(String date, String tactic, int formation){
		this.date=date;
		this.tactic=tactic;
		this.formation=formation;
		
	}
	
	public void setDate(String date){
		this.date=date;
		
	}
	
	public String getDate(){
		return date;
		
	}
	
	public void setTactic(String tactic){
		this.tactic=tactic;
		
	}
	
	public String getTactic(){
		return tactic;
		
	}
	
	public void setFormation(int formation){
		this.formation=formation;
		
	}
	
	public int getFormation(){
		return formation;
		
	}
}