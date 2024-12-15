package exClasses;

public class Livre {
	
	private String titre;
	private String auteur;
	private int anneePublication;
	 private static int nombreTotalLivres = 0;
	
	
	public Livre(final String titre, final String auteur, final int anneePublication) {
		
		this.titre = titre;
		this.auteur = auteur;
		this.anneePublication = anneePublication;
		nombreTotalLivres++;
		
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public int getAnneePublication() {
		return anneePublication;
	}


	public void setAnneePublication(int anneePublication) {
		this.anneePublication = anneePublication;
	}
	
	public String afficheInfo() {
		
		return "Livre: \"" + titre + "\" par " + auteur + " (" + anneePublication + ")";
	}


	public static int getNombreTotalLivres() {
		return nombreTotalLivres;
	}


	public static void setNombreTotalLivres(int nombreTotalLivres) {
		Livre.nombreTotalLivres = nombreTotalLivres;
	}
	
	
	public static void main(String[] args) {
		
		
		Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943);
        Livre livre2 = new Livre("1984", "George Orwell", 1949);
        
        System.out.println(livre1.afficheInfo());
        System.out.println(livre2.afficheInfo());

        
        System.out.println("Modification du titre du premier livre...");
        livre1.setTitre("Nineteen Eighty-Four");
        
        System.out.println(livre1.afficheInfo());
		
        //Livre livre3 = new Livre("Le Seigneur des Anneaux", "J.R.R. Tolkien", 1954);
        
        System.out.println("Nombre total de livres créés : " + Livre.getNombreTotalLivres());

      
        
	}
	
	

}
