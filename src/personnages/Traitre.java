package personnages;
import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTraitrise = 0;

	public Traitre(String seigneur, String nom, String boissonFav, int argent) {
		super(seigneur, nom, boissonFav, argent);
	}

	public int getNiveauTraitrise() {
		return niveauTraitrise;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3){
			int rancon = commercant.argent/5;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + rancon + " sous ou gare à toi !");
			gagnerArgent(rancon);
			commercant.parler("Tout de suite grand " + nom + ".");
			commercant.perdreArgent(rancon);
			niveauTraitrise +=1;
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaissance < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif");
		} else {
			Random random = new Random(); 
			Humain ami = memoire[random.nextInt(nbConnaissance)];
			int don = argent/20;
			String nomAmi = ami.getNom();
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi + ".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			perdreArgent(don);
			ami.gagnerArgent(don); 			
			ami.parler("Merci " + nom + ". Vous êtes quelqu'un de bien.");
		if (niveauTraitrise > 0) {niveauTraitrise -= 1;}
		}
	}
	
}
