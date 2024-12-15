package ej;

public class Mur extends Bloc {
	
	protected boolean porteur;
	
	public Mur(final int longueur, final int largeur, final int hauteur, final boolean porteur) {
		
		super(longueur, largeur, hauteur);
		this.porteur = porteur;
		
	}
	
	public boolean isTraversable() {
		return !porteur;
	}

	@Override
	public void afficherDescription() {
		// TODO Auto-generated method stub
		System.out.print("Je suis un mur");
	}

}
