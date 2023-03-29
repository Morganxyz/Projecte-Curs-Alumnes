import java.util.ArrayList;

public abstract class Alumnat {
	
	private String nom;
	private String identificacio;
	public ArrayList<Integer>llistaNotes;
	
	public Alumnat(String nom, String identificacio) {

		this.nom = nom;
		this.identificacio = identificacio;
		this.llistaNotes = new ArrayList<>();
		
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getIdentificacio() {
		return this.identificacio;
	}
	
	
	public ArrayList<Integer> getLlistaNotes(){
		return this.llistaNotes;
	}
	
	public void setIdentificacio(String identificacio) {
		this.identificacio = identificacio;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	//Important per poder afegir les notes predefinides!!
	//public void setLlistaNotes(int[] llistaNotes) {
	//	for(int notes: llistaNotes) {
		//	this.llistaNotes.add(notes);
	//	}
	public void setLlistaNotes(int llistaNotes) {
		this.llistaNotes.add(llistaNotes);
	}
	
	public abstract float calcularNotaFinal();
	
	public String toString() {
		return this.identificacio + " " + this.nom + " té les següents notes " + this.llistaNotes;
	}
}
