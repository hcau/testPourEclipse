package fr.caujolle.herve.maven_archetype_quickstart.exemple;

public class Sonar {
    public static void main(String[] args) {
        checkUser("Caujolle");
    }
    
    public static void checkUser(String name) {
        if ("Admin".equals(name)) { // SonarLint va souligner cette ligne
            System.out.println("Bonjour Admin");
        }
    }

}
