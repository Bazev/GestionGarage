package com.hb.gestionpiquenique2.factories;

import java.util.concurrent.ThreadLocalRandom;

import com.hb.gestionpiquenique2.pojos.Cadeau;

public class CadeauFactory {
	
	private static CadeauFactory instance = null;
	
	private CadeauFactory() {
		
	}
	
	public final static CadeauFactory getInstance() {
		if (CadeauFactory.instance == null) {
			synchronized (CadeauFactory.class) {
				if (CadeauFactory.instance == null) {
					CadeauFactory.instance = new CadeauFactory();	
				}	
			}
		}
		return CadeauFactory.instance;
	}
	
	public Cadeau generateCadeau() {
		Cadeau cadeau = null;
		
		int rand = ThreadLocalRandom.current().nextInt(1,4);
		
		switch(rand) {
		case 1:
			cadeau = new Cadeau("Panier pique-nique en osier");
			break;
		case 2:
			cadeau = new Cadeau("Couverts en bambou");
			break;
		case 3:
			cadeau = new Cadeau("nappe de pique-nique");
			break;
		}
		return cadeau;
		
	}

}
