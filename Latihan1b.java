import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Created by 21343035_Rayhan_Ahadi_Nifri
 */

/**
 *
 * @author rehan909090
 */

public class Latihan1b {
    public static void main(String[] args) {
        String a = "";
        String b = "";
        String c = "";
        a = JOptionPane.showInputDialog("Masukkan nilai pertama Anda");
        int pertama = Integer.valueOf(a).intValue();
        b = JOptionPane.showInputDialog("Masukkan nilai kedua Anda");
        int kedua = Integer.valueOf(b).intValue();
        c = JOptionPane.showInputDialog("Masukkan nilai ketiga Anda");
        int ketiga = Integer.valueOf(c).intValue();
        int rata_rata = (pertama + kedua + ketiga) / 3;

        String hasil = "";
        hasil += "Nilai pertama: " + pertama + "\n";
        hasil += "Nilai kedua: " + kedua + "\n";
        hasil += "Nilai ketiga: " + ketiga + "\n";
        hasil += "Rata-rata nilai Anda adalah " + rata_rata + "\n";
        if (rata_rata <= 60) {
            hasil += ":-(" + "\n";
        } else {
            hasil += ":-)" + "\n";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
