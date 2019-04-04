package zajecia1;

import java.util.Scanner;

public class AGD {

    double cena;
    int rata;
    double procent;
    double nowaCena;
    double stawka;

    AGD(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj cene towaru: ");
        cena = scan.nextDouble();
        while (cena < 100 || cena > 10000){
            if(cena < 100){
            System.out.println("Cena jest za niska. Nie udzielamy rat na tak niskie kwoty. Podaj nowa: ");
            cena = scan.nextDouble();
            }
            else if(cena > 10000){
                System.out.println("Cena jest za wysoka. Nie udzielamy rat na tak wysokie kwoty. Podaj nowa: ");
                cena = scan.nextDouble();
            }
        }

        System.out.println("Podaj liczbe rat z zakresu <6, 48> : ");
        rata = scan.nextInt();
        while (rata < 6 || rata > 48){
            if(rata < 6){
                System.out.println("Liczba rat jest za mała. Podaj liczbe z zakresu <6, 48> : ");
                rata = scan.nextInt();
            }
            else if(rata > 48){
                System.out.println("Liczba rat jest za duża. Podaj liczbe z zakresu <6, 48> : ");
                rata = scan.nextInt();
            }
        }

        if (rata >=6 && rata <= 12)
            procent = 0.025;
        else if (rata > 12 && rata <= 24)
            procent = 0.05;
        else if (rata > 24 && rata <= 48)
            procent = 0.1;

        nowaCena = procent*cena + cena;
        stawka = nowaCena/rata;
        System.out.println("Miesieczna rata dla produktu o cenie " + cena + " i liczbie rat wynoszacej " + rata + " wynosi " + stawka);
        System.out.println("Oprocentowanie przy takiej ilosci rat wynosi " + procent + ". W sumie koszt wyniesie " + nowaCena);
    }
}
