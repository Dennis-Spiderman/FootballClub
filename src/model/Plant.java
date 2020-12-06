package model;

public class Plant{
	public String name;
	public double salary;
	public int id;
	public boolean status;

	public Plant(String name, double salary, int id, boolean status){
		this.name=name;
		this.salary=salary;
		this.id=id;
		this.status=status;
		
	}
	
	public void setName(String name){
		this.name=name;
		
	}
	
	public String getName(){
		return name;
		
	}
	
	public void setSalary(double salary){
		this.salary=salary;
		
	}
	
	public double getSalary(){
		return salary;
		
	}
	
	public void setId(int id){
		this.id=id;
		
	}
	
	public int getId(){
		return id;
		
	}
	
	public void setStatus(boolean status){
		this.status=status;
		
	}
	
	public String getStatus(){
		String statusAux="";

		if(!status){
			statusAux="Inactivo";
			
		}
		
		else{
			statusAux="Activo";
			
		}
		
		return statusAux;
	}
	
	public String showContents(){
		String info="";
		
		info="\n-------------------------------------------------------\n** Nombre: " + getName() + 
		"\n** Salario: " + getSalary() + "\n** ID: " + getId() + "\n** Estatus: " 
		+ getStatus();
		
		return info;		
	}
}