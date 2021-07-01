public class Lot2
{
    public static void main (String[] arguments)
    {
        estMajeur(1);
        signe(10);
        plusGrand2(25, 25);
        plusPetit2(15, 52);
        plusPetit3(153,486,23);
        plusGrand3(638,3,81);
    }

    public static boolean estMajeur(int age)
    {

        if (age>=18)
        {
            System.out.println("Majeur !");
            return true;
        }
        else
        {
            System.out.println("Mineur !");
            return false;
        }
    }

    public static void signe(float real)
    {
        if(real <0)
        {
            System.out.println("Négatif !");
        }
        else if(real>0)
        {
            System.out.println("Positif !");
        } else if (real == 0)
        {
            System.out.println("Nul ! 0 !");
        }
    }

    public static int plusGrand2(int g1, int g2)
    {
        if(g1<g2)
        {
            return g2;
        }
        if(g2<g1)
        {
            return g1;
        }
        else
        {
            return g1;
        }
    }
    public static int plusPetit2(int p1, int p2)
    {
        if(p1<p2)
        {
            return p1;
        }
        if(p2<p1)
        {
            return p2;
        }
        else
        {
            return p2;
        }
    }

    public static int plusPetit3(int p3, int p4, int p5)
    {
        if(p3<p4 && p3<p5)
        {
            return p3;
        }
        if(p4<p3 && p4<p5)
        {
            return p4;
        }
        else
        {
            return p5;
        }
    }

    public static int plusGrand3(int g3, int g4, int g5)
    {
        if(g3>g4 && g3>g5)
        {
            return g3;
        }
        if(g4>g3 && g4>g5)
        {
            return g4;
        }
        else
        {
            return g5;
        }
    }
}
