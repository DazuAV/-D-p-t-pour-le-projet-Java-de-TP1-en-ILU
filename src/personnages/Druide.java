package personnages;
import java.util.Random;

public class Druide {
private String nom;
private int effetPotionMin;
private int effetPotionMax;

public Druide(String nom, int effetPotionMin, int effetPotionMax) {
this.nom = nom;
this.effetPotionMin = effetPotionMin;
this.effetPotionMax = effetPotionMax;
parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � "
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

public void parler(String texte) {
System.out.println(prendreParole() + "� " + texte + "�");
}

private String prendreParole() {
return "Le druide " + nom + " : ";
}
}
