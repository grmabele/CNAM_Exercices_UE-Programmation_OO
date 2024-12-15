package exClasses;

public class Animal {
	
	private int id;
	private String nom;
	private String espece;
	private int age; 
	private String regime;
	
	public Animal(int id, String nom, String espece, int age, String regime) {
		//super();
		this.id = id;
		this.nom = nom;
		this.espece = espece;
		this.age = age;
		this.regime = regime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEspece() {
		return espece;
	}

	public void setEspece(String espece) {
		this.espece = espece;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRegime() {
		return regime;
	}

	public void setRegime(String regime) {
		this.regime = regime;
	}
	
	@Override
	public String toString() {
		
		return "ID : " + this.id + ", Nom : " + this.nom + ", Espèce : " + this.espece + ", Âge : " + this.age + ", Régime : " + this.regime;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if( this == obj) {
			return true;	
		} 
		
		if (this == null || getClass() != obj.getClass()) {
			return false;
		}
		
		Animal other = (Animal) obj;
			
		return id == other.id;
	}
	
	// Méthode hashCode() redéfinie pour maintenir le contrat avec equals()
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
    
    
}
