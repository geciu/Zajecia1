package zajecia1;

import java.util.Scanner;

public class Kalkulator {

    int dodawanie = 1;
    int odejmowanie = 2;
    int mnożenie = 3;
    int dzielenie = 4;

    int number;

    double pierwszaLiczba;
    double drugaLiczba;

    public Kalkulator(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Witaj w kalkulatorze! Podaj pierwsza liczbe: ");
        double pierwszaLiczba = scan.nextDouble();

        System.out.println("Podaj druga liczbe: ");
        double drugaLiczba = scan.nextDouble();

        System.out.print("Podaj operator (+, -, *, /): ");
        char operator = scan.next().charAt(0);

        switch (operator) {
            case '+': {
                System.out.println(pierwszaLiczba + drugaLiczba);
                break;
            }
            case '-': {
                System.out.println(pierwszaLiczba - drugaLiczba);
                break;
            }
            case '*': {
                System.out.println(pierwszaLiczba * drugaLiczba);
                break;
            }
            case '/': {
                System.out.println(pierwszaLiczba / drugaLiczba);
                break;
            }
            default: System.out.println("Złe parametry");
        }
    }
}
