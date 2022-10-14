/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
                                  ||                               *      *
Developer :: Charles RADOLANIRINA ||                               *      *
                                  ||                               *      *
==================================||                         *                  *
TP2                               ||                           *              *
Date :: 30th September 2022       ||                              * * * * * *
                                  ||
***********************************************************************************************************************
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;//une directive je vais utiliser "Scanner" de "java.util" qui est un package/librairie
                         //ce n'est pas comme en C/C++/python ... qui eux incluent directement le package dans le code source

public class Main {
    public static void main(String[] args) {

        Scanner yscanner = new Scanner(System.in);

        System.out.println("Quel exercice ? Saisissez :");
        System.out.println(" [1] Discriminant");
        System.out.println(" [2] Parite d'un nombre");
        System.out.println(" [3] Calcul d'extremum");
        System.out.println(" [4] Egalite entre chaine de caracteres");
        System.out.println(" [5] Factorielle");
        System.out.println(" [6] Compte a rebours");
        System.out.println(" [7] Valeurs de carrés");
        System.out.println(" [8] Table de multiplication");
        System.out.println(" [9] Division d'entier");
        System.out.println("[10] Regle graduee");
        System.out.println("[11] Nombres premiers");
        System.out.println("[12] Manipulation sur tableau");
        System.out.print("\nChoisissez une fonction : ");

        int c = yscanner.nextInt();

        switch(c)
        {
            case 1:
                discriminant();
                break;
            case 2:
                parite();
                break;
            case 3:
                max();
                break;
            case 4:
                egaliteStr();
                break;
            case 5:
                factorielle();
                break;
            case 6:
                countdown();
                break;
            case 7:
                carre();
                break;
            case 8:
                tableMultiplication();
                break;
            case 9:
                division();
                break;
            case 10:
                regle();
                break;
            case 11:
                nombrepremier();
                break;
            case 12:
                initialisationTableau();
                break;
        }
    }

