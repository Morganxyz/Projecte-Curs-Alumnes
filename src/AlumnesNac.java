
public class AlumnesNac extends Alumnat{
	
	public AlumnesNac(String nom, String identificacio) {
		super(nom,identificacio);
	
	}

	public float calcularNotaFinal() {
		
		float notSup = 0f;
		float notInf = 0f;
		float resultatSup = 0f;
		float resultatInf =  0f;
		float mitja = 0f;
		
		
		for(int  i = 0; i < llistaNotes.size();i++) {
			
			if(llistaNotes.get(i) >= 5) {
			notSup = llistaNotes.get(i)/2;
			resultatSup += notSup;
			}else if (llistaNotes.get(i) < 5) {
			notInf = llistaNotes.get(i);
			resultatInf += notInf;
			}	
		}
		mitja =(resultatSup + resultatInf)/llistaNotes.size();
		return mitja;		
}
	
	public String toString() {
		
		return "Hola, sóc en/la " + super.getNom() + " ,el meu D.N.I es "
				+ super.getIdentificacio() + " i la meva mitjana de notes es " + this.calcularNotaFinal();
	}

}

