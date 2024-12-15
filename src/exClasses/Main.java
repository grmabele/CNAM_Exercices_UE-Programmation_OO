package exClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo zoo = new Zoo();
		
		// Création et ajout d'animaux
		zoo.addAnimal(new Animal(1, "Simba", "Lion", 5, "Carnivore"));
		zoo.addAnimal(new Animal(2, "Dumbo", "´El´ephant", 10, "Herbivore"));
		zoo.addAnimal(new Animal(3, "George", "Singe", 3, "Omnivore"));
		zoo.addAnimal(new Animal(4, "Nala", "Lion", 4, "Carnivore"));
		
		System.out.println("Animaux dans le zoo :");
		zoo.displayAnimals();
		
		// Recherche par ID
		System.out.println("\nRecherche de l’animal avec ID 2 :");
		System.out.println(zoo.researchAnimal(2));
		
		// Recherche par espece
		System.out.println("\n Lions dans le zoo :");
		zoo.researchByEspece("Lion");
		
		// Calcul de la moyenne d’^age
		System.out.println("\n Age moyen des lions : " + zoo.moyenneAgeEspece("Lion") + " ans");
		
		// Retrait d’un animal
		System.out.println("\nRetrait de l’animal avec ID 3...");
		zoo.removeAnimal(3);
		
		System.out.println("Animaux restants dans le zoo :");
		zoo.displayAnimals();
		
		System.out.println("\nNombre total d’animaux : " + zoo.getNombreAnimals());
				
		
		

	}

}