    //définition de la fonction discriminant
    public static void discriminant() {

        Scanner xscanner = new Scanner(System.in);

        /*déclaration et définition des variables*/
        System.out.println("Quelle est la valeur de a ?\n");
        int a = xscanner.nextInt();

        System.out.println("Quelle est la valeur de b ?\n");
        int b = xscanner.nextInt();

        System.out.println("Quelle est la valeur de c ?\n");
        int c = xscanner.nextInt();

        int delta = (int) (Math.pow(b, 2) - 4 * a * c);//

        if (delta < 0) {
            System.out.println("\n6Ce polynôme n'a pas de racine reelle \n");
            String x1 = "(-b - i * Math.sqrt(-delta)) / (2 * a)";
            String x2 = "(-b + i * Math.sqrt(-delta)) / (2 * a)";
            System.out.println("x1 = " + x1  + "x2 = " + x2);

        } else if (delta == 0){

            int x0 = -b / 2 * a;
            System.out.println("Ce polynôme possède qu'une seule solution reelle : " + x0);
        } else if (delta > 0){

            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);

            System.out.println("\nCe polynôme possède 2 solutions reelles " + x1 + " " + x2);
        }
    }

    //Définition de la fonction parite
    public static void parite (){

        Scanner wscanner = new Scanner(System.in);

        /*déclaration et définition des variables*/
        System.out.println("\nVeuillez saisir un entier afin de savoir sa parité : ");
        int nombre = wscanner.nextInt();

        if (nombre % 2 == 0)
            System.out.println("Le nombre est pair.");
        else
            System.out.println("Le nombre est impair.");
    }

    //Définition de la fonction max
    public static void max (){

        Scanner hscanner = new Scanner(System.in);

        /*déclaration et définition des variables*/
        System.out.println("\nVeuillez saisir de saisir deux entiers : ");
        int nb1 = hscanner.nextInt();
        int nb2 = hscanner.nextInt();

        if (nb1 > nb2){
            System.out.println("\nLe nombre le plus grand est : " + nb1 + "\nEt le nombre le plus petit est : " + nb2);
        } else {
            System.out.println("\nLe nombre le plus grand est : " + nb2 + "\nEt le nombre le plus petit est : " + nb1);
        }
    }

    //Définition de la fonction egaliteStr
    public static void egaliteStr(){

        Scanner dscanner = new Scanner(System.in);

        /*Déclaration et définition des variables*/
        System.out.println("\nVeuillez saisir deux chaines de caractères : ");
        String firstChaine = dscanner.nextLine();
        String secondeChaine = dscanner.nextLine();

        boolean verif = firstChaine.equals(secondeChaine);

        if (verif){
            System.out.println("Les chaines de caractères que vous avez rentré sont identiques");
        } else {
            System.out.println("Les chaines de caractères que vous avez rentré sont différentes");
        }

    }

    //Définition de la fonction factorielle
    public static void factorielle() {
        Scanner qscanner = new Scanner(System.in);

        System.out.println("\nVeuillez saisir un entier positif ou nul : ");
        int n = qscanner.nextInt();

        int factorielle = 1;

        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
        //lorsque je mets n=1 j'obtiens 0 avec le code du TP dans l'ordre, pour que ça marche, il faut mettre "i = 1"
    }

    //définition de la fonction countdown
    public static void countdown(){
        int i=11;

        do {
            i--;
            System.out.println("\n" + i);
        }while (i > 0);
        System.out.println("\nBOOM !!");
    }

    //définition de la fonction carre
    public static void carre(){
        Scanner ascanner = new Scanner(System.in);

        System.out.println("\nVeuillez saisir un entier positif ou nul : ");
        int nombre = ascanner.nextInt();
        int nombrecarre = nombre * nombre;

        System.out.println("  " + nombre + "  " + nombrecarre);

    }

    //définition de la fonction tableMultiplication
    public static void tableMultiplication(){
        Scanner fscanner = new Scanner(System.in);
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++)
            {
                System.out.print(i*j + " ");
            }
            System.out.print("\n");
        }
    }

    //définition de la fonction division
    public static void division()
    {
        Scanner sscanner = new Scanner(System.in);
        System.out.print("Saisir un entier positif ou nul : ");
        int y,x = sscanner.nextInt();
        do
        {
            System.out.print("Veuillez saisir un deuxieme entier positif : ");
            y = sscanner.nextInt();
        } while (y <= 0);

        System.out.println("Resultat de " + x + "/" + y + " = " + (float) x / y);
    }

    //définition de la fonction regle
    public static void regle(){
        Scanner gscanner = new Scanner(System.in);
        int p;

        do
        {
            System.out.print("Veuillez saisir la longueur de la regle (Attention la longueur doit être supérieur à 0 : ");
            p = gscanner.nextInt();
        } while (p <= 0);

        System.out.print("|");
        for(int i=1;i<=p;i++)
        {
            if(i%10 == 0)
                System.out.print("|");
            else
                System.out.print("-");

        }
        System.out.print("\n");
    }

    //définition de la fonction nombrepremier
    public static void nombrepremier(){
        Scanner mscanner = new Scanner(System.in);

        int u;
        do
        {
            System.out.print("Veuillez saisir un entier strictement positif : ");
            u = mscanner.nextInt();
        } while (u <= 0);

        int o = 0;
        for(int i=1;i<=u;i++)
        {
            if (u%i == 0)
            {
                o++;
            }
        }

        if (o==2)
            System.out.println(u + " est un nombre premier");
        else
            System.out.println(u + " n'est pas un nombre premier");
    }

    //definition de la fonction initialisationTableau
    public static void initialisationTableau()
    {
        int[] tableau = new int[10];
        Scanner rscanner = new Scanner(System.in);
        int i;

        for (i = 0; i < tableau.length; i++)
        {
            System.out.print("Saisir un entier : ");
            tableau[i] = rscanner.nextInt();
        }

        int s=0;
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int min=tableau[0],max=tableau[0];

        System.out.print("[ ");
        for(i=0; i<tableau.length; i++)
        {
            System.out.print(tableau[i] + " ");
            s+=tableau[i];

            if(tableau[i] > max)
                max = tableau[i];

            if(tableau[i] < min)
                min = tableau[i];

            if(tableau[i]%2 == 0)
                list.add(tableau[i]);

            if(i%2==0)
                list2.add(tableau[i]);
        }
        System.out.println("]");

        System.out.println("Max : " + max + "\nMin : " + min);
        System.out.println("Somme des elements : " + s);

        System.out.print("Nombre pair dans le tableau : [ ");
        for(i=0;i<list.size();i++)
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("]");

        System.out.print("Nombre d'indice pair dans le tableau : [ ");
        for(i=0;i<list2.size();i++)
        {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println("]");

        inverseTableau(tableau);
    }

    //definition de la fonction
    public static void inverseTableau(int[] tableau)
    {
        int t = tableau.length-1;
        int[] newtable = new int[tableau.length];
        for(int i=0;i<tableau.length;i++)
        {
            newtable[t]=tableau[i];
            t--;
        }

        System.out.print("Tableau inversé [ ");
        for(int i=0;i<newtable.length;i++)
        {
            System.out.print(newtable[i] + " ");
        }
        System.out.println("]");
    }
}