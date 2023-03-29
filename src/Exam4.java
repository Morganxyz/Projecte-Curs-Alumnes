import java.util.ArrayList;
import java.util.Scanner;

public class Exam4 {
	
	public static Scanner entrada = new Scanner(System.in);
	public static ArrayList<Curs>llistaCursos = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcio;
		
		/*Opcio dels 15 punts.
		
		Curs curs0 = new Curs("FDLP");
		llistaCursos.add(curs0);
		
		AlumnesNac alumneNac0 = new AlumnesNac(1,"Marc", "12345678A");
		AlumnesNac alumneNac1 = new AlumnesNac(2,"Laia", "98765432B");
		AlumnesInter alumneInter0 = new AlumnesInter(3,"Peter","ABC123456");
		AlumnesInter alumneInter1 = new AlumnesInter(4,"Kate","DEF654321");
		curs0.getLlistaAlumnes().add(alumneNac0);
		curs0.getLlistaAlumnes().add(alumneNac1);
		curs0.getLlistaAlumnes().add(alumneInter0);
		curs0.getLlistaAlumnes().add(alumneInter1);
	
		
		for(int i = 0; i <  curs0.getLlistaAlumnes().size();i++) {
			System.out.println(curs0.getLlistaAlumnes().get(i).getNom());
		}
			
		int [] notesMarc = {1,3,5,7,9};
		int [] notesLaia = {2,4,6,8,10};
		int [] notesPeter = {1,2,5,6,9,10};
		int [] notesKate = {3,4,7,8};
		
		
		Notes: Important
		curs0.getLlistaAlumnes().get(0).setLlistaNotes(notesMarc); 
		System.out.println(curs0.getLlistaAlumnes().get(0).getLlistaNotes());
		curs0.getLlistaAlumnes().get(1).setLlistaNotes(notesLaia);
		System.out.println(curs0.getLlistaAlumnes().get(1).getLlistaNotes());
		curs0.getLlistaAlumnes().get(2).setLlistaNotes(notesPeter);
		System.out.println(curs0.getLlistaAlumnes().get(2).getLlistaNotes());
		curs0.getLlistaAlumnes().get(3).setLlistaNotes(notesKate);
		System.out.println(curs0.getLlistaAlumnes().get(3).getLlistaNotes());
		
		System.out.println(curs0.getLlistaAlumnes().get(0).toString());
		System.out.println(curs0.getLlistaAlumnes().get(1).toString());
		System.out.println(curs0.getLlistaAlumnes().get(2).toString());
		System.out.println(curs0.getLlistaAlumnes().get(3).toString());*/
		
