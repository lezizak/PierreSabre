package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}

	public void donner(Commercant beneficiaire) {
		int don = argent/10;
		parler(beneficiaire.getNom() + ", prends ces " + don + " sous.");
		perdreArgent(don);
		beneficiaire.recevoir(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouv� vermine, tu vas payer pour ce que tu as fait � ce pauvre marchand !");
		if (honneur*2 >= adversaire.getRep()) {
			parler("Je t'ai eu petit yakusa !");
			gagnerArgent(adversaire.perdre());
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(argent);
			argent = 0;
		}
	}
	
}
