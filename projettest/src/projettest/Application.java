package projettest;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bibliotheque biblio = new Bibliotheque ("LeSavoir", "BabElzzouar");
		Bibliothecaire b1 = new Bibliothecaire("01/2023", "Moali", "Bejaia");
		Bibliothecaire b2 = new Bibliothecaire ("02/2023", "Madi", "Alger");
		Bibliothecaire b3 = new Bibliothecaire ("03/2023", "Hamane", "Oran");
		biblio.ajouterBibliothecaire(b3);
		biblio.ajouterBibliothecaire(b1);
		biblio.ajouterBibliothecaire(b2);
		biblio.afficherListBibliothecaire();
		}
	
}
