package com.hb.gestionpiquenique2.builders;

import com.hb.gestionpiquenique2.pojos.Cadeau;
import com.hb.gestionpiquenique2.pojos.Panier;
import com.hb.gestionpiquenique2.pojos.PanierPiqueNique;

public class PanierPiqueNiqueBuilder {
	
	private PanierPiqueNique panierPiqueNique;
	
	public PanierPiqueNiqueBuilder() {
		panierPiqueNique = new PanierPiqueNique();
	}
	
	public PanierPiqueNiqueBuilder choixNombrePanier(int Npanier ) {
		panierPiqueNique.setnPersonne(Npanier);
		return this;
	}
	
	public PanierPiqueNiqueBuilder choixFormule(Panier formule) {
		panierPiqueNique.setPanier(formule);
		return this;
	}
	
	public PanierPiqueNiqueBuilder genererCadeau(Cadeau cadeau) {
		panierPiqueNique.setCadeau(cadeau);
		return this;
	}
	
	public PanierPiqueNiqueBuilder definirMessage(String message) {
		panierPiqueNique.setMessage(message);
		return this;
	}
	
	public PanierPiqueNique build() {
		return panierPiqueNique;
	}

}
