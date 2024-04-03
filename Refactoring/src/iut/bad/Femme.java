package iut.bad;

public class Femme extends Humain {

	public Femme (String lastname, String firstname, int age) {
		super(lastname, firstname, age);	
	}

	@Override
	public String toString() {
		return "Son nom est" + getNom() + " " + getPrenom()+ ".\n" + "Age :" + getAge()+ ".";
	}
}