		/*curs0.getLlistaAlumnes().remove(0);
		curs0.getLlistaAlumnes().get(2).setNom("Jason");
		
		for(int i = 0; i <  curs0.getLlistaAlumnes().size();i++) {
			System.out.println(curs0.getLlistaAlumnes().get(i).getNom());
		}*/
		
		
		//Opcio de tot en menu
		do {
			System.out.println("Introdueix l´opció desitjada: \n1. Crear Curs\n2. Veure Cursos"
					+ "\n3. Eliminar Curs\n4. Crear Alumne\n5. Veure Alumne\n6. Modificar Alumne"
					+ "\n7. Eliminar Alumne\n8. Inserir Notes"
					+ "\n0. Sortir");
			opcio = entrada.nextInt();
			
			switch(opcio) {
			
					case 1:	crearCurs();
						break;
					case 2: veureCursos();
						break;
					case 3:	eliminarCurs();
						break;
					case 4:	crearAlumne();
						break;
					case 5:	veureAlumne();
						break;
					case 6:	modificarAlumne();
						break;
					case 7:	eliminarAlumne();
						break;
					case 8:	inserirNotes();
						break;
					case 0:
						System.out.println("Adéu!");
						System.out.println("");
						break;
					default:
						System.out.println("L´opció desitjada no és vàlida");
						System.out.println("");
			}
				
		}while (opcio != 0);
	
	}
	
	public static void crearCurs() {
		
		String nom;
			
		entrada.nextLine();
		System.out.println("Introdueix el nom del Curs:");
		nom = entrada.nextLine();
		
		Curs curs0 = new Curs(nom);
		llistaCursos.add(curs0);
		System.out.println("Curs creat amb éxit!");
		System.out.println("");
		
	}
	
	public static void veureCursos() {
		
		for(int i = 0; i < llistaCursos.size();i++) {
		System.out.println(i+ 1 + " : " + llistaCursos.get(i).getNom());
		}
		System.out.println("");
	}
	
	public static void eliminarCurs() {
		
		String nom;
		boolean endF = false;
		int posCurs = -1;
		String res;
		int i = 0;
		
		entrada.nextLine();
		System.out.println("Introdueix el curs a eliminar: ");
		nom = entrada.nextLine();
		
		while(i < llistaCursos.size() && !endF) {
			Curs cursTrovat = llistaCursos.get(i);
			
			if(nom.equalsIgnoreCase(cursTrovat.getNom())) {
				posCurs = i;
				endF = true;
			}
		i++;
		
		}
		if(endF) {
			System.out.println(llistaCursos.get(posCurs).ToString());
			System.out.println("Vols realment eliminar aquest curs? s/n:");
			res = entrada.next();
			
			if(res.equalsIgnoreCase("s")) {
				llistaCursos.remove(posCurs);
				System.out.println("Curs eliminat amb èxit!");
				System.out.println("");
				
			}else {
				System.out.println("Eliminació avortada!");
				System.out.println("");
			}
		}else {
			System.out.println("Curs no trovat");
			System.out.println("");
		}
		
	}
	
	public static void crearAlumne() {
		
		int opcio;
		
		do {
			System.out.println("Introdueix l´opció desitjada: \n1. Alumne nacional\n2. Alumne Internacional\n0. Sortir");
			opcio = entrada.nextInt();
			
			switch(opcio) {
			
				case 1:	crearAlumneNac(); 
					break;
				case 2:	crearAlumenInter();
					break;
				case 0:
					System.out.println("Sortint!");
					System.out.println("");
					break;
				default:
					System.out.println("Opció desitjada no vàlida!");
					System.out.println("");
			}
			
			
		}while(opcio != 0);
		
	}
	
	public static void crearAlumneNac() {
		
		int posId = -1;
		boolean endF3 = false;
		String nomAl;
		String dni;
		String nom;
		boolean endF = false;
		int posCurs = -1;
		int i = 0;
		int k = 0;
		
		entrada.nextLine();
		System.out.println("Introdueix el curs on crear l´alumne Nacional: ");
		nom = entrada.nextLine();
		
		while(i < llistaCursos.size() && !endF) {
			Curs cursTrovat = llistaCursos.get(i);
			
			if(nom.equalsIgnoreCase(cursTrovat.getNom())) {
				posCurs = i;
				endF = true;
			}
		i++;
		}
		if(endF) {
				
			System.out.println("Introdueix el nom de l´Alumne Nacional: ");
			nomAl = entrada.nextLine();
			System.out.println("Introdueix el D.N.I de l´Alumne Nacional: ");
			dni = entrada.nextLine();
			
				while(k < llistaCursos.get(posCurs).getLlistaAlumnes().size() && !endF3) {
					Alumnat dniCercat = llistaCursos.get(posCurs).getLlistaAlumnes().get(k);
					
					if(dni.equalsIgnoreCase(dniCercat.getIdentificacio())){
						posId = k;
						endF3 = true;
					}
				k++;
				}
				if(endF3) {
					System.out.println("No es pot crear dos alumnes amb el mateix D.N.I");
					System.out.println("");
				}else {
				
				AlumnesNac alumneNac0 = new AlumnesNac(nomAl,dni);
				llistaCursos.get(posCurs).setLlistaAlumnes(alumneNac0);
				System.out.println("Alumne creat amb èxit!");
				System.out.println("");
				System.out.println(alumneNac0.toString());
				System.out.println("");
				}
					
			
		}else {
			System.out.println("Curs no trovat");
			System.out.println("");
		}
		
	}
	
	public static void crearAlumenInter() {
	
			int posId = -1;
			boolean endF3 = false;
			String nomAl;
			String pass;
			String nom;
			boolean endF = false;
			int posCurs = -1;
			int i = 0;
			int k = 0;
			
			entrada.nextLine();
			System.out.println("Introdueix el curs on crear l´alumne Internacional: ");
			nom = entrada.nextLine();
			
			while(i < llistaCursos.size() && !endF) {
				Curs cursTrovat = llistaCursos.get(i);
				
				if(nom.equalsIgnoreCase(cursTrovat.getNom())) {
					posCurs = i;
					endF = true;
				}
			i++;
			}
			if(endF) {
		
				System.out.println("Introdueix el nom de l´Alumne Internacional: ");
				nomAl = entrada.nextLine();
				System.out.println("Introdueix el passaport de l´Alumne Internacinal: ");
				pass = entrada.nextLine();
				
					while(k < llistaCursos.get(posCurs).getLlistaAlumnes().size() && !endF3) {
						Alumnat passCercat = llistaCursos.get(posCurs).getLlistaAlumnes().get(k);
						
						if(pass.equalsIgnoreCase(passCercat.getIdentificacio())) {
							posId = k;
							endF3 = true;
						}
					k++;
					}
					if(endF3) {
						System.out.println("No es pot crear dos alumnes amb el mateix  Id!");
						System.out.println("");
					}else {
					
					AlumnesInter alumneInter0 = new AlumnesInter(nomAl,pass);
					llistaCursos.get(posCurs).setLlistaAlumnes(alumneInter0);
					System.out.println("Alumne creat amb èxit!");
					System.out.println("");
					System.out.println(alumneInter0.toString());
					System.out.println("");
					}
						
				
			}else {
				System.out.println("Curs no trovat");
				System.out.println("");
			}
			
		}
	
	public static void veureAlumne() {
		
		String nom;
		boolean endF = false;
		boolean endF2 = false;
		int posCurs = -1;
		int posAl = -1;
		String nomAl;
		int i = 0;
		int j = 0;
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del curs de l´alumne: ");
		nom = entrada.nextLine();
		
		while(i < llistaCursos.size() && !endF) {
			Curs cursTrovat = llistaCursos.get(i);
			
			if(nom.equalsIgnoreCase(cursTrovat.getNom())) {
				posCurs = i;
				endF = true;
			}
		i++;
		}
		if(endF) {
			
		
			System.out.println("Introdueix el nom de l´alumne a acercar: ");
			nomAl = entrada.nextLine();
			while(j < llistaCursos.get(posCurs).getLlistaAlumnes().size() && !endF2) {
				Alumnat alumneTrovat = llistaCursos.get(posCurs).getLlistaAlumnes().get(j);
				
				if(nomAl.equalsIgnoreCase(alumneTrovat.getNom())) {
					posAl = j;
					endF2 = true;
				}
			j++;
			}
			
			if(endF2) {
				System.out.println(llistaCursos.get(posCurs).getLlistaAlumnes().get(posAl).toString());
				System.out.println(llistaCursos.get(posCurs).getLlistaAlumnes().get(posAl).getLlistaNotes());
			}else {
				System.out.println("Alumne no trovat!");
				System.out.println("");
			}
				
		}else {
			System.out.println("Curs no trovat");
			System.out.println("");
		}
	}
		
		
	
	public static void modificarAlumne() {
		
		String nom;
		boolean endF = false;
		boolean endF2 = false;
		int posCurs = -1;
		int posAl = -1;
		String nomAl;
		int opcio;
		String nouNom;
		String nouDoc;
		int i = 0;
		int j = 0;
		
		entrada.nextLine();
		System.out.println("Introdueix el curs de l´alumne: ");
		nom = entrada.nextLine();
		
		while(i < llistaCursos.size() && !endF) {
			Curs cursTrovat = llistaCursos.get(i);
			
			if(nom.equalsIgnoreCase(cursTrovat.getNom())) {
				posCurs = i;
				endF = true;
			}
		i++;
		}
		if(endF) {
			
		
			System.out.println("Introdueix el nom de l´alumne a acercar: ");
			nomAl = entrada.nextLine();
			while(j < llistaCursos.get(posCurs).getLlistaAlumnes().size() && !endF2) {
				Alumnat alumneTrovat = llistaCursos.get(posCurs).getLlistaAlumnes().get(j);
				
				if(nomAl.equalsIgnoreCase(alumneTrovat.getNom())) {
					posAl = j;
					endF2 = true;
				}
			j++;
			}
			
			if(endF2) {
				System.out.println(llistaCursos.get(posCurs).getLlistaAlumnes().get(posAl).toString());
				
				do {
				System.out.println("Introdueix el camp de l´alumne a modificar: "
						+ "\n1. Modificar nom de l´alumne"
						+ "\n2. Modificar D.N.I o Passaport"
						+ "\n0. Sortir");
				opcio = entrada.nextInt();
				
					switch(opcio) {
					
						case 1: 
							System.out.println("Introdueix el nou nom: ");
							nouNom = entrada.nextLine();
							llistaCursos.get(posCurs).getLlistaAlumnes().get(posAl).setNom(nouNom);
							System.out.println("Modificación realitzada amb èxit!");
							System.out.println(llistaCursos.get(posCurs).getLlistaAlumnes().get(posAl).toString());
							System.out.println("");
							break;
						case 2: 
							System.out.println("Introdueix el nou document identificatiu:");
							nouDoc = entrada.next();
							llistaCursos.get(posCurs).getLlistaAlumnes().get(posAl).setIdentificacio(nouDoc);
							System.out.println("Modificación realitzada amb èxit!");
							System.out.println(llistaCursos.get(posCurs).getLlistaAlumnes().get(posAl).toString());
							System.out.println("");
							break;
						case 0:
							System.out.println("Sortint");
							System.out.println("");
							break;
						default:
							System.out.println("L´opció introduïda no és vàlida");
							System.out.println("");
					
					}
				
				}while(opcio != 0);
				
			}else {
				System.out.println("Alumne no trovat!");
				System.out.println("");
			}
				
		}else {
			System.out.println("Curs no trovat");
			System.out.println("");
		}
		
	}

	public static void eliminarAlumne() {
		
		String nom;
		boolean endF = false;
		boolean endF2 = false;
		int posCurs = -1;
		int posAl = -1;
		String nomAl;
		String res;
		int i = 0;
		int j = 0;
		
		entrada.nextLine();
		System.out.println("Introdueix el curs on está inscrit l´alumne: ");
		nom = entrada.nextLine();
		
		while(i < llistaCursos.size() && !endF) {
			Curs cursTrovat = llistaCursos.get(i);
			
			if(nom.equalsIgnoreCase(cursTrovat.getNom())) {
				posCurs = i;
				endF = true;
			}
		i++;
		}
		if(endF) {
			
		
			System.out.println("Introdueix el nom de l´alumne a acercar: ");
			nomAl = entrada.nextLine();
			while(j < llistaCursos.get(posCurs).getLlistaAlumnes().size() && !endF2) {
				Alumnat alumneTrovat = llistaCursos.get(posCurs).getLlistaAlumnes().get(j);
				
				if(nomAl.equalsIgnoreCase(alumneTrovat.getNom())) {
					posAl = j;
					endF2 = true;
				}
			j++;
			}
			
			if(endF2) {
				System.out.println(llistaCursos.get(posCurs).getLlistaAlumnes().get(posAl).toString());
				System.out.println("Vols realment eliminar aquest Alumne? s/n:");
				res = entrada.next();
				
				if(res.equalsIgnoreCase("s")) {
					llistaCursos.get(posCurs).getLlistaAlumnes().remove(posAl);
					System.out.println("Alumne eliminat amb èxit!");
					System.out.println("");
					
				}else {
					System.out.println("Eliminació avortada!");
					System.out.println("");
				}
			}else {
				System.out.println("Alumne no trovat!");
				System.out.println("");
			}
				
		}else {
			System.out.println("Curs no trovat");
			System.out.println("");
		}
		
	}
	
	public static void inserirNotes() {
		
		String nom;
		boolean endF = false;
		boolean endF2 = false;
		int posCurs = -1;
		int posAl = -1;
		String nomAl;
		int nota;
		int numNota;
		int h = 0;
		int i = 0;
		int j = 0;
		
		
		entrada.nextLine();
		System.out.println("Introdueix el nom del curs de l´alumne: ");
		nom = entrada.nextLine();
		
		while(i < llistaCursos.size() && !endF) {
			Curs cursTrovat = llistaCursos.get(i);
			
			if(nom.equalsIgnoreCase(cursTrovat.getNom())) {
				posCurs = i;
				endF = true;
			}
		i++;
		}
		if(endF) {
			
			
			System.out.println("Introdueix el nom de l´alumne a acercar: ");
			nomAl = entrada.nextLine();
			while(j < llistaCursos.get(posCurs).getLlistaAlumnes().size() && !endF2) {
				Alumnat alumneTrovat = llistaCursos.get(posCurs).getLlistaAlumnes().get(j);
				
				if(nomAl.equalsIgnoreCase(alumneTrovat.getNom())) {
					posAl = j;
					endF2 = true;
				}
			j++;
			}
			
			if(endF2) {
				System.out.println(llistaCursos.get(posCurs).getLlistaAlumnes().get(posAl).toString());
				System.out.println("");
				System.out.println("Quantes notes vols afegir a aquest alumne: ");
				numNota = entrada.nextInt();
				while(h < numNota) {
					System.out.println("Introdueix la nota: ");
					nota = entrada.nextInt();
					llistaCursos.get(posCurs).getLlistaAlumnes().get(posAl).setLlistaNotes(nota);
				h++;
				}
				}else {
					System.out.println("Alumne no trovat!");
					System.out.println("");
				}
			System.out.println(llistaCursos.get(posCurs).getLlistaAlumnes().get(posAl).getLlistaNotes());
		}else {
			System.out.println("Curs no trovat");
			System.out.println("");
		}
	}	

}