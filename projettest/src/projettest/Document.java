package projettest;

public class Document {
	private String refDocument;
	private String typeDocument;
	private String titreDocument;
	private String disponible;
	public Document(String refDocument, String typeDocument, String titreDocument, String disponible) {
		
		this.refDocument = refDocument;
		this.typeDocument = typeDocument;
		this.titreDocument = titreDocument;
		this.disponible = disponible;
	}
	public String getRefDocument() {
		return refDocument;
	}
	public void setRefDocument(String refDocument) {
		this.refDocument = refDocument;
	}
	public String getTypeDocument() {
		return typeDocument;
	}
	public void setTypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}
	public String getTitreDocument() {
		return titreDocument;
	}
	public void setTitreDocument(String titreDocument) {
		this.titreDocument = titreDocument;
	}
	public String getDisponible() {
		return disponible;
	}
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	@Override 
	public String toString() {
	    return "Document [refDocument=" + refDocument + ", typeDocument=" + typeDocument + ", titreDocument=" + titreDocument + ", disponible=" + disponible + "]";
	}

	

}
