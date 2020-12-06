package model;

public class AssistantCoach extends Plant{
	private int experienceYears;
	private int professionalSelect;
	
	public AssistantCoach(String name, double salary, int id, boolean status, int experienceYears, int professionalSelect){
		super(name, salary, id, status);
		this.experienceYears=experienceYears;
		this.professionalSelect=professionalSelect;
		
	}
	
	public void setExperienceYears(int experienceYears){
		this.experienceYears=experienceYears;
		
	}
	
	public int getExperienceYears(){
		return experienceYears;
		
	}
	
	public void setProfessionalSelect(int professionalSelect){
		this.professionalSelect=professionalSelect;
		
	}
	
	public int getProfessionalSelect(){
		return professionalSelect;
		
	}
	
	@Override
	public String showContents(){
		String info="";
		String professionalAux="";
		
		if(getProfessionalSelect()==1){
			professionalAux="Si";
			
		}
		
		else if(getProfessionalSelect()==2){
			professionalAux="No";
			
		}
		
		info+=super.showContents() + "\n** Anios de experiencia: " + getExperienceYears() + "\n** Profesional: " +
		professionalAux + "\n-------------------------------------------------------";
		
		return info;
	}
}