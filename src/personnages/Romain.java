package personnages;

public class Romain {

	private String nom;
	private int force;
	
	
	
	public Romain(String nom, int force) {
		assert force>0:"la force d’un Romain est stric. positif !";
		this.nom = nom;
		this.force = force;
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
	
	public static void main(String[] args) {
		Romain antivirus = new Romain("Antivirus",6);
	
	}

	}
	



