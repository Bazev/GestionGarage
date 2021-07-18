package com.hb.gestionpiquenique2.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


import com.hb.gestionpiquenique2.builders.PanierPiqueNiqueBuilder;
import com.hb.gestionpiquenique2.factories.CadeauFactory;
import com.hb.gestionpiquenique2.iterators.BouteilleDecoratorCollection;
import com.hb.gestionpiquenique2.pojos.BouteilleChampagne;
import com.hb.gestionpiquenique2.pojos.BouteilleDecorator;
import com.hb.gestionpiquenique2.pojos.BouteilleRose;
import com.hb.gestionpiquenique2.pojos.BouteilleVinBlanc;
import com.hb.gestionpiquenique2.pojos.BouteilleVinRouge;
import com.hb.gestionpiquenique2.pojos.Cadeau;
import com.hb.gestionpiquenique2.pojos.Panier;
import com.hb.gestionpiquenique2.pojos.PanierPiqueNique;


public class PiqueNiqueMain {
	
	private static Scanner sc = new Scanner(System.in);
	private static List<Panier> paniers = new ArrayList<Panier>();
	private static BouteilleDecoratorCollection bouteilles = new BouteilleDecoratorCollection();
	
	private static void ajoutBouteilles() {
		bouteilles.add(new BouteilleChampagne());
		bouteilles.add(new BouteilleRose());
		bouteilles.add(new BouteilleVinBlanc());
		bouteilles.add(new BouteilleVinRouge());
		
	}
	
	private static void ajoutFormules() {
		paniers.add(new Panier("Le pique-nique étoilé du Burgundy", 33.50));
		paniers.add(new Panier("Le pique-nique healthy de Jour", 19.90));
		paniers.add(new Panier("Le pique-nique franchouillard de Frichti", 7));
		paniers.add(new Panier("Le pique-nique de La Maison Nordique", 14.50));
	}
	
	private static void afficherPanier() {
		System.out.println("1) Le pique-nique étoilé du Burgundy");
		System.out.println("2) Le pique-nique healthy de Jour");
		System.out.println("3) Le pique-nique franchouillard de Frichti");
		System.out.println("4) Le pique-nique de La Maison Nordique");
	}
	
	
	private static int saisirChoix(String text) {
		int choix = 0;
		System.out.println(text);
		try {
			choix = Integer.parseInt(sc.nextLine());
			
		} catch (NumberFormatException e) {
			System.out.println("Veuillez saisir un nombre ! ");
		}
		return choix;
	}
	
	private static void NombrePersonne() {
		System.out.println("Nombre de personne pour un pannier");
		System.out.println("\t - 2 personnes");
		System.out.println("\t - 4 personnes");
		System.out.println("\t - 6 personnes");
	}
	
	private static Panier choixPanier(int choixPanier) {
		for (Panier panier : paniers) {
			if(panier.getId()== choixPanier) {
				return panier;
			}
		}
		return null;
	}
	
	private static void choixBouteille() {
		int id=1;
		
		for (BouteilleDecorator bouteilleDecorator : bouteilles) {
			System.out.println(id+ ". "+bouteilleDecorator.getNom()+" "+bouteilleDecorator.getPrix());
			id++;
		}
	
	}
	
	
	
	public static void main(String[] args) {
		
		ajoutFormules();
		ajoutBouteilles();
		
		PanierPiqueNiqueBuilder builder = new PanierPiqueNiqueBuilder();
		
		NombrePersonne();
		int NbPersonne = saisirChoix("Combien de personnes ?");
		builder.choixNombrePanier(NbPersonne);
		
		afficherPanier();
		int idPanier = saisirChoix("Choisissez votre panier");
		Panier panier = choixPanier(idPanier);
		
		if(panier != null) {
			panier.setPrix(panier.getPrix()*NbPersonne + 10);
			
			BouteilleDecorator bouteille = null;
			System.out.println("Souhaitez-vous une bouteille ? (o/n)");
			String choixBouteille =sc.nextLine();
			
			if(choixBouteille.equalsIgnoreCase("o")) {
				choixBouteille();
				int idBouteille = saisirChoix("Choisissez votre bouteille");
				bouteille = bouteilles.get(idBouteille -1);
				//bouteille.setNom(panier.getNom());
				bouteille.setNom(bouteille.getNom());
				
				bouteille.setPrix(bouteille.getPrix()+panier.getPrix());
				bouteille.setPanier(panier);
				
				System.out.println("Vous avez ajouté une "+ bouteille.getNom());
				
				builder.choixFormule(bouteille);
			}
			else {
				builder.choixFormule(panier);
			}
			
			System.out.println("Veuillez saisir un message : ");
			String message = sc.nextLine();
			
			builder.definirMessage(message);
			
			Cadeau cadeau = CadeauFactory.getInstance().generateCadeau();
			
			builder.genererCadeau(cadeau);
			
			PanierPiqueNique piqueNique = builder.build();
			
			
			System.out.println("Vous avez choisi :");
			System.out.println(panier.getNom() + "pour " + NbPersonne + " personnes");
			
			if(bouteille != null) {
				System.out.println("avec une " + bouteille.getNom());
				System.out.println("Prix du panier : " + bouteille.getPrix());
			}
			else {
				System.out.println("Prix du panier : " + panier.getPrix());
			}
			
			System.out.println("Message personnalisé : " + message);
			System.out.println("Cadeau : " + cadeau);
			
		sc.close();
	
		}
	}
	
	
	
}
