import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HotelApplication {
	private static ClientService clientService = new ClientServiceImpl();
	private static ChambreService chambreService = new ChambreServiceImpl();
	private static ReservationService reservationService = new ReservationServiceImpl();

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bienvenue dans l'application de gestion d'h�tel !");

		while (true) {
			System.out.println("Que souhaitez-vous faire ?");
			System.out.println("1. G�rer les clients");
			System.out.println("2. G�rer les chambres");
			System.out.println("3. G�rer les r�servations");
			System.out.println("4. Quitter");

			int choix = scanner.nextInt();

			switch (choix) {
			case 1:
				gererClients(scanner);
				break;
			case 2:
				gererChambres(scanner);
				break;
			case 3:
				gererReservations(scanner);
				break;
			case 4:
				System.out.println("Merci d'avoir utilis� notre application !");
				System.exit(0);
			default:
				System.out.println("Choix invalide.");
				break;
			}
		}
	}

	private static void gererClients(Scanner scanner) {
		while (true) {
			System.out.println("Que souhaitez-vous faire ?");
			System.out.println("1. Ajouter un client");
			System.out.println("2. Supprimer un client");
			System.out.println("3. Afficher un client");
			System.out.println("4. Retour");

			int choix = scanner.nextInt();

			switch (choix) {
			case 1:
				creerClient(scanner);
				break;
			case 2:
				supprimerClient(scanner);
				break;
			case 3:
				trouverClient(scanner);
				break;
			case 4:
				return;
			default:
				System.out.println("Choix invalide.");
				break;
			}
		}
	}
	
	private static void gererChambres(Scanner scanner) {
		while (true) {
			System.out.println("Que souhaitez-vous faire ?");
			System.out.println("1. Ajouter une chambre");
			System.out.println("2. Supprimer une chambre");
			System.out.println("3. Retour");

			int choix = scanner.nextInt();

			switch (choix) {
			case 1:
				creerChambre(scanner);
				break;
			case 2:
				supprimerChambre(scanner);
				break;
			case 3:
				return;
			default:
				System.out.println("Choix invalide.");
				break;
			}
		}
	}
	
	public static void gererReservations(Scanner scanner) {
	    int choix = 0;
	    do {
	        System.out.println("G�rer les r�servations");
	        System.out.println("1. Cr�er une r�servation");
	        System.out.println("2. Supprimer une r�servation");
	        System.out.println("3. Retour");
	        System.out.print("Choix : ");
	        choix = scanner.nextInt();
	        scanner.nextLine();
	        switch (choix) {
	            case 1:
	               creerReservation(scanner);
	                break;
	            default:
	                System.out.println("Choix invalide.");
	                break;
	        }
	        System.out.println();
	    } while (choix != 5);
	}

	public static void creerReservation(Scanner scanner) {
	    System.out.println("Cr�ation d'une r�servation");
	   
	}

	private static void creerClient(Scanner scanner) {
		System.out.println("Veuillez saisir les informations du client :");
		System.out.print("Nom : ");
		String nom = scanner.next();
		System.out.print("Genre (M/F) : ");
		String genre = scanner.next();
		System.out.print("Age : ");
		int age = scanner.nextInt();
		System.out.print("Nationalit� : ");
		String nationalite = scanner.next();
		System.out.print("Adresse : ");
		String adresse = scanner.next();
		System.out.print("Adresse e-mail : ");
		String mail = scanner.next();
		System.out.print("Num�ro de t�l�phone : ");
		String telephone = scanner.next();

		Client client = new Client(nom, genre, age, nationalite, adresse, mail, telephone);
		clientService.createClient(client);
	}

	private static void supprimerClient(Scanner scanner) {
		System.out.print("Entrez le nom du client � supprimer : ");
		String nomClient = scanner.nextLine();

		Client client = clientService.trouverClient(nomClient);
		if (client == null) {
			System.out.println("Aucun client avec le nom " + nomClient + " n'a �t� trouv�.");
			return;
		}
		clientService.supprimerClient(client);
		System.out.println("Le client " + client.getNom() + " a �t� supprim� avec succ�s.");
	}
	
	private static void trouverClient(Scanner scanner) {
		System.out.print("Entrez le nom du client � afficher : ");
		String nomClient = scanner.nextLine();
		
		Client client = clientService.trouverClient(nomClient);
		if (client == null) {
			System.out.println("Aucun client avec le nom " + nomClient + " n'a �t� trouv�.");
			return;
		}
		System.out.println("Nom: " + client.getNom());
	    System.out.println("Genre: " + client.getGenre());
	    System.out.println("Age: " + client.getAge());
	    System.out.println("Nationalite: " + client.getNationalite());
	    System.out.println("Adresse: " + client.getAdresse());
	    System.out.println("Email: " + client.getMail());
	    System.out.println("Telephone: " + client.getTelephone());
	}
	
	private static void creerChambre (Scanner scanner) {
		System.out.print("Num�ro de chambre : ");
	    int numeroChambre = scanner.nextInt();
	    scanner.nextLine();
	    
	    System.out.print("�tage : ");
	    int etage = scanner.nextInt();
	    scanner.nextLine();
	    
	    System.out.print("Vue : ");
	    String vue = scanner.nextLine();
	    
	    System.out.print("Type : ");
	    String type = scanner.nextLine();
	    
	    System.out.print("Tarif : ");
	    double tarif = scanner.nextDouble();
	    scanner.nextLine();
	    
	    Chambre chambre = new Chambre(numeroChambre, etage, vue, type, tarif);
	    chambreService.createChambre(chambre);
	    System.out.println("La chambre a �t� ajout�e avec succ�s.");
	}

	private static void supprimerChambre(Scanner scanner) {
		System.out.print("Entrez le numero de la chambre � supprimer : ");
		int numeroChambre = scanner.nextInt();

		Chambre chambre = chambreService.trouverChambre(numeroChambre);
		if (chambre == null) {
			System.out.println("Aucune chambre avec le numero " + numeroChambre + " n'a �t� trouv�.");
			return;
		}
		chambreService.supprimerChambre(chambre);
		System.out.println("La chambre " + chambre.getNumeroChambre()+ " a �t� supprim� avec succ�s.");
	}

}
