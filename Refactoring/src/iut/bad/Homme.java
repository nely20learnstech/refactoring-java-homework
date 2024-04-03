package iut.bad;

public class Homme extends Humain{
	
	public Homme (String nom, String prenom, int age) {
		super(nom, prenom, age);	
	}
	
	public String toString()
	{
		return "";
	}

	@Override
	public String toString() {
		return "Son nom est" + getNom() + " " + getPrenom()+ ".\n" + "Age :" + getAge()+ ".";
	}
}
