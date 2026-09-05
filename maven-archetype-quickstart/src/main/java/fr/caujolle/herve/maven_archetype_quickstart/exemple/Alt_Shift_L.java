package fr.caujolle.herve.maven_archetype_quickstart.exemple;

public class Alt_Shift_L {
    public static void main(String[] args) {
       imprimerFacture(55, 42);
       
       
    }
    
    
    public static void imprimerFacture(double prixHT, int quantite) {
        // Le calcul est noyé dans la logique d'affichage
        double prixFinal = calculerPrixTTC(prixHT, quantite);
        System.out.println("Total à payer : " + prixFinal);
    }


    private static double calculerPrixTTC(double prixHT, int quantite) {
        double totalHT = prixHT * quantite;
        double prixFinal = totalHT * 1.20 - 5.0;
        return prixFinal;
    }

}
