package personnages;
import java.util.Random;

import personnages.Gaulois;



public class Druide {
private String nom;
private int effetpotion;
private int effetPotionMin;
private int effetPotionMax;


public Druide(String nom, int effetPotionMin, int effetPotionMax) {
this.nom = nom;
this.effetpotion=1;
this.effetPotionMin = effetPotionMin;
this.effetPotionMax = effetPotionMax;

parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
+ effetPotionMax + ".");
}

public String getNom() {
return nom;
}

public void preparerPotion(int effetPotionMin,int effetPotionMax) {
	Random random = new Random();
	int potion = random.nextInt(effetPotionMax - effetPotionMin + 1) + effetPotionMin;
	if(potion>7) {
		parler("J'ai préparé une super potion de force"  + potion);	}
	else{ parler("Je n'ai pas trouvé tous les ingredients, "
			+ "ma potion est seulement de force " + potion);
	}
}


public void booster(Gaulois gaulois) {
	
	if((gaulois.getNom()).equals("Obelix")) {
		System.out.println(" Non, Obélix !... Tu n’auras pas de potion magique !" );}
	else {gaulois.boirePotion(effetpotion);}
	
}


public void parler(String texte) {
System.out.println(prendreParole() + "< " + texte + ">");

}

private String prendreParole() {
return "Le druide " + nom + " : ";
}


public static void main(String[] args) {
	Druide panoramix=new Druide("Panoramix",5,10);
	panoramix.preparerPotion(5, 10);
	
}
}







