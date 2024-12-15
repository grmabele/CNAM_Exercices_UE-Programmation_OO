package experso;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	

	private static ArrayList<String> inventaire = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texte1 = "Bonjour Emmanuelle";
		String texte2 = Main.affiche(texte1);
		System.out.println(texte2);
	
		
		int somme = Main.addition(7, 5);
		System.out.println(somme);

		System.out.println(categorieDeFilm("Star Wars"));
		System.out.println(categorieDeFilm("Blanche neige"));
		System.out.println(categorieDeFilm("Indiana Jones"));
		System.out.println(categorieDeFilm("La petite sirène"));
		System.out.println(categorieDeFilm("aaaaaa"));
		
		
		int[] tableau = {10, 100, 50, 22, 1080, 27000, 0};
		
		int cpt = 0;
		
		for(int i=0; i<7; i++) {
			
			if(tableau[i] == 0) {
				cpt++;
			}
		}
		
		System.out.println(cpt);
		
		
		// Ajout des items à l'inventaire
		
        ajouter_items("ordinateur");
        ajouter_items("téléphone");
        ajouter_items("tablette");
		
        
        // Suppression des items
        supprimer_items("ordinateur");
        supprimer_items("montre");
      
        Scanner scanner = new Scanner(System.in);
        Boolean continuer = true; 
        
        while(continuer) {
        	System.out.println("\n1. Ajouter un item");
        	System.out.println("2. Supprimer un item");
        	System.out.println("3. Afficher l’inventaire");
        	System.out.println("4. Quitter");
        	
        	System.out.println("Choississez une option : ");
        	
        	String choix = scanner.nextLine();
        	
        	switch(choix) {
        	
        		case "1" :
        			System.out.print("Entrez le nom de l'item à ajouter : ");
        			String itemAjouter = scanner.nextLine();
                    ajouter_items(itemAjouter);
                    break;
        		
        		case "2" : 
        			System.out.print("Entrez le nom de l'item à supprimer : ");
        			String itemSupprimer = scanner.nextLine();
        			supprimer_items(itemSupprimer);
        			break;
        			
        		case "3" :
        			afficher_inventaire();
        			break;
        			
        		case "4" :
        			System.out.print("Au revoir !");
        			break;
        			
        		default:
        			System.out.print("Option invalid. Veuillez réessayer !");
        			
        			
        	}
        	
        }
			
		
	}
	
	public static String affiche(String texte) {
		
		return texte;

	}
	
	public static int addition(final int entier1, final int entier2) {
		
		return entier1 + entier2;
	}
	
	public static void chiffreEgalAZero(final int valeur) {
		
		if(valeur == 0) {
			System.out.println("L'entier passer en parametre vaut zéro");
		} else {
			System.out.println("L'entier passer en parametre est different de zéro");
		}
		
	}
	
	public static void meteo(final boolean beauTemps) {
			
			if(beauTemps) {
				System.out.println("Je vais à la plage");
			} else {
				System.out.println("Je vais au cinema");
			}
			
	}
	
	public static void commenteLaMeteo(final String meteo) {
		switch (meteo) {
			case "soleil" -> System.out.println("Beau temps");
			case "nuage" -> System.out.println("Couvert");
			case "pluie" -> System.out.println("Mauvais temps");
			default -> System.out.println("Je ne sais pas");
		}
	}
	
	public static String categorieDeFilm(final String film) {
		
	    var resultat = switch (film) {
	        case "Star Wars" -> "Science fiction";
	        case "Blanche neige", "La petite sirène" -> "Disney";
	        case "Indiana Jones" -> {
	            String categorie = "Aventure";
	            yield categorie;
	        }
	        default -> "Inconnu";
	    };
	    return resultat;
	}
	
	
	// Exercice Traduction Python en Java
	
	public static void ajouter_items(String item) {
		
		inventaire.add(item);
		System.out.println(item + " a été ajouté à l'inventaire");
		
		
	}
	
	
	public static void supprimer_items(String item) {
		
		if(inventaire.contains(item)) {
			inventaire.remove(item);
			System.out.println(item + " a été supprimer de l'inventaire");
		} else {
			System.out.println(item + " n'est pas dans l'inventaire");
		}
	}
	
	public static void afficher_inventaire() {
		
		if(!inventaire.isEmpty()) {
			System.out.println("Inventaire actuel:");
			
			for(String item : inventaire) {
				System.out.println("-" + item);
			}
		} else {
			System.out.println("L’inventaire est vide.");
		}
	}
	
	

}
