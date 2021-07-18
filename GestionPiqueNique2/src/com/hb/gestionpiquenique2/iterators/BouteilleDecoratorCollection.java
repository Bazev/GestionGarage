package com.hb.gestionpiquenique2.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.hb.gestionpiquenique2.pojos.BouteilleDecorator;

public class BouteilleDecoratorCollection implements Iterator<BouteilleDecorator>, Iterable<BouteilleDecorator> {
	
	private List<BouteilleDecorator> bouteilles = new ArrayList<>();
	private int offset =0;
	
	@Override
	public Iterator<BouteilleDecorator> iterator() {
		// TODO Auto-generated method stub
		return bouteilles.iterator();
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return offset < bouteilles.size();
	}
	@Override
	public BouteilleDecorator next() {
		// TODO Auto-generated method stub
		return bouteilles.get(offset++);
	}
	
	public void add(BouteilleDecorator bouteille) {
		bouteilles.add(bouteille);
	}
	
	public int size() {
		return bouteilles.size();
	}
	
	public BouteilleDecorator get(int offset) {
		return bouteilles.get(offset);
	}
	

}
