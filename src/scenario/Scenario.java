package scenario;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix= new Gaulois("Asterix",10);
		Romain minus= new Romain("Minus",2);
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		minus.recevoirCoup(5);
		asterix.frapper(minus);
		minus.recevoirCoup(5);
		asterix.frapper(minus);
		minus.recevoirCoup(0);
	}

}
