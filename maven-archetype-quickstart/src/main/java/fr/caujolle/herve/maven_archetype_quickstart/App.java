package fr.caujolle.herve.maven_archetype_quickstart;

/**
 * Hello world!
 */
/**
 * 
 */
public class App {
    public static void main(String[] args) {
        coucou(2);
        
    }

	
	private static int coucou(int a) {
		totototo(); // ceci est un commentaire
		int calcul = 450 + a;
		for (int i = 0; i < 30; i++) {
            a++;
        }
		
		
		
		
		return a + calcul;
	}

	private static void totototo() {
// ajout d'une ligne
	    System.out.println("changement");
	    //
	    
	    System.out.println("glouglou");
	    System.out.println("Ligne ajoutée");
	    
	}

	private static void toto() {

		// TODO Auto-generated method stub
		int toto = 4;
		System.out.println("toto");

	}

}
