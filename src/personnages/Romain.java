package personnages;
import personnages.Equipement;

///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

public class Romain {
	private String nom;
	private int force;
	private Equipement []equipements;
	private int nbEquipement=0;
	
	
	
	public Romain(String nom, int force) {
		assert force>0:"la force d�un Romain est stric. positif !";
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
	
//	public void recevoirCoup(int forceCoup) {
//	assert force>0:"la force d�un Romain est positive";
//	int forceav=force;
//	force -= forceCoup;
//	if (force > 0) {
//	parler("Aïe");
//	} else {
//	parler("J'abandonne...");
//	}
//	
//	assert force<forceav:"la force d�un Romain a diminu�";
//	}
	
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// pr�condition
		assert force > 0;
		int oldForce = force;
		forceCoup = CalculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("A�e");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		switch (force) {
		case 0:
			parler("A�e");
			default:
				equipementEjecte = ejecterEquipement();
				parler("J'abandonne...");
				break;
		}
		// post condition la force a diminu�e
		assert force < oldForce;
		return equipementEjecte;
		}
	
	private int CalculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (!(nbEquipement == 0)) { 
		texte += "\nMais heureusement, grace � mon �quipement sa force est diminu� de ";
		for (int i = 0; i < nbEquipement;) {
		if ((equipements[i] != null &&
		equipements[i].equals(Equipement.BOUCLIER)) == true) {
		resistanceEquipement += 8;
		} else {
		System.out.println("Equipement casque");
		resistanceEquipement += 5;
		}
		i++;
		}
		texte =+ resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}

	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'�quipement de " + nom.toString() + "s'envole sous la force du coup.");
		//TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
		if (equipements[i] == null) {
		continue;
		} else {
		equipementEjecte[nbEquipementEjecte] =
		equipements[i];
		nbEquipementEjecte++;
		equipements[i] = null;
		}
		}
		return equipementEjecte;
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
				System.out.println(" Le soldat "+ nom + " poss�de d�j� un " + equipement.toString() + " !");
			}
			else {
				equiper(equipement);
			}
			break;
		case 2:
			System.out.println(" Le soldat "+ nom + " est d�j� bien prot�g� ! ");
			break;
		default:
			System.out.println("Bug dans la Matrice");
			break;
		}
	}

	private void equiper(Equipement equipement) {
		System.out.println(" Le soldat "+ nom + " s��quipe avec un " + equipement.toString() + " .");
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

