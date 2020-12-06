package model;

public class Alignment{
	private String name;
	private String date;
	private String tactic;
	private String[] formation=new String[7];
	
	public Alignment(String name, String date, String tactic, String[] formation){
		this.name=name;
		this.date=date;
		this.tactic=tactic;
		this.formation=formation;
		
	}
	
	public void setName(String name){
		this.name=name;
		
	}
	
	public String getName(){
		return name;
		
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
	
	public void setFormation(String[] formation){
		this.formation=formation;
		
	}
	
	public String[] getFormation(){
		return formation;
		
	}
	
	public String getFormationString(){
		String formationAux="";
		
		for(int i=0; i<formation.length; i++){
			formationAux+=formation[i];
			formationAux+="\n";
			
		}
		
		return formationAux;
	}
}