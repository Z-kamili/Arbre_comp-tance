package application;

public class compétance {
	
	private String nom;
	private int id;
	private String Desc;
	private String Filiaire;
	
	public compétance(String nom, int id, String desc, String filiaire) {
		super();
		this.nom = nom;
		this.id = id;
		Desc = desc;
		Filiaire = filiaire;
	}

	public compétance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}

	public String getFiliaire() {
		return Filiaire;
	}

	public void setFiliaire(String filiaire) {
		Filiaire = filiaire;
	}
	
	
	
	
	

}
