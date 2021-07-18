package com.hb.gestionpiquenique2.pojos;

public class Cadeau {
	
	private static int inc = 1;
	private String nom;
	private int id;
	
	public Cadeau() {
		
	}

	public Cadeau(String nom) {
		super();
		this.nom = nom;
		this.id = inc++;
	}

	public static int getInc() {
		return inc;
	}

	public static void setInc(int inc) {
		Cadeau.inc = inc;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public String toString() {
		return nom;
	}
	
	
	
	
	
	

}
