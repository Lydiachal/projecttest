package projettest;

public class Bibliothecaire {
        private String numBibliothecaire;
        private String nomBibliothecaire;
        private String adrBibliothecaire;
        
		public Bibliothecaire(String numBibliothecaire, String nomBibliothecaire, String adrBibliothecaire) {
			super();
			this.numBibliothecaire = numBibliothecaire;
			this.nomBibliothecaire = nomBibliothecaire;
			this.adrBibliothecaire = adrBibliothecaire;
		}

		public String getNumBibliothecaire() {
			return numBibliothecaire;
		}

		public void setNumBibliothecaire(String numBibliothecaire) {
			this.numBibliothecaire = numBibliothecaire;
		}

		public String getNomBibliothecaire() {
			return nomBibliothecaire;
		}

		public void setNomBibliothecaire(String nomBibliothecaire) {
			this.nomBibliothecaire = nomBibliothecaire;
		}

		public String getAdrBibliothecaire() {
			return adrBibliothecaire;
		}

		public void setAdrBibliothecaire(String adrBibliothecaire) {
			this.adrBibliothecaire = adrBibliothecaire;
		}
		@Override 
		public String toString() {
		    return "Bibliothecaire [numBibliothecaire=" + numBibliothecaire + ",nomBibliothecaire=" + nomBibliothecaire + ",adrBibliothecaire =" + adrBibliothecaire + "]";
		}
        
}
