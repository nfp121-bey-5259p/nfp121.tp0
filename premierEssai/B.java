
/**
 * Décrivez votre classe B ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class B
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int y;

    /**
     * Constructeur d'objets de classe B
     */
    public B()
    {
        // initialisation des variables d'instance
        y = 0;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public int MyMethod(int x)
    {
        // Insérez votre code ici
        return x + y;
    }
    
    public static void main (String args[]){
        B myB = new B();
        System.out.println("Hello World");
        System.out.println(myB.MyMethod(5));

    }
}
