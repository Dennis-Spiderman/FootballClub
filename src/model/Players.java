package model;

public class Players extends Plant{
	private int shirtNum;
	private int goals;
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
				this.playerPosition=Position.Delantero.toString();
				break;
				
			case 4:
				this.playerPosition=Position.Volante.toString();
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
	
	public int getGoals(){
		return goals;
		
	}
	
	public void setQualification(double qualification){
		this.qualification=qualification;
		
	}
	
	public double getQualification(){
		return qualification;
		
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