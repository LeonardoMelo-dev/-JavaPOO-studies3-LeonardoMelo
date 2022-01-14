public class MainUEC {
    public static void main(String[] args) {

        Lutadores [] lutadores = new Lutadores[6];


        lutadores[0] = new Lutadores("Marcio Montanha", "RJ", 34, 1.82d, 97.4d, 57, 55, 20);
        lutadores[1] = new Lutadores("Silvio Castanha", "SP", 25, 1.71d, 76.4d, 16, 11, 2);
        lutadores[2] = new Lutadores("Diego Miranha", "BH", 43, 1.97d, 118.4d, 140, 126, 57);
        lutadores[3] = new Lutadores("Felipe Noronha", "MG", 22, 1.80d, 104.4d, 3, 10, 0);
        lutadores[4] = new Lutadores("Caio Fronha", "SP", 56, 1.77d, 91.4d, 62, 33, 11);
        lutadores[5] = new Lutadores("Dalton Coronha", "BH", 33, 1.91d, 82.4d, 56, 22, 11);

        System.out.println("---------------- LUTADORES ----------------");
        for (int i=0; i<6; i++)
        {
            lutadores[i].apresentarLutador();
            System.out.println();
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println("---------------- Status do Lutador ----------------");
        lutadores[5].statusLutador();

    }
}
