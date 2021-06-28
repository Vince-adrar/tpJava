public class morpion
{
        //initialiser les 9 cases de notre grille
        // De type char ' ' 'X' 'O'
        static char case1 = '1';
        static char case2 = '2';
        static char case3 = '3';
        static char case4 = '4';
        static char case5 = '5';
        static char case6 = '6';
        static char case7 = '7';
        static char case8 = '8';
        static char case9 = '9';
    public static void main (String[] arguments)
    {

        // Dire bonjour
        System.out.println("Bienvenue dans le jeu du morpion !");
        afficherGrille();
        //afficher la grille --> fonction
        

        //joueur1 joue --> fonction demander entrée utilisateur
        //remplir la grille avec un X
        //afficher grille
        //joueur2 joue fonction demander entrée utilisateur
        //remplir la grille avec un O
        //afficher grille
    }
    public static void afficherGrille()
    {
        System.out.println(" " + case7 + " | " + case8  + " | " + case9);
        System.out.println(" " + case4 + " | " + case5  + " | " + case6);
        System.out.println(" " + case1 + " | " + case2  + " | " + case3);
    }
}