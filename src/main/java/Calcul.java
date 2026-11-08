public class Calcul {

    public int somme(int a, int b) {
        return a + b;
    }

    public int moyenne(int somme, int nombre) {
        return somme / nombre;
    }

    public int longueur(String texte) {
        return texte.length();
    }

    
       public double ratio(int total, int partie) {
           return partie / total;
       }

       public boolean estVide(String mot) {
           return mot.isEmpty();
       }
}
