package iut.bad;

public class Homme extends Humain{
	
	public Homme (String nom, String prenom, int age) {
		super(nom, prenom, age);	
	}

	@Override
	public String toString() {
		return "Mon nom est" + getNom() + " " + getPrenom()+ ".\n" + "J'ai :" + getAge()+ ".";
	}
}
