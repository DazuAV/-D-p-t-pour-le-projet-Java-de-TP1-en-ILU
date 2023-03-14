package personnages;
import personnages.Equipement;

public class Romain {

	private String nom;
	private int force;
	private Equipement equipements[];
	private int nbEquipement=0;
	
	
	
	public Romain(String nom, int force) {
		assert force>0:"la force d’un Romain est stric. positif !";
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2];
	}
	
	public String getNom() {
	   return nom;
	}
	
	public void parler(String texte) {
	   System.out.println(prendreParole() + "< " + texte + " >");
	}
	
	private String prendreParole() {
	   return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
	assert force>0:"la force d’un Romain est positive";
	int forceav=force;
	force -= forceCoup;
	if (force > 0) {
	parler("AÃ¯e");
	} else {
	parler("J'abandonne...");
	}
	
	assert force<forceav:"la force d’un Romain a diminué";
	}
	
	public void afficherEquipement() {
		System.out.println("Les Equipements sont actuellement:");
		for(Equipement equipement : Equipement.values()) {
			System.out.println("- " + equipement.toString());
		}
	}
		
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 0:
			equiper(equipement);
			break;
		case 1:
			if(equipement==equipements[0] ) {
				System.out.println(" Le soldat "+ nom + " possède déjà un " + equipement.toString() + " !");
			}
			else {
				equiper(equipement);
			}
			break;
		case 2:
			System.out.println(" Le soldat "+ nom + " est déjà bien protégé ! ");
			break;
		default:
			System.out.println("Bug dans la Matrice");
			break;
		}
	}

	private void equiper(Equipement equipement) {
		System.out.println(" Le soldat "+ nom + " s’équipe avec un " + equipement.toString() + " .");
		equipements[nbEquipement]=equipement;
		nbEquipement++;
	}

	public static void main(String[] args) {
	Romain antivirus = new Romain("Antivirus",6);
	antivirus.afficherEquipement();
	antivirus.sEquiper(Equipement.CASQUE);
	antivirus.sEquiper(Equipement.CASQUE);
	antivirus.sEquiper(Equipement.BOUCLIER);
	antivirus.sEquiper(Equipement.CASQUE);
	

	}
}

