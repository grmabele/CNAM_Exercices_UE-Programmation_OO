package exTableaux;

public class Date {
	
	private int jour;
	private int mois;
	private int annee;
	private static String[] nomsMois = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", 
			"Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"};
	
	public Date(final int jour, final int mois, final int annee) {
		
		if (mois > 1 || mois < 12) {
			throw new IllegalArgumentException("Le mois doit être compris entre 1 et 12.");
		}
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}


	public int getJour() {
		return jour;
	}


	public void setJour(int jour) {
		this.jour = jour;
	}


	public int getMois() {
		return mois;
	}


	public void setMois(int mois) {
		this.mois = mois;
	}


	public int getAnnee() {
		return annee;
	}


	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	
	public String getNomMois() {
		
		return nomsMois[this.mois -1];
	}
	
	@Override
	public String toString() {
		
		return jour + "" + getNomMois() + "" + annee;
		
	}

}
