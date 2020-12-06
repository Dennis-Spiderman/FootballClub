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
		fc1.addAlignment();
		int selection=0;
		
		System.out.println("\n-------------------------------------------------------");
		
		System.out.println("\n¿Que quieres hacer?");
		System.out.println("1. Agregar equipo\n2. Agregar equipo\n3. Ver los equipos del club");
		System.out.println("4. Contratar entrenador principal\n5. Ver los entrenadores principales del club");
		System.out.println("6. Contratar entrenador asistente\n7. Ver los entrenadores asistentes del club");
		System.out.println("8. Contratar jugador\n9. Ver los jugadores del club\n10. Ver los camerinos");
		System.out.println("11. Ver las oficinas\n12. Ver toda la información del club");
		System.out.println("13. Agregar entrenador principal a equipo\n14. Agregar entrenador asistente a equipo");
		System.out.println("15. Agregar jugador a equipo\n16. Calcular precio en el mercado de un jugador");
		System.out.println("17. Calcular precio en el mercado de un entrenador principal");
		System.out.println("18. Calcular nivel de un jugador\n19. Calcular nivel de un entrenador");
		System.out.println("20. Despedir entrenador principal\n21. Despedir entrenador asistente\n22. Despedir juagador");
		System.out.println("23. Agregar alineacion a equipo\n24. Calificar juagdor\n25. Cambiar informacion de empleado");
		
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
			
			case 17:
				menuCalculateMarketPriceMainCoach(fc1);
				break;
			
			case 18:
				menuCalculateLevelPlayer(fc1);
				break;
				
			case 19:
				menuCalculateLevelCoach(fc1);
				break;
				
			case 20:
				menuOrderOffMainCoach(fc1);
				break;
				
			case 21:
				menuOrderOffAssistantCoach(fc1);
				break;
				
			case 22:
				menuOrderOffPlayer(fc1);
				break;
				
			case 23:
				menuAddAlignment(fc1);
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
		System.out.println("\nLos jugadores que puedes agregar son:");
		System.out.println(fc1.getInfoPlayers());
		
		System.out.println("\nEscribe el nombre del jugador a agregar:");
		String playerName=sc1.nextLine();
		
		System.out.println("\nLos equipos disponibles a los que puedes agregar el jugador son:");
		System.out.println(fc1.getInfoTeams());
		
		System.out.println("\nEscribe el nombre del equipo al que vas a agregar el jugador:");
		String teamName=sc1.nextLine();
		
		fc1.addPlayerTeam(playerName,teamName);
		
		menu(fc1);
	}
	
	public static void menuSeeTheTeams(Club fc1){
		System.out.println(fc1.getInfoTeams());
		
		menu(fc1);
	}
	
	public static void menuAddMainCoach(Club fc1){
		boolean status=true;
		int quantityTeams=0;
		
		System.out.println("\n-------------------------------------------------------");
		
		System.out.println("\nEscribe el nombre del entrenador principal a contratar:");
		String name=sc1.nextLine();
		
		System.out.println("\nEscribe el salario del entrenador a contratar:");
		double salary=sc2.nextDouble();
		
		System.out.println("\nEscribe el ID del entrenador a contratar:");
		int id=sc2.nextInt();
		
		System.out.println("\nEscribe los anios de experiencia del entrenador a contratar:");
		int experiencieYears=sc2.nextInt();
		
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
		
		System.out.println("\nEscribe la califiacion, 1-5, del jugador a contratar:");
		double mark=sc2.nextDouble();
		
		while(mark<1 || mark>5){
			System.out.println("Tu seleccion no es valida.");
			
			menuAddPlayer(fc1);
		}
		
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
		System.out.println("No me dio el tiempo:(");
		
		menu(fc1);
	}
	
	public static void seeTheOffices(Club fc1){
		System.out.println("No me dio el tiempo:(");
		
		menu(fc1);
	}
	
	public static void seeAllInfo(Club fc1){
		System.out.println(fc1.getAllInfo());
		
		menu(fc1);
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
	
	public static void menuCalculateMarketPriceMainCoach(Club fc1){
		System.out.println("\nLos entrenadores de los que puedes calcular el precio en el mercado son:");
		System.out.println(fc1.getInfoMainCoach());
		
		System.out.println("\nEscribe el nombre del entrenador del que quieres calcular el precio en el mercado:");
		String coachName=sc1.nextLine();
		
		System.out.println("\nEl precio en el mercado del entrenador " + coachName + " es:");
		System.out.println(fc1.calculateMarketPriceCoach(coachName));
		
		menu(fc1);
	}
	
	public static void menuCalculateLevelPlayer(Club fc1){
		System.out.println("\nLos jugadores de los que puedes calcular el nivel son:");
		System.out.println(fc1.getInfoPlayers());
		
		System.out.println("\nEscribe el nombre del jugador del que quieres calcular nivel:");
		String playerName=sc1.nextLine();
		
		System.out.println("\nEl nivel del jugador " + playerName + " es:");
		System.out.println(fc1.calculateLevelPlayer(playerName));
		
		menu(fc1);
	}
	
	public static void menuCalculateLevelCoach(Club fc1){
		System.out.println("\nLos entrenadores de los que puedes calcular el nivel son:");
		System.out.println(fc1.getInfoMainCoach());
		
		System.out.println("\nEscribe el nombre del entrenador del que quieres calcular nivel:");
		String coachName=sc1.nextLine();
		
		System.out.println("\nEl nivel del entrenador " + coachName + " es:");
		System.out.println(fc1.calculateLevelCoach(coachName));
		
		menu(fc1);
	}
	
	public static void menuOrderOffMainCoach(Club fc1){
		System.out.println("\nLos entrenadores que puedes despedir son:");
		System.out.println(fc1.getInfoMainCoach());
		
		System.out.println("\nEscribe el nombre del entrenador que quieres despedir:");
		String coachName=sc1.nextLine();
		
		fc1.orederOffMainCoach(coachName);
		
		menu(fc1);
	}
	
	public static void menuOrderOffAssistantCoach(Club fc1){
		System.out.println("\nLos entrenadores que puedes despedir son:");
		System.out.println(fc1.getInfoAssistantCoach());
		
		System.out.println("\nEscribe el nombre del entrenador que quieres despedir:");
		String coachName=sc1.nextLine();
		
		fc1.orederOffAssistantCoach(coachName);
		
		menu(fc1);
	}
	
	public static void menuOrderOffPlayer(Club fc1){
		System.out.println("\nLos jugadores que puedes despedir son:");
		System.out.println(fc1.getInfoPlayers());
		
		System.out.println("\nEscribe el nombre del jugador que quieres despedir:");
		String playerName=sc1.nextLine();
		
		fc1.orederOffPlayer(playerName);
		
		menu(fc1);
	}
	
	public static void menuAddAlignment(Club fc1){
		System.out.println("\nLos equipos a los que puedes agregar una alineacion son:");
		System.out.println(fc1.getInfoTeams());
		
		System.out.println("\nEscribe  le nombre del equipo al que vas a agregar la alineacion:");
		String teamName=sc1.nextLine();
		
		System.out.println("\nLas alineaciones que puedes agregar son:");
		System.out.println(fc1.getAlignment());
		
		System.out.println("\nEscribe el nombre de la alineacion a agregar:");
		String alignmentName=sc1.nextLine();
		
		fc1.addAlignmentTeam(teamName,alignmentName);
		
		menu(fc1);
	}
}