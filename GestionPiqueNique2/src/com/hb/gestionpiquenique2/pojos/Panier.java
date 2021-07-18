package com.hb.gestionpiquenique2.pojos;

public class Panier {
	
	private static int inc = 1;
	protected int id;
	protected String formule;
	protected double prix;
	
	public Panier() {
		
	}
	public Panier(String nom, double prix) {
		super();
		this.id = inc++;
		this.formule = nom;
		this.prix = prix;
	}
	
	public static int getInc() {
		return inc;
	}
	public static void setInc(int inc) {
		Panier.inc = inc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return formule;
	}
	public void setNom(String nom) {
		this.formule = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		return "Panier [id=" + id + ", nom=" + formule + ", prix=" + prix + "]";
	}
	
	
	
	
	

}
