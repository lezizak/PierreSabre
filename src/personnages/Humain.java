package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	protected int argent;
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	public Humain(String nom, String boissonFav, int argent) {
		super();
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}
	
	protected void parler(String texte) {
		System.out.println("("+nom+")"+ " - " + texte);
	}
	
	public void gagnerArgent(int gain){
		argent += gain;
	}
	public void perdreArgent(int perte){
		argent -= perte;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFav);
	}
	
	public void boire() {
		parler("Mmm, un bon verre de " + boissonFav + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix > argent) {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un(e) " + bien + " à " + prix + " sous."); 
		} else {
			parler ("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un(e) " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		}
	}
	
	
	
}
