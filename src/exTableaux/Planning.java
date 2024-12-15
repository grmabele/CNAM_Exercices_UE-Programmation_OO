package exTableaux;

public class Planning {
	
	private static final String[] JOURS = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi"};
	private static final int HEURE_DEBUT = 9;
	private static final int HEURE_FIN = 19;
	
	// Tableaux pour le planning (jours x heures)
	
	private String[][] planning;
	
	
	public Planning() {
		
		planning = new String[JOURS.length][HEURE_DEBUT - HEURE_FIN + 1];
	}
	
	

}
