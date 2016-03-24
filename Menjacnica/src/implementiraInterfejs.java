import java.util.LinkedList;

import paketzaspec.Interfejs;

public class implementiraInterfejs implements Interfejs {

	
	


	LinkedList<Valuta> valute = new LinkedList<>();
	public void dodajKurs(String valuta,double kurs) {
	for (int i = 0; i < valuta.length();i++) {
		if(valute.get(i).getIme().equals(valuta))
			{
			valute.get(i).setKursKupovni(kurs+0.5);
			valute.get(i).setKursSrednji(kurs);
			valute.get(i).setKursProdajni(kurs-0.5);
			}}	
		

	}

	@Override

	public void obrisiKurs(String valuta) {
		for (int i = 0; i < valuta.length();i++) {
			if(valute.get(i).getIme().equals(valuta)) {
				valute.get(i).setKursKupovni(0);
				valute.get(i).setKursSrednji(0);
				valute.get(i).setKursProdajni(0);

			}
		}	

	}

	
	public double vratiKurs(String valuta) {

		double vratiKurs;
		for (int i = 0; i < valuta.length();i++) {
			if(valute.get(i).getIme().equals(valuta)) {
				return valute.get(i).getKursSrednji();
				
			}
		}	

		}	

}
