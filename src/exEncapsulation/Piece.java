package exEncapsulation;

public class Piece {
	
	public enum Type {PION, TOUR, CAVALIER, FOU, REINE, ROI}
	public enum Couleur {BLANC, NOIR}
	
	private final Type type;
	private final Couleur couleur;
	
	public Piece(Type type, Couleur couleur) {
		this.type = type;
		this.couleur = couleur;
	}
	
	public Type getType() {
		return type;
	}
	
	public Couleur getCouleur() {
		return couleur;
	}
	
	@Override
	public String toString() {
		return couleur + "" + type;
	}
	
	

}
