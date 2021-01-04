package application;

public class Apprenant extends User {
	private String promotion;
	private String Filiaire;
	public Apprenant() {
		super();
	}
	public Apprenant(int id, String nom, String prenom, int age,String promotion,String Filiaire){
		super(id, nom, prenom, age);
		this.promotion = promotion;
		this.Filiaire = Filiaire;
	}
	public String getPromotion() {
		return promotion;
	}
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}
	public String getFiliaire() {
		return Filiaire;
	}
	public void setFiliaire(String filiaire) {
		Filiaire = filiaire;
	}
	
	public void Update() {
		
		//code source.
		
	}
	
	

}
