package fr.caujolle.herve.maven_archetype_quickstart.exemple;

public class ComprendreFindReference {

    private double price;
    
    
    public void traiterCommande(Commande commande) {
        double prix = commande.getPrix();

        if (prix > 100) {
            appliquerReduction(prix);
        }

        enregistrer(prix);
    }

    private void enregistrer(double prix) {
        this.price = prix;
    }

    private double appliquerReduction(double prix) {
        return prix- (prix*5/100);
    }
    
    
    
    
    
    

}
