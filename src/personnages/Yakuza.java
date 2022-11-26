package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int rep = 0;

	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.clan = clan;
	}
	
	public int getRep() {
		return rep;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		int argent1 = argent;
		gagnerArgent(victime.seFaireExtorquer());
		parler ("J'ai piqu� les " + (argent - argent1) + " sous de Marco, ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi !");
		rep += 1;
	}
	
	public int perdre() {
		int argentPerdu = argent;
		parler("J'ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai d�shonor� le clan de " + clan + ".");
		rep -= 1;
		argent = 0;
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre " + nom + " du clan de " + clan + " ? Je l'ai d�pouill� de ses " + gain + " sous.");
		gagnerArgent(gain);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan + ".");
	}
	
}