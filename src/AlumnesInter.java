
public class AlumnesInter extends Alumnat{
	
	public AlumnesInter(String nom, String identificacio) {
		super(nom,identificacio);
	}
	
	public float calcularNotaFinal() {
		
		float notPar;
		float notImpar;
		float resultatSup = 0f;
		float resultatInf =  0f;
		float mitja = 0f;
		
		for(int  i = 0; i <llistaNotes.size();i++) {
	
			if(llistaNotes.get(i) % 2 == 0) {
			notPar = llistaNotes.get(i)*2;
			resultatSup += notPar;
			}else if(llistaNotes.get(i) % 2 != 0) {
			notImpar = llistaNotes.get(i)/2;
			resultatInf += notImpar;
			}	
		}
		mitja = (resultatSup + resultatInf)/llistaNotes.size();
		
		return mitja;		
}
	
	public String toString() {
		
		return "Hola, sóc en/la " + super.getNom() + " ,el meu D.N.I es "
				+ super.getIdentificacio() + " i la meva mitjana de notes es " + this.calcularNotaFinal();
	}
}
