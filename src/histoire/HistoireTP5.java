package histoire;
import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Yakuza;

public class HistoireTP5 {	
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		//System.out.println("Le marchand Marco rencontre un ronin.");
		//marco.faireConnaisanceAvec(roro);
		//System.out.println("Le marchand Marco rencontre un yakuza.");
		//marco.faireConnaisanceAvec(yaku);
		//System.out.println("Le marchand Marco rencontre un autre marchand.");
		//marco.faireConnaisanceAvec(chonin);
		//System.out.println("Le marchand Marco rencontre un autre marchand.");
		//marco.faireConnaisanceAvec(kumi);
		//marco.listerConnaissance();
		//roro.listerConnaissance();
		//yaku.listerConnaissance();
		
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		//akimoto.faireConnaisanceAvec(marco);
		//akimoto.listerConnaissance();
		//akimoto.boire("thé");
		
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		akimoto.faireConnaisanceAvec(masako);
		masako.ranconner(null);
		masako.faireConnaisanceAvec(yaku);
		masako.faireLeGentil();
		masako.faireConnaisanceAvec(roro);
		
	}
}