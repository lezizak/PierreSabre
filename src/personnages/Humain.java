package personnages;

import java.util.Iterator;

public class Humain {
	protected String nom;
	private String boissonFav;
	protected int argent;
	protected int nbConnaissance = 0;
	private int nbConnaissanceMax = 30;
	protected Humain[] memoire = new Humain[nbConnaissanceMax];

	
	protected String getNom() {
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
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFav + ".");
	}
	
	public void boire() {
		parler("Mmm, un bon verre de " + boissonFav + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix > argent) {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux meme pas m'offrir un(e) " + bien + " a " + prix + " sous."); 
		} else {
			parler ("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un(e) " + bien + " a " + prix + " sous.");
			perdreArgent(prix);
		}
	}
	
	public void memoriser(Humain humain){
		if (nbConnaissance < nbConnaissanceMax) {
			memoire[nbConnaissance] = humain;
			nbConnaissance +=1;
		} else {
			for (int i = 0; i < nbConnaissance; i++) {
				memoire[i] = memoire[i+1];
				memoire[nbConnaissance] = humain;
			}
		}
	}
	
	public void listerConnaissance() {
		String listeMemoire = "";
		for (int i = 0; i < nbConnaissance; i++) {
			listeMemoire += memoire[i].getNom() + ", ";
		}
		parler ("Je connais beaucoup de monde dont : " + listeMemoire);
	}
	
	public void faireConnaisanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	public void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
}
