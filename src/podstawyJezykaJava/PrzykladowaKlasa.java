package podstawyJezykaJava;
import mojPierwszyPakiet.MojaPierwszaKlasaWInteli;

/**
 * Created by adamk on 09.11.2018
 **/
public class PrzykladowaKlasa {  //deklaracja klasy
    private MojaPierwszaKlasaWInteli mojaPierwszaKlasaWInteli;  // pola
    private int x;
    private int y;

    public PrzykladowaKlasa(){ // konstruktor

    }

    public PrzykladowaKlasa (int x, int y){ //konstruktory klasy
        this.x = x;
        this.y = y;
    }

    private int dodajDwieLiczby(int x, int y){  //metoda główna
        Test test = new Test();
        return x + y;
    }

    private class Test {  //metoda główna

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
