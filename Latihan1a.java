import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Created by 21343035_Rayhan_Ahadi_Nifri
 */

/**
 *
 * @author rehan909090
 */

public class Latihan1a {
    public static void main(String[] args) {
        BufferedReader nilai = new BufferedReader(new InputStreamReader(System.in));
        String a = "";
        String b = "";
        String c = "";
        try {
            System.out.print("Masukkan nilai pertama Anda: ");
            a = nilai.readLine();
            System.out.print("Masukkan nilai kedua Anda: ");
            b = nilai.readLine();
            System.out.print("Masukkan nilai ketiga Anda: ");
            c = nilai.readLine();
        } catch (IOException e) {
            System.out.println("Kata yang Anda masukkan salah, silahkan coba lagi.");
        }
        int pertama;
        int kedua;
        int ketiga;
        pertama = Integer.parseInt(a);
        kedua = Integer.parseInt(b);
        ketiga = Integer.parseInt(c);
        int rata_rata = (pertama + kedua + ketiga) / 3;
        System.out.println("Rata-rata nilai Anda: " + rata_rata);
        if (rata_rata <= 60) {
            System.out.println(":-(");
        } else {
            System.out.println(":-)");
        }
    }

}
