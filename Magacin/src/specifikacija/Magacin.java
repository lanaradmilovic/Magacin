package specifikacija;

import java.util.LinkedList;

import artikli.Artikal;

public interface Magacin {
	LinkedList<Artikal> artikli = new LinkedList<>();

	private Artikal add(Artikal artikal) {
		if (!artikli.contains(artikal)) {
			artikli.add(artikal);
			return artikal;
		}
		else {
			for (Artikal a : artikli) {
				if (a.getSifra()==artikal.getSifra()) {
					a.setKolicina(artikal.getKolicina());
				}
			}
			
			
		}
		return artikal;
		
		
	}
}
