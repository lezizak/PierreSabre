package personnages;
import java.util.Random;

public class GrandMere extends Humain {
	private int nbConnaissanceMax = 5;
	private TypeHumain[] types = TypeHumain.values();
	private int nbTypes = 6;

	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
	}

	private enum TypeHumain {
		habitant, commercant, ronin, yakuza, samourai;
	}
		
	@Override
	public void memoriser(Humain humain){
		if (nbConnaissance < nbConnaissanceMax) {
			memoire[nbConnaissance] = humain;
			nbConnaissance +=1;
		} else {
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}
	}
	
	private String humainHasard() {
		Random random = new Random();
		TypeHumain randType = types[random.nextInt(nbTypes -1)];
		return randType.name();
	}
	
	public void ragoter() {
		for (int i = 0; i < nbConnaissance; i++) {
			Humain pers = memoire[i];
			if(pers.getClass() == Traitre.class) {
				parler("Je sais que " + pers.nom + " est un traître. Petit chenapan !");
			} else {
				parler("Je crois que " + pers.nom + " est un " + humainHasard() + ".");
			}
		}
	}
	
}
