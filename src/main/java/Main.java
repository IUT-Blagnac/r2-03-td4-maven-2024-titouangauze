/**
 * @param arg IN
 */
public class Main {
    public static void main(String[] args) {
        Pile pile = new Pile(5);

        System.out.println("La pile est vide ? " + pile.estVide());

        pile.empiler(10).empiler(20).empiler(30).empiler(40).empiler(50);

        System.out.println("La pile est pleine ? " + pile.estPlein());

        System.out.println("Sommet de la pile : " + pile.sommet());

        int elementDepile = pile.depiler();
        System.out.println("Elément dépilé : " + elementDepile);

        System.out.println("Nouveau sommet de la pile : " + pile.sommet());

        pile.vider();
        System.out.println("La pile est vide ? " + pile.estVide());
    }
}
