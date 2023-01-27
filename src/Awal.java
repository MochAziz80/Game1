import java.util.Scanner;

public class Awal {


    private String charselect;
    private int weap;
    // ...

    public String getCharselect() {
        return charselect;
    }

    public int getWeap() {
        return weap;
    }



    public static String Nama;

    public static void datdiri(){
        Scanner nama = new Scanner(System.in);

        System.out.println("Masukkan Nama Anda");
        Nama = nama.nextLine();

        System.out.println("Selamat Datang "+Awal.Nama+" Di Dalam Sebuah Game Yang Tidak Jelas");

    }

    public String [] karakter = {"AGUS BOMBARDER", "SUPRI ATTACKER", "SITI ARCHER"};



    public void charselect() {
        Scanner cs = new Scanner(System.in);
        System.out.println("Pilih Karakter Anda");

        for (int i = 0; i < karakter.length; i++) {
            System.out.println((i+1)+"."+karakter[i]);
            
        }
        int pilih = cs.nextInt();
        charselect = karakter[pilih-1];

        System.out.println("Anda Memilih "+ charselect);


    }

public String namaSenjata;
    public void weapselect() {

        System.out.println("Marilah Kita Memilih Senjata Yang Cocok");
        String[] Senjata = {"Durandal", "Excalibur", "Mjlornir"};
        int[] atk = {10, 25, 15};

        System.out.println("Pilih senjata anda");


        Scanner psenjata = new Scanner(System.in);
        for (int i = 0; i < Senjata.length; i++) {
            System.out.println(i + 1 + ". " + Senjata[i] + " \t\tDammage " + atk[i]);
        }

        this.weap = psenjata.nextInt();
        namaSenjata = Senjata[weap-1];

        System.out.println("Anda Memilih " + Senjata[weap - 1] + " Dengan Dammage " + atk[weap - 1]);

    }

    public void gabungandata() {


        System.out.println("=======================================");
        System.out.println("Karakter Yang Anda Pilih Adalah "+ charselect);
        System.out.println("Dengan Menggunakan Senjata " + namaSenjata);
    }




}