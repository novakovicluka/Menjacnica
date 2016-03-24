import java.util.LinkedList;

import paketzaspec.Interfejs;

public class implementiraInterfejs implements Interfejs {
	LinkedList<Valuta> valute = new LinkedList<Valuta>();
	@Override
	public void dodajKurs(String valuta,double prodajni,double kupovni,double srednji) {
		Valuta val = new Valuta();
		val.setIme(valuta);
		val.setKursKupovni(kupovni);
		val.setKursProdajni(prodajni);
		val.setKursSrednji(srednji);
		for (int i = 0; i < valuta.length(),i++) {
			if(valute.get(i).getIme().equals(valuta)) {
				valute.get(i) = val;
			}
		}	
	}

	@Override
	public void obrisiKurs(String valuta){
		Valuta val = new Valuta();
		val.setIme(valuta);
		val.setKursKupovni(0);
		val.setKursProdajni(0);
		val.setKursSrednji(0);
		for (int i = 0; i < valuta.length(),i++) {
			if(valute.get(i).getIme().equals(valuta)) {
				valute.get(i) = val;
			}
		}	

	}

	@Override
	public double vratiKurs(String valuta) {
		
		
		
		for (int i = 0; i < valuta.length(),i++) {
			if(valute.get(i).getIme().equals(valuta)) {
				return valute.get(i).getKursSrednji();
			}
		}	
		return 0;
	}

}
