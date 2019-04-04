package zajecia1;

import java.util.Scanner;

public class Podatek {

    Podatek(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj swoj dochod w minionym roku, aby obliczyc podatek: ");
        double dochod = scan.nextDouble();

        if(dochod < 85528){
            double podatek = 0.18 * dochod - 556.02;
            System.out.println("Masz do zapłacenia: " + podatek + " podatku");
        }
        else if(dochod >= 85528) {
            double podatek = 14839.02 + 0.32*(dochod-85528);
            System.out.println("Masz do zapłacenia: " + podatek + " podatku");
        }
    }
}
