package model;

public class Person {
	
	private DocumentType documentType;
	private String id;
	/**
	 * @param documentType
	 * @param id
	 */
	public Person(DocumentType documentType, String id) {
		this.documentType = documentType;
		this.id = id;
	}
	/**
	 * @return the documentType
	 */
	public DocumentType getDocumentType() {
		return documentType;
	}
	/**
	 * @param documentType the documentType to set
	 */
	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
}
