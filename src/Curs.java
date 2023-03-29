import java.util.ArrayList;

public class Curs {
	
	private String nom;
	private ArrayList<Alumnat>llistaAlumnes;
	
	public Curs(String nom) {
		
		this.nom =  nom;
		this.llistaAlumnes = new ArrayList<>();
		
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public ArrayList<Alumnat> getLlistaAlumnes(){
		return this.llistaAlumnes;
	}
	
	public void setNom(String nom) {
		
		this.nom = nom;
	}
	
	public void setLlistaAlumnes(Alumnat llistaAlumnes) {
		this.llistaAlumnes.add(llistaAlumnes);
	}

	public String ToString() {
		return "El nom del curs es " + this.nom;
	}
}

