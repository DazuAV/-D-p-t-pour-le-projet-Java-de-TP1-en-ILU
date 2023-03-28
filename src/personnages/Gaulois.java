package personnages;


public class Gaulois {
	private String nom;
	private int force;
	private int nbtrophees;
	private int effetPotion=1;
	private Equipement []trophees = new Equipement[100];
	
	
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {

		System.out.println(prendreParole() + "< " + texte + ">");
	}
	

	public void boirePotion(int potion) {
		System.out.println(" Merci Druide, je sens que ma force est " +  potion  + " fois decuple");

		effetPotion=potion;
		
	}

//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}

//	public void frapper(Romain romain) {
//
//		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
//
//		romain.recevoirCoup(effetPotion*(force / 3));
//	}
	
	
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		Equipement []trophees = romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nbtrophees++) {
		this.trophees[nbtrophees] = trophees[i];
		}
		}


	@Override
	
//	methode toString permet affichage
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
		
	}
	
	
	

	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("Astérix",8);

		System.out.println(asterix);
		Romain antivirus = new Romain("Antivirus",2);
		asterix.parler("Vive le Sanglier !");
		asterix.frapper(antivirus);
		asterix.boirePotion(3);
		
	}
	


	
}
