package projettest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Bibliotheque {
	private String nomBibliotheque;
	private String adrBibliotheque;
	Set<Bibliothecaire> listBiblio;
	List<Document> listDoc;
	Map <String, Adherent> listAdh;
	
	
	public Bibliotheque(String nomBibliotheque, String adrBibliotheque) {
		
		this.nomBibliotheque = nomBibliotheque;
		this.adrBibliotheque = adrBibliotheque;
		listBiblio = new HashSet<Bibliothecaire>();
		listDoc = new ArrayList<Document>();
		listAdh = new HashMap<String, Adherent>();
		
		}
	public String getNomBibliotheque() {
		return nomBibliotheque;
	}
	public void setNomBibliotheque(String nomBibliotheque) {
		this.nomBibliotheque = nomBibliotheque;
	}
	public String getAdrBibliotheque() {
		return adrBibliotheque;
	}
	public void setAdrBibliotheque(String adrBibliotheque) {
		this.adrBibliotheque = adrBibliotheque;
	}
	
//// méthode de gestion de la liste de bibliothecaires
	//ajout
	public void ajouterBibliothecaire(Bibliothecaire b) {
		if (listBiblio.contains(b))
		System.out.println("Ajout: échec");
		else
		listBiblio.add(b);
		System.out.println("Ajout: réussi");
		}
	//suppression
	public void supprimerBibliothecaire(Bibliothecaire b) {
		if (listBiblio.contains(b))
		{listBiblio.remove(b);
		System.out.println("Suppression: réussi");}
		else
		System.out.println("Supression: échec");
		}
	//recherche
	public boolean rechercherBibliothecaire(Bibliothecaire b) {
		if (listBiblio.contains(b))
		{
		System.out.println("Bibliothecaire : existe");
		return true;
		}
		else {
		System.out.println("Bibliothecaire: n'existe pas");
		return false;
		}}
	//modification 
		
		public void modifierBibliothecaire(Bibliothecaire b, String adrBibliothecaire) {
			if (listBiblio.contains(b)) {
			b.setAdrBibliothecaire(adrBibliothecaire);
			System.out.println("Modification: succès");
			}
			else
			System.out.println("Modification: echec");
			}
		
		//affichage
		
		public void afficherListBibliothecaire() {
			System.out.println("\n" + listBiblio.toString());
			}
	////méthode de gestion de la liste de Document 
		//AJOUT
		public void ajouterDocument(Document b) {
			if (listDoc.contains(b))
			System.out.println("Ajout: échec");
			else
			listDoc.add(b);
			System.out.println("Ajout: réussi");
			}
		
		//SUPP
		public void supprimerDocument(Document b) {
			if (listDoc.contains(b))
			{listDoc.remove(b);
			System.out.println("Suppression: réussi");}
			else
			System.out.println("Supression: échec");
			}
		
		//recherche
		public boolean rechercherDocument(Document b) {
			if (listDoc.contains(b))
			{
			System.out.println("document : existe");
			return true;
			}
			else {
			System.out.println("document : n'existe pas");
			return false;
			}}
		
		
				
				//affichage
				
				public void afficherListDocument() {
					System.out.println("\n" + listDoc.toString());
					}
			//// méthode de gestion de la liste de adherent
				//Ajout
				public void ajouterAdherent(String numeroAdherent, Adherent adherent) {
				    listAdh.put(numeroAdherent, adherent);
				    System.out.println("Adhérent ajouté avec succès");
				}
				//supp
				public void supprimerAdherent(String numeroAdherent) {
				    if (listAdh.containsKey(numeroAdherent)) {
				        listAdh.remove(numeroAdherent);
				        System.out.println("Adhérent supprimé avec succès");
				    } else {
				        System.out.println("Adhérent non trouvé");
				    }
				}
              //rechereche
				public boolean rechercherAdherent(String numeroAdherent) {
				    if (listAdh.containsKey(numeroAdherent)) {
				        System.out.println("Adhérent trouvé");
				        return true;
				    } else {
				        System.out.println("Adhérent non trouvé");
				        return false;
				    }
				}


	}
		


	

