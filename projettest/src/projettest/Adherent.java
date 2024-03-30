package projettest;

public class Adherent {
    private String numAdherent;
    private String nomAdherent;
    private String adresseAderent;
    
	public Adherent(String numAdherent, String nomAdherent, String adresseAderent) {
	
		this.numAdherent = numAdherent;
		this.nomAdherent = nomAdherent;
		this.adresseAderent = adresseAderent;
	}

	public String getNumAdherent() {
		return numAdherent;
	}

	public void setNumAdherent(String numAdherent) {
		this.numAdherent = numAdherent;
	}

	public String getNomAdherent() {
		return nomAdherent;
	}

	public void setNomAdherent(String nomAdherent) {
		this.nomAdherent = nomAdherent;
	}

	public String getAdresseAderent() {
		return adresseAderent;
	}

	public void setAdresseAderent(String adresseAderent) {
		this.adresseAderent = adresseAderent;
	}
	@Override 
	public String toString() {
	 return "Adherent [numAdherent=" + numAdherent + ",nomAdherent=" + nomAdherent + ",adresseAderent =" + adresseAderent + "]";
	}
    
}
