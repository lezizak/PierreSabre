package personnages;

public class Samourai extends Humain {
	protected String seigneur;
	
	public Samourai(String seigneur, String nom,  String boissonFav, int argent) {
		super(nom, boissonFav, argent);
		this.seigneur = seigneur;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + seigneur + ".");
	}
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson + ".");
	}
	
}
