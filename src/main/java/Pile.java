public class Pile {
    private int[] elements; // Tableau pour stocker les éléments de la pile
    private int tailleMax; // Taille maximale de la pile
    private int sommet; // Indice du sommet de la pile

    /**
     * Constructeur avec paramètre de la pile
     * @param max La taille maximale de la pile
     */
    public Pile(int max) {
        tailleMax = max;
        elements = new int[tailleMax];
        sommet = -1;
    }

    /**
     * Vérifie si la pile est vide
     * @return Vrai si le sommet est -1 (pile vide), sinon faux
     */
    public boolean estVide() {
        return sommet == -1;
    }

    /**
     * Vérifie si la pile est pleine
     * @return Vrai si le sommet est égal à tailleMax - 1 (pile pleine), sinon faux
     */
    public boolean estPlein() {
        return sommet == tailleMax - 1;
    }

    /**
     * Permet d'empiler un élément sur la pile
     * @param element L'élément à empiler
     * @return Référence à la pile après l'empilement
     */
    public Pile empiler(int element) {
        if (estPlein()) {
            throw new IllegalStateException("La pile est pleine"); 
        }
        sommet++;
        elements[sommet] = element; 
        return this; 
    }

    /**
     * Permet de dépiler un élément de la pile
     * @return L'élément dépilé
     */
    public int depiler() {
        if (estVide()) {
            throw new IllegalStateException("La pile est vide");
        }
        int elementDepile = elements[sommet];
        sommet--;
        return elementDepile;
    }

    /**
     * Renvoie l'élément se trouvant au sommet de la pile sans le dépiler
     * @return L'élément au sommet de la pile
     */
    public int sommet() {
        if (estVide()) {
            throw new IllegalStateException("La pile est vide"); 
        }
        return elements[sommet]; 
    }

    /**
     * Vide la pile en réinitialisant l'indice du sommet
     */
    public void vider() {
        sommet = -1; 
    }
}
