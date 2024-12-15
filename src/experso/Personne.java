package experso;

public class Personne {
	private String nom;
	
	public Personne(String nom) {
		this.nom = nom;
	}
	
	public String getNonm() {
		return nom;
	}
	
	public static void main(String[] args) {
		
		Personne p1 = new Personne("Alice");
		System.out.println("La personne s'appelle : " + p1.getNonm());
		Personne p2 = new Personne("Bob");
		Personne p3 = p1;
		
		p1 = new Personne("Charlie");
		p2 = null;
		
		Personne p4 = new Personne("David");
		p3 = p4;
			
	}

}
