package com.hb.gestionpiquenique2.pojos;

public class BouteilleDecorator extends Panier{
	
	protected Panier panier;
	protected String nom;
	
	public BouteilleDecorator() {
		super();
	}
	public BouteilleDecorator(Panier panier) {
		super();
		this.panier = panier;
	}
	
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return "BouteilleDecorator [panier=" + panier + ", nom=" + nom + "]";
	}
	
	
	
	
	

}
