package ui;
import java.util.Scanner;
import model.Club;

public class Menu{
	static final Scanner sc1=new Scanner(System.in);
	static final Scanner sc2=new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.println("-------------------------------------------------------\n¡Hola!");
		
		System.out.println("\nEscribe el nombre del club:");
		String name=sc1.nextLine();
		
		System.out.println("\nEscribe el NIT del club:");
		int NIT=sc2.nextInt();
		
		System.out.println("\nEscribe la fecha de fundacion del club en formato dia/mes/anio:");
		String fundation=sc1.nextLine();
		
		Club fc1=new Club(name,NIT,fundation);
		
		menu(fc1);
	
	}
	
	public static void menu(Club fc1){
		int selection=0;
		
		System.out.println("\n-------------------------------------------------------");
		
		System.out.println("\n¿Qué quieres hacer?");
		System.out.println("1. Agregar equipo\n2. Agregar equipo\n3. Ver los equipos del club");
		System.out.println("4. Contratar entrenador principal\n5. Ver los entrenadores principales del club");
		System.out.println("6. Contratar entrenador asistente\n7. Ver los entrenadores asistentes del club");
		System.out.println("8. Contratar jugador\n9. Ver los jugadores del club\n10. Ver los camerinos");
		System.out.println("11. Ver las oficinas\n12. Ver toda la información del club");
		System.out.println("13. Agregar entrenador principal a team\n14. Agregar entrenador asistente a team");
		System.out.println("15. Agregar jugador a team\n16. Calcular precio en el mercado de un jugador");
		
		selection=sc2.nextInt();
		
		System.out.println("\n-------------------------------------------------------");
		
		switch(selection){
			case 1:
				menuAddTeam(fc1);
				break;
				
			case 2:
				menuAddTeam(fc1);
				break;
				
			case 3: 
				menuSeeTheTeams(fc1);
				break;
				
			case 4:
				menuAddMainCoach(fc1);				
				break;
				
			case 5:
				seeTheMainCoachs(fc1);
				break;
				
			case 6:
				menuAddAssistantCoach(fc1);
				break;
			
			case 7:
				seeTheAssistantCoachs(fc1);
				break;
				
			case 8:
				menuAddPlayer(fc1);
				break;
				
			case 9:
				seeThePlayers(fc1);
				break;
				
			case 10:
				seeTheCamerines(fc1);
				break;
			
			case 11:
				seeTheOffices(fc1);
				break;
				
			case 12:
				seeAllInfo(fc1);
				break;
				
			case 13:
				addMainCoachTeam(fc1);
				break;
				
			case 14:
				addAssistantCoachTeam(fc1);
				break;
				
			case 15:
				addPlayerTeam(fc1);
				break;
			
			case 16:
				menuCalculateMarketPricePlayer(fc1);
				break;
			
		}
	}
	
	public static void menuAddTeam(Club fc1){
		System.out.println("\nEscribe el nombre del equipo a agregar:");
		String nameTeam=sc1.nextLine();
		
		fc1.addTeam(nameTeam);
		
		System.out.println("\n¿Quieres agregar un empleado a algun team?");
		System.out.println("1. Si\n2. No");
		int selection=sc2.nextInt();
		
		if(selection>=1 && selection<=2){
			switch(selection){
				case 1:
					System.out.println("\n¿Que tipo de empleado quieres agregar?");
					System.out.println("1. Entrenador principal\n2. Entrenador asistente\n3. Jugador");
					selection=sc2.nextInt();
					
					switch(selection){
						case 1:
							addMainCoachTeam(fc1);
							break;
							
						case 2:
							addAssistantCoachTeam(fc1);
							break;
							
						case 3:
							addPlayerTeam(fc1);
							break;
					}
					
					break;
					
				case 2:
					menu(fc1);
					break;
			}
		}
		
		else{
			System.out.println("\nTu seleccion no es valida.");
			menu(fc1);
		}
	}
	
	public static void addMainCoachTeam(Club fc1){
		System.out.println("\nLos entrenadores principales que puedes agregar son:");
		System.out.println(fc1.getInfoMainCoach());
		
		System.out.println("\nEscribe el nombre del entrenador a agregar:");
		String coachName=sc1.nextLine();
		
		System.out.println("\nLos equipos disponibles a los que puedes agregar el entrenador son:");
		System.out.println(fc1.getInfoTeams());
		
		System.out.println("\nEscribe el nombre del equipo al que vas a agregar el entrenador:");
		String teamName=sc1.nextLine();
		
		fc1.addMainCoachTeam(coachName,teamName);
		
		menu(fc1);
	}
	
	public static void addAssistantCoachTeam(Club fc1){
		System.out.println("\nLos entrenadores asistentes que puedes agregar son:");
		System.out.println(fc1.getInfoAssistantCoach());
		
		System.out.println("\nEscribe el nombre del entrenador a agregar:");
		String coachName=sc1.nextLine();
		
		System.out.println("\nLos equipos disponibles a los que puedes agregar el entrenador son:");
		System.out.println(fc1.getInfoTeams());
		
		System.out.println("\nEscribe el nombre del equipo al que vas a agregar el entrenador:");
		String teamName=sc1.nextLine();
		
		fc1.addAssistantCoachTeam(coachName,teamName);
		
		menu(fc1);
	}
	
	public static void addPlayerTeam(Club fc1){
		
	}
	
	public static void menuSeeTheTeams(Club fc1){
		System.out.println(fc1.getInfoTeams());
		
		menu(fc1);
	}
	
	public static void menuAddMainCoach(Club fc1){
		boolean status=true;
		
		System.out.println("\n-------------------------------------------------------");
		
		System.out.println("\nEscribe el nombre del entrenador principal a contratar:");
		String name=sc1.nextLine();
		
		System.out.println("\nEscribe el salario del entrenador a contratar:");
		double salary=sc2.nextDouble();
		
		System.out.println("\nEscribe el ID del entrenador a contratar:");
		int id=sc2.nextInt();
		
		System.out.println("\nEscribe los anios de experiencia del entrenador a contratar:");
		int experiencieYears=sc2.nextInt();
		
		System.out.println("\nEscribe la cantidad de teams bajo el cargo del entrenador a contratar:");
		int quantityTeams=sc2.nextInt();
		
		System.out.println("\nEscribe la cantidad de campeonatos ganados por el entrenador a contratar:");
		int championshipsWon=sc2.nextInt();
		
		fc1.addMainCoach(name,salary,id,status,experiencieYears,quantityTeams,championshipsWon);
		
		System.out.println("\n-------------------------------------------------------");
	
		menu(fc1);
	}
	
	public static void seeTheMainCoachs(Club fc1){
		System.out.println("\n" + fc1.getInfoMainCoach());
		
		menu(fc1);
	}
	
	public static void menuAddAssistantCoach(Club fc1){
		boolean status=true;
	
		System.out.println("\nEscribe el nombre del entrenador asistente a contratar:");
		String name=sc1.nextLine();
		
		System.out.println("\nEscribe el ID del entrenador a contratar:");
		int id=sc2.nextInt();
		
		System.out.println("\nEscribe el salario del entrenador a contratar en COP:");
		double salary=sc2.nextDouble();
		
		System.out.println("\nEscribe los anios de experiencia del entrenador a contratar:");
		int experiencieYears=sc2.nextInt();
		
		System.out.println("\n¿Fue jugador profesional de futbol el entrenador a contratar?");
		System.out.println("1. Si\n2. No");
		int professionalSelect=sc2.nextInt();
		
		fc1.addAssistantCoach(name,salary,id,status,experiencieYears,professionalSelect);
		
		menu(fc1);
	}
	
	public static void seeTheAssistantCoachs(Club fc1){
		System.out.println(fc1.getInfoAssistantCoach());
		
		menu(fc1);
	}
	
	public static void menuAddPlayer(Club fc1){
		boolean status=true;
		
		System.out.println("\nEscribe el nombre del jugador a contratar:");
		String name=sc1.nextLine();
		
		System.out.println("\nEscribe el ID del jugador a contratar:");
		int id=sc2.nextInt();
		
		System.out.println("\nEscribe el salario del jugador a contratar:");
		double salary=sc2.nextDouble();
		
		System.out.println("\nEscribe el numero de camiseta del jugador a contratar:");
		int shirtNum=sc2.nextInt();
		
		System.out.println("\nEscribe el numero de goles del jugador a contratar:");
		int goals=sc2.nextInt();
		
		System.out.println("\nEscribe la califiación del jugador a contratar:");
		double mark=sc2.nextDouble();
		
		System.out.println("\nEscribe la posicion del jugador a contratar:");
		System.out.println("1. Portero\n2. Defensor\n3. Volante\n4. Delantero");
		int positionSelect=sc2.nextInt();
		
		System.out.println("\nEscribe la experticia del jugador a contratar:");
		System.out.println("1. Ofensivo\n2. Defensivo\n3. Posesión\n4. Jugadas de laboratorio");
		int experticiesSelect=sc2.nextInt();
		
		fc1.addPlayer(name,salary,id,status,shirtNum,goals,mark,positionSelect,experticiesSelect);
		
		menu(fc1);
	}
	
	public static void seeThePlayers(Club fc1){
		System.out.println(fc1.getInfoPlayers());
		
		menu(fc1);
	}
	
	public static void seeTheCamerines(Club fc1){
	
	}
	
	public static void seeTheOffices(Club fc1){
	
	}
	
	public static void seeAllInfo(Club fc1){
	
	}
	
	public static void menuCalculateMarketPricePlayer(Club fc1){
		System.out.println("\nLos jugadores de los que puedes calcular el precio en el mercado son:");
		System.out.println(fc1.getInfoPlayers());
		
		System.out.println("\nEscribe el nombre del jugador del que quieres calcular el precio en el mercado:");
		String playerName=sc1.nextLine();
		
		System.out.println("\nEl precio en el mercado del jugador " + playerName + " es:");
		System.out.println(fc1.calculateMarketPricePlayer(playerName));
		
		menu(fc1);
	}
}