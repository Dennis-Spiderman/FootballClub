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
	
	public boolean getStatus(){
		return status;
		
	}
	
	public String showContents(){
		String info="";
		String statusAux="";
		
		if(!getStatus()){
			statusAux="Inactivo";
			
		}
		
		else{
			statusAux="Activo";
			
		}
		
		info="\n-------------------------------------------------------\n** Nombre: " + getName() + 
		"\n** Salario: " + getSalary() + "\n** ID: " + getId() + "\n** Estatus: " 
		+ statusAux;
		
		return info;		
	}
}