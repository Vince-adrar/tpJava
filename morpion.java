import java.util.Scanner;

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
        jouer();
        afficherGrille();
        jouer2();
        afficherGrille();
        jouer();
        afficherGrille();
        jouer2();
        afficherGrille();
        jouer();
        afficherGrille();
        winCheck();
        jouer2();
        afficherGrille();
        winCheck();
        jouer();
        afficherGrille();
        winCheck();
        jouer2();
        afficherGrille();
        winCheck();
        jouer();
        afficherGrille();
        winCheck();
        
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

    public static void jouer()
    {
        Scanner scanner = new Scanner(System.in);
        int t1 = scanner.nextInt();

        if(t1==1)
        {
            if(case1 !='O' && case1 !='X')
            {
                case1 = 'X';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer();
            }
        }
        if(t1==2)
        {
            if(case2 !='O' && case2 !='X')
            {
                case2 = 'X';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer();
            }
        }
        if(t1==3)
        {
            if(case3 !='O' && case3 !='X')
            {
                case3 = 'X';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer();
            }
        }
        if(t1==4)
        {
            if(case4 !='O' && case4 !='X')
            {
                case4 = 'X';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer();
            }
        }
        if(t1==5)
        {
            if(case5 !='O' && case5 !='X')
            {
                case5 = 'X';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer();
            }
        }
        if(t1==6)
        {
            if(case6 !='O' && case6 !='X')
            {
                case6 = 'X';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer();
            }
        }
        if(t1==7)
        {
            if(case7 !='O' && case7 !='X')
            {
                case7 = 'X';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer();
            }
        }
        if(t1==8)
        {
            if(case8 !='O' && case8 !='X')
            {
                case8 = 'X';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer();
            }
        }
        if(t1==9)
        {
            if(case9 !='O' && case9 !='X')
            {
                case9 = 'X';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer();
            }
        }
                
    }

    public static void jouer2()
    {
        Scanner scanner = new Scanner(System.in);
        int t2 = scanner.nextInt();

        if(t2==1)
        {
            if(case1 !='O' && case1 !='X')
            {
                case1 = 'O';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer2();
            }
        }
        if(t2==2)
        {
            if(case2 !='O' && case2 !='X')
            {
                case2 = 'O';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer2();
            }
        }
        if(t2==3)
        {
            if(case3 !='O' && case3 !='X')
            {
                case3 = 'O';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer2();
            }
        }
        if(t2==4)
        {
            if(case4 !='O' && case4 !='X')
            {
                case4 = 'O';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer2();
            }
        }
        if(t2==5)
        {
            if(case5 !='O' && case5 !='X')
            {
                case5 = 'O';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer2();
            }
        }
        if(t2==6)
        {
            if(case6 !='O' && case6 !='X')
            {
                case6 = 'O';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer2();
            }
        }
        if(t2==7)
        {
            if(case7 !='O' && case7 !='X')
            {
                case7 = 'O';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer2();
            }
        }
        if(t2==8)
        {
            if(case8 !='O' && case8 !='X')
            {
                case8 = 'O';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer2();
            }
        }
        if(t2==9)
        {
            if(case9 !='O' && case9 !='X')
            {
                case9 = 'O';
            }
            else 
            {
                System.out.println("Tricheur !");
                jouer2();
            }
        }        
    }

    public static void winCheck()
    {
        if(case1=='O' && case2=='O' && case3=='O')
        {
            System.out.println("Félicitation, le joueur 2 gagne !");
            System.exit(-1);
        }
        else if(case4=='O' && case5=='O' && case6=='O')
        {
            System.out.println("Félicitation, le joueur 2 gagne !");
            System.exit(-1);
        }
        else if(case7=='O' && case8=='O' && case9=='O')
        {
            System.out.println("Félicitation, le joueur 2 gagne !");
            System.exit(-1);
        }
        else if(case7=='O' && case4=='O' && case1=='O')
        {
            System.out.println("Félicitation, le joueur 2 gagne !");
            System.exit(-1);
        }
        else if(case8=='O' && case5=='O' && case2=='O')
        {
            System.out.println("Félicitation, le joueur 2 gagne !");
            System.exit(-1);
        }
        else if(case9=='O' && case6=='O' && case3=='O')
        {
            System.out.println("Félicitation, le joueur 2 gagne !");
            System.exit(-1);
        }
        else if(case7=='O' && case5=='O' && case3=='O')
        {
            System.out.println("Félicitation, le joueur 2 gagne !");
            System.exit(-1);
        }
        else if(case9=='O' && case5=='O' && case1=='O')
        {
            System.out.println("Félicitation, le joueur 2 gagne !");
            System.exit(-1);
        }
        else if(case1=='X' && case2=='X' && case3=='X')
        {
            System.out.println("Félicitation, le joueur 1 gagne !");
            System.exit(-1);
        }
        else if(case4=='X' && case5=='X' && case6=='X')
        {
            System.out.println("Félicitation, le joueur 1 gagne !");
            System.exit(-1);
        }
        else if(case7=='X' && case8=='X' && case9=='X')
        {
            System.out.println("Félicitation, le joueur 1 gagne !");
            System.exit(-1);
        }
        else if(case7=='X' && case4=='X' && case1=='X')
        {
            System.out.println("Félicitation, le joueur 1 gagne !");
            System.exit(-1);
        }
        else if(case8=='X' && case5=='X' && case2=='X')
        {
            System.out.println("Félicitation, le joueur 1 gagne !");
            System.exit(-1);
        }
        else if(case9=='X' && case6=='X' && case3=='X')
        {
            System.out.println("Félicitation, le joueur 1 gagne !");
            System.exit(-1);
        }
        else if(case7=='X' && case5=='X' && case3=='X')
        {
            System.out.println("Félicitation, le joueur 1 gagne !");
            System.exit(-1);
        }
        else if(case9=='X' && case5=='X' && case1=='X')
        {
            System.out.println("Félicitation, le joueur 1 gagne !");
            System.exit(-1);
        }
    }
    

}