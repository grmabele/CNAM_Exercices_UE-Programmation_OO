package exEncapsulation;

public class Echequier {
	
	private final Piece[][] cases = new Piece[8][8];
	
	public Echequier() {
		initialiserPosition();
	}
	
	public void initialiserPosition() {
		// Placement des pièces en position initiale
		placerPieces();
	}
	
	public void placerPieces() {
	    // Place les pièces blanches (rangées 0 et 1)
	    cases[0][0] = new Piece(Piece.Type.TOUR, Piece.Couleur.BLANC);
	    cases[0][1] = new Piece(Piece.Type.CAVALIER, Piece.Couleur.BLANC);
	    cases[0][2] = new Piece(Piece.Type.FOU, Piece.Couleur.BLANC);
	    cases[0][3] = new Piece(Piece.Type.REINE, Piece.Couleur.BLANC);
	    cases[0][4] = new Piece(Piece.Type.ROI, Piece.Couleur.BLANC);
	    cases[0][5] = new Piece(Piece.Type.FOU, Piece.Couleur.BLANC);
	    cases[0][6] = new Piece(Piece.Type.CAVALIER, Piece.Couleur.BLANC);
	    cases[0][7] = new Piece(Piece.Type.TOUR, Piece.Couleur.BLANC);

	    // Place les pions blancs
	    for (int i = 0; i < 8; i++) {
	        cases[1][i] = new Piece(Piece.Type.PION, Piece.Couleur.BLANC);
	    }

	    // Place les pièces noires (rangées 7 et 6)
	    cases[7][0] = new Piece(Piece.Type.TOUR, Piece.Couleur.NOIR);
	    cases[7][1] = new Piece(Piece.Type.CAVALIER, Piece.Couleur.NOIR);
	    cases[7][2] = new Piece(Piece.Type.FOU, Piece.Couleur.NOIR);
	    cases[7][3] = new Piece(Piece.Type.REINE, Piece.Couleur.NOIR);
	    cases[7][4] = new Piece(Piece.Type.ROI, Piece.Couleur.NOIR);
	    cases[7][5] = new Piece(Piece.Type.FOU, Piece.Couleur.NOIR);
	    cases[7][6] = new Piece(Piece.Type.CAVALIER, Piece.Couleur.NOIR);
	    cases[7][7] = new Piece(Piece.Type.TOUR, Piece.Couleur.NOIR);

	    // Place les pions noirs
	    for (int i = 0; i < 8; i++) {
	        cases[6][i] = new Piece(Piece.Type.PION, Piece.Couleur.NOIR);
	    }
	}

	
	private int[] convertirCoordonnees(String position) {
		if (position.length() != 2) {
			throw new IllegalArgumentException("Position invalide");
		}
		
		int colonne = position.charAt(0) - 'a';
		int ligne = position.charAt(1) - 1;
		
		if (colonne < 0 || colonne > 7 || ligne < 0 || ligne > 7) {
			throw new IllegalArgumentException("Position hors limites");
		}
		
		return new int [] {ligne, colonne};
	}
	
	public void deplacer (String depart, String arrivee) {
		
		int[] coordDepart = convertirCoordonnees(depart);
		int[]coordArrivee = convertirCoordonnees(arrivee);
		
		Piece piece = cases[coordDepart[0]][coordArrivee[1]];
		if (piece == null) {
			throw new IllegalArgumentException("Pas de piece à déplacer");
		}
		
		cases[coordArrivee[0]][coordArrivee[1]] = piece;
		cases[coordDepart[0]][coordDepart[1]] = null;
		
	}
	
	public Piece getPiece(String position) {
		int[] coord = convertirCoordonnees(position);
		return cases[coord[0]][coord[1]];
	}

}
