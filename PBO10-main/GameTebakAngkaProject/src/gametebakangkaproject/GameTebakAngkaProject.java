/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

/**
 *
 * @author hp
 */
import java.util.Scanner;
public class GameTebakAngkaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a = (int) (Math.random() *100);
       int b = 2;
        System.out.println("====================");
        System.out.println(" GAME TEBAK ANGKA ");
        System.out.println("====================");
        System.out.println("-------------------------------");
        System.out.println("Hai.. , saya telah memilih sebuah "
                    + "bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya ");
        System.out.println("--------------------------------");
        do{
            Scanner jawab = new Scanner (System.in);
            System.out.println("Masukkan angka anda : ");
            int c = jawab.nextInt();
            
        if(b>0){
            if (c==a){
                System.out.println("SELAMAT !!! Kamu Benar");
                break;}
            else if (c<a){
                System.out.println("Maaf, Angkamu terlalu kecil");
            } else if (c>a){
                System.out.println("Wahh, Terlalu besar angkamu");
            }
            System.out.println("");
            System.out.println("Kamu memiliki " + b + " Kesempatan lagi");
            System.out.println(" ---------------------------------------");
            b--;}
        else{
            System.out.println("------------------------------------------");
            System.out.println("MAAF NIH KA, TEBAKANMU SALAH, SILAKAN COBA LAGI !!");
            System.out.println("ANGKA ITU YAKNI " + a);
            System.out.println("---------------------------------------------");
            break;
        }
    }
   while (b>=0);
    }
}