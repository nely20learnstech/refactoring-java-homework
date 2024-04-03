package iut.bad;

public class Humain implements Consommation {
	private String nom;
	private String prenom;
	private int age;

	public Humain(String nom, String prenom, int age) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setAge(age);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void details()
	{
		System.out.println("Son nom est" + getNom() + " " + getPrenom()+ ".\n" + "Age :" + getAge()+ ".");
	}
	
	@Override
	public void manger()
	{
		System.out.println("Je mange.");
	}
	
	@Override
	public void boire()
	{
		System.out.println("Je bois.");
	}
	
	public void ami(Humain autre, int dureeAmitie=100)
	{
		System.out.println("Moi "+ this.nom + ",je suis ami avec " + autre.getNom() + " depuis " + dureeAmitie + " jours");
	}
	
	
	
}