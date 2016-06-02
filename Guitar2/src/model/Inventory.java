package model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import model.Guitar;

public class Inventory {
	private List<Guitar> Guitars;

	public Inventory() {
		Guitars = new LinkedList<Guitar>();
	}

	
	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> i = Guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public List search(GuitarSpec searchSpec) {
		List matchingguitars = new LinkedList();
		for (Iterator i = Guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSpec().matches(searchSpec))
				matchingguitars.add(guitar);
			System.out.println("yes");
		}
		return matchingguitars;
	}

}