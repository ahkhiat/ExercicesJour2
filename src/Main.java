import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        exo5();
    }

    public static void exo1() {
        System.out.println("Entrer un nobmre entier");
        int entier1 = scan.nextInt();

        System.out.println("Entrer un 2e nombre entier");
        int entier2 = scan.nextInt();

        System.out.println(addition(entier1, entier2));
        scan.close();
    }
    public static int addition(int a, int b){
        return a + b;
    }

    public static void exo2(){
        System.out.println("Comment vous appelez-vous ?");
        String nomUser = scan.nextLine();

        System.out.println("Quel age avez-vous ?");
        int ageUser = scan.nextInt();
        scan.close();

        mineurOuMajeur(ageUser);
        if (mineurOuMajeur(ageUser)) {
            System.out.println("Bonjour " + nomUser +", vous êtes majeur");
        } else {
            System.out.println("Bonjour " + nomUser +",  vous êtes mineur");
        }
    }
    public static boolean mineurOuMajeur(int age){
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void exo3() {
        System.out.println("Entrer un nombre pour voir sa table de multiplication");
        int chiffreUser = scan.nextInt();
        scan.close();

        int[] resultats = new int[10];
        // remplir le tableau
        for (int i=1; i<=10; i++){
            resultats[i-1] = multiplication(chiffreUser, i);
        }

        // afficher le tableau
        String resultat = "";
        for (int j=0; j < resultats.length; j++){
            resultat += chiffreUser + " x " + (j+1) + " = " + resultats[j] + "\n";
        }
        System.out.println(resultat);
    }
    public static int multiplication(int x, int y){
        return x*y;
    }

    public static void exo4() {
        System.out.println("Entrer un nombre entier");
        int nombre1 = scan.nextInt();

        System.out.println("Entrer un 2e nombre entier");
        int nombre2 = scan.nextInt();

        System.out.println("Entrer un 3e nombre entier");
        int nombre3 = scan.nextInt();
        scan.close();

        int[] tableau = {nombre1, nombre2, nombre3};
        System.out.println("Le tableau obtenu :" + tableau[0] + ", " + tableau[1] + ", " + tableau[2]);
        System.out.println("La valeur moyenne est :" + moyenne(nombre1, nombre2, nombre3));
        System.out.println("La plus grand valeur est :" + plusGrand(nombre1, nombre2, nombre3));

    }
    public static double moyenne(double a, double b, double c){
        return (a+b+c)/3;
    }
    public static int plusGrand(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void exo5(){

        boolean running = true;

        while(running) {
            System.out.println("Entrer un nobmre entier");
            int entier1 = scan.nextInt();

            System.out.println("Entrer un 2e nombre entier");
            int entier2 = scan.nextInt();

            System.out.println(addition(entier1, entier2));

            scan.nextLine();

            System.out.println("Voulez-vous recommencer ? (o/n)");
            String choice = scan.nextLine();

            if (choice.equals("n")) {
                scan.close();
                System.out.println("Au revoir");
                running = false;
            }

        }

    }

}