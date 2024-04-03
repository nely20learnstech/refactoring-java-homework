package iut.bad;

public class Femme extends Humain {

	public Femme (String lastname, String firstname, int age) {
		super(lastname, firstname, age);	
	}

	@Override
	public String toString() {
		return "Mon nom est " + getNom() + " " + getPrenom()+ ".\n" + "J'ai " + getAge()+ ".";
	}
	
	public static void main(String[] args)
	{
		Homme homme = new Homme("Dupont", "Jeannot", 23);
		Femme femme = new Femme("Marie", "Thérèse", 18);
		
		homme.ami(femme);
		femme.ami(homme);
	}
}
