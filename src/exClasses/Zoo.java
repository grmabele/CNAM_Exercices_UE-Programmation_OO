package exClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo {
	
	private Map<Integer, Animal> animals;
	
	public Zoo() {
		
		this.animals = new HashMap<>();
		
	}
	
	
	public void addAnimal(Animal animal) {
		animals.put(animal.getId(), animal);
	}
	

	public Animal removeAnimal(int id) {
		return animals.remove(id);
	}
	
	public Animal researchAnimal(int id) {
		return animals.get(id);
	}
	
	
	// Recherche de tous les animaux d’une espèce specifique 
	public List<Animal> researchByEspece(String espece) {
		return animals.values().stream()
				.filter(a -> a.getEspece().equalsIgnoreCase(espece))
				.collect(Collectors.toList());
	}
	
	// Afficher tous les animaux
	public void displayAnimals() {
		for (Animal animal: animals.values()) {
			System.out.println(animal.toString());
		}
	}
	
	public int getNombreAnimals() {
		return animals.size();
		
	}
	
	// — Calcule et affichage de l’ˆage moyen d’une espece
    public double moyenneAgeEspece(String espece){
    	List<Animal> animalsEspece = researchByEspece(espece);
    	
    	if (animalsEspece.isEmpty()) {
    		return 0;
    	}
		return animalsEspece.stream()
				.mapToInt(Animal::getAge)
				.average()
				.orElse(0);
    }
    
  

	
	
}
