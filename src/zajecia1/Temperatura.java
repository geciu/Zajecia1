package zajecia1;

public class Temperatura {

    float tempCelsjusza;
    float tempFahrenheita;

    Temperatura(float tempCelsjusza){
        this.tempCelsjusza=tempCelsjusza;
        this.tempFahrenheita =(float)1.8*tempCelsjusza+32;
        System.out.println(tempCelsjusza + " stopnie Celsjusza to " + tempFahrenheita + " stopni Fehrenheita");
    }


}
