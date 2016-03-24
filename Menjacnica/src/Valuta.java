
public class Valuta {
private String ime;
private String skr;
private double kursProdajni;
private double kursSrednji;
private double kursKupovni;

public String getIme() {
	
	return ime;
}
public void setIme(String ime) {
	
	if(ime == null || ime.isEmpty()) throw new RuntimeException("Ime ne sme biti null ili prazan string");
	this.ime = ime;
}
public String getSkr() {
	return skr;
}
public void setSkr(String skr) {
	if(skr == null || skr.isEmpty()) throw new RuntimeException("Skracenica ne sme biti null ili prazan string");
	this.skr = skr;
}
public double getKursProdajni() {
	return kursProdajni;
}
public void setKursProdajni(double kursProdajni) {
	if(kursProdajni < 0) throw new RuntimeException("Prodajni kurs ne sme biti manji od nule");
	this.kursProdajni = kursProdajni;
}
public double getKursSrednji() {
	return kursSrednji;
}
public void setKursSrednji(double kursSrednji) {
	if(kursSrednji < 0) throw new RuntimeException("Srednji kurs ne sme biti manji od nule");
	this.kursSrednji = kursSrednji;
}
public double getKursKupovni() {
	return kursKupovni;
}
public void setKursKupovni(double kursKupovni) {
	if(kursKupovni < 0) throw new RuntimeException("Kupovni kurs ne sme biti manji od nule");
	this.kursKupovni = kursKupovni;
}
@Override
public String toString() {
	return "ime: " + ime + ", skr: " + skr + ", kursProdajni: " + kursProdajni + ", kursSrednji: " + kursSrednji
			+ ", kursKupovni: " + kursKupovni;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((ime == null) ? 0 : ime.hashCode());
	long temp;
	temp = Double.doubleToLongBits(kursKupovni);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(kursProdajni);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(kursSrednji);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((skr == null) ? 0 : skr.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Valuta other = (Valuta) obj;
	if (ime == null) {
		if (other.ime != null)
			return false;
	} else if (!ime.equals(other.ime))
		return false;
	if (Double.doubleToLongBits(kursKupovni) != Double.doubleToLongBits(other.kursKupovni))
		return false;
	if (Double.doubleToLongBits(kursProdajni) != Double.doubleToLongBits(other.kursProdajni))
		return false;
	if (Double.doubleToLongBits(kursSrednji) != Double.doubleToLongBits(other.kursSrednji))
		return false;
	if (skr == null) {
		if (other.skr != null)
			return false;
	} else if (!skr.equals(other.skr))
		return false;
	return true;
}




}
