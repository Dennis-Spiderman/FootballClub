package model;

public class Players extends Plant implements CalculatePriceNLevel{
	private int shirtNum;
	private double goals;
	private double qualification;
	private String playerExperticies;
	private String playerPosition;
	private int positionSelect;
	private int experticiesSelect;
	
	public Players(String name, double salary, int id, boolean status, int shirtNum, int goals, double qualification, int positionSelect, int experticiesSelect){
		super(name, salary, id, status);
		this.shirtNum=shirtNum;
		this.goals=goals;
		this.qualification=qualification;
		this.positionSelect=positionSelect;
		this.experticiesSelect=experticiesSelect;
		setExperticies(playerExperticies);
		setPlayerPosition(playerPosition);
		
	}
	
	public void setPlayerPosition(String playerPosition){
		switch(positionSelect){
			case 1:
				this.playerPosition=Position.Portero.toString();
				break;
				
			case 2:
				this.playerPosition=Position.Defensor.toString();
				break;
				
			case 3:
				this.playerPosition=Position.Volante.toString();
				break;
				
			case 4:
				this.playerPosition=Position.Delantero.toString();
				break;
				
		}
	}
	
	public String getPosition(){
		return playerPosition;
		
	}
	
	public void setExperticies(String playerExperticies){
		switch(experticiesSelect){
			case 1:
				this.playerExperticies=Experticies.Ofensivo.toString();
				break;
				
			case 2:
				this.playerExperticies=Experticies.Defensivo.toString();
				break;
				
			case 3:
				this.playerExperticies=Experticies.Posesion.toString();
				break;
				
			case 4:
				this.playerExperticies=Experticies.Jugadas_de_laboratorio.toString();
				break;
				
		}		
	}
	
	public String getExperticies(){
		return playerExperticies;
		
	}

	public void setShirtNum(int shirtNum){
		this.shirtNum=shirtNum;
		
	}
	
	public int getShirtNum(){
		return shirtNum;
		
	}
	
	public void setGoals(int goals){
		this.goals=goals;
		
	}
	
	public double getGoals(){
		return goals;
		
	}
	
	public void setQualification(double qualification){
		this.qualification=qualification;
		
	}
	
	public double getQualification(){
		return qualification;
		
	}
	
	@Override
	public double calculatePrice(){
		double price=0;
		
		if(getPosition().equalsIgnoreCase("Portero")){
			price=(getSalary()*12)+(getQualification()*150);
			
		}
		
		else if(getPosition().equalsIgnoreCase("Defensor")){
			price=(getSalary()*13)+(getQualification()*125)+((double)getGoals()*100);
			
		}
		
		else if(getPosition().equalsIgnoreCase("Volante")){
			price=(getSalary()*14)+(getQualification()*135)+((double)getGoals()*125);
			
		}
		
		else if(getPosition().equalsIgnoreCase("Delantero")){
			price=(getSalary()*15)+(getQualification()*145)+((double)getGoals()*150);
			
		}
		
		return price;
	}
	
	public double calculateLevel(){
		double level=0;
		
		if(getPosition().equalsIgnoreCase("Portero")){
			level=(getQualification()*0.9);
			
		}
		
		else if(getPosition().equalsIgnoreCase("Defensor")){
			level=(getQualification()*0.9)+((double)getGoals()/100);
			
		}
		
		else if(getPosition().equalsIgnoreCase("Volante")){
			level=(getQualification()*0.9)+((double)getGoals()/90);
			
		}
		
		else if(getPosition().equalsIgnoreCase("Delantero")){
			level=(getQualification()*0.9)+((double)getGoals()/80);
			
		}
		
		return level;
	}
	
	@Override
	public String showContents(){
		String info="";
		
		info=super.showContents() + "\n** Numero de camiseta: " + getShirtNum() + "\n** Numero de goles: " + 
		getGoals() + "\n** Calificacion: " + getQualification() + "\n** Experticias: " + getExperticies() + 
		"\n** Posicion: " + getPosition() + "\n-------------------------------------------------------";
		
		return info;
	}
}