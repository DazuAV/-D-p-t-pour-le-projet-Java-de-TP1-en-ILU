package personnages;
import personnages.Druide;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;

	
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

	@Override
	
//	methode toString permet affichage
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
		
	}
	
	public void boirePotion(int effetPotion) {
		Druide panoramix = new Druide("Panoramix",5,10);
		effetPotion = panoramix.preparerPotion(0,3);
		if(effetPotion==3) {
			System.out.println(nom + "Merci Druide, je sens que ma force est 3 fois décuplée");
		}
	}
	
	

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		System.out.println(asterix);
		Romain antivirus = new Romain("Antivirus",2);
		asterix.parler("Vive le Sanglier !");
		asterix.frapper(antivirus);
		
	}
	


	
}
