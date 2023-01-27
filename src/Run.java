import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Awal game = new Awal();
        game.datdiri();
        game.charselect();
        game.weapselect();

        String karakter = game.getCharselect();
        int senjata = game.getWeap();

        System.out.println("Karakter yang dipilih: " + karakter);
        System.out.println("Senjata yang dipilih: " + senjata);
    }
}

