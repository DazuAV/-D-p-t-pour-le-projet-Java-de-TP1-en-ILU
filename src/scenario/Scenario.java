package scenario;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		System.out.println("Scénario 1 ");
		Gaulois asterix= new Gaulois("Asterix",8);
		Gaulois obelix= new Gaulois("Obelix",100);
		Romain minus= new Romain("Minus",5);
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		minus.recevoirCoup(5);
		
		System.out.println("Scénario 2 ");
		Druide panoramix=new Druide("Panoramix",5,10);
		panoramix.preparerPotion(6, 6);
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		asterix.boirePotion(6);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
		

		
	}

}
