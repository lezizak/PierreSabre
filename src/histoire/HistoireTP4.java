package histoire;
import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {	
	
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		System.out.println("-------------------------------------------------------------");
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		System.out.println("-------------------------------------------------------------");
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
	}
}
