package personnages;
import personnages.Gaulois;
import personnages.Chef;

public class Village {
private String nom;
private Chef chef;
private Gaulois[] villageois;
private int nbvillageois;
private int nbVillageoisMaximum;

public Village(String nom) {
this.nom = nom;
this.nbVillageoisMaximum=50;
this.villageois = new Gaulois[nbVillageoisMaximum];
this.nbvillageois=30;
}

public void setChef(Chef chef) {
this.chef = chef;
}

public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbvillageois]=gaulois;
		nbvillageois++;
	
}

public Gaulois trouverHabitant(int num){
	
	return villageois[num];
	
}

public String getNom() {
return nom;
}

public void afficherVillageois() {
	System.out.println("Dans le village du chef "+ chef.getNom() + " vivent dans les légendaires gaulois");
	for (int i = 0; i < nbvillageois; i++) {
        if (villageois[i] != null) {
            System.out.println("- " + villageois[i].getNom());
        }
    }
	
}

public static void main(String[] args) {
	Village village=new Village("Village des Irréductibles");
	village.nbVillageoisMaximum=30;
	Gaulois gaulois = village.trouverHabitant(30);
	// Car on atteint le maximum du tableau et pas element
	System.out.println(gaulois);
	
	Chef abraracourcix=new Chef("Abraracourix",6,village);
	village.setChef(abraracourcix);
	Gaulois asterix=new Gaulois("Asterix",8);
	village.ajouterHabitant(asterix);
	Gaulois gauloiss = village.trouverHabitant(1);
	System.out.println(gauloiss);
	Gaulois obelix=new Gaulois("Obelix",25);
	village.ajouterHabitant(obelix);
	village.afficherVillageois();
}
}

