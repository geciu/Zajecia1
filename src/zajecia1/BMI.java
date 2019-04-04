package zajecia1;

import java.lang.*;
import java.util.Scanner;


public class BMI {

    double wspBMI;

    BMI(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj swoja wage: ");
        double waga = scan.nextDouble();

        System.out.println("Podaj swoj wzrost: ");
        double wzrost = scan.nextDouble();

        this.wspBMI = (waga/(wzrost*wzrost))*10000;

        if(wspBMI >= 18.5 && wspBMI <= 24.9)
            System.out.println("Twój współczynnik BMI wynosi: " + wspBMI + ". Jest to waga prawidłowa");
        else if(wspBMI < 18.5)
            System.out.println("Twój współczynnik BMI wynosi: " + wspBMI + ". Jest to niedowaga");
        else if(wspBMI > 24.9)
            System.out.println("Twój współczynnik BMI wynosi: " + wspBMI + ". Jest to nadwaga");
    }
}
