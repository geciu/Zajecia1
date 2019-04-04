package zajecia1;

import java.util.Scanner;

public class Liczby {

    Liczby(){
        System.out.println("Podaj 3 liczby całkowite: ");
        Scanner scan = new Scanner(System.in);

        System.out.println("Pierwsza: ");
        int pierwsza = scan.nextInt();

        System.out.println("Druga: ");
        int druga = scan.nextInt();

        System.out.println("Trzecia: ");
        int trzecia = scan.nextInt();

        int wieksza=Math.max(pierwsza, druga);
        System.out.println("Największa liczba spośród " + pierwsza + ", " + druga + ", " + trzecia + " to " + Math.max(wieksza, trzecia));
    }
}
