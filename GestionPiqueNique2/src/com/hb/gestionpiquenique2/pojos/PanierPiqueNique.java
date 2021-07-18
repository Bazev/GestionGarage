package com.hb.gestionpiquenique2.pojos;

public class PanierPiqueNique {
	
	private static int inc = 1;
	protected int id;
	private int nPersonne;
	private Panier panier;
	private String message;
	private Cadeau cadeau;
	
	public PanierPiqueNique() {
		
	}
	public PanierPiqueNique(int nPersonne, Panier panier, String message, Cadeau cadeau) {
		super();
		this.id = inc++;
		this.nPersonne = nPersonne;
		this.panier = panier;
		this.message = message;
		this.cadeau = cadeau;
	}
	
	public static int getInc() {
		return inc;
	}
	public static void setInc(int inc) {
		PanierPiqueNique.inc = inc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getnPersonne() {
		return nPersonne;
	}
	public void setnPersonne(int nPersonne) {
		this.nPersonne = nPersonne;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Cadeau getCadeau() {
		return cadeau;
	}
	public void setCadeau(Cadeau cadeau) {
		this.cadeau = cadeau;
	}
	@Override
	public String toString() {
		return "PanierPiqueNique [id=" + id + ", nPersonne=" + nPersonne + ", panier=" + panier + ", message=" + message
				+ ", cadeau=" + cadeau + "]";
	}
	
	
	
	
	

}
