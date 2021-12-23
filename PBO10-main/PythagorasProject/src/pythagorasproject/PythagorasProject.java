/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author hp
 */
import java.util.Scanner;
import java.math.MathContext;

public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ulang = "y";
        while (ulang.equals("y")){
            System.out.println("");
            Scanner input = new Scanner(System.in);
            String ul="",lagi;
            System.out.println("---- SELAMAT DATANG-----");
            System.out.println("");
            System.out.println(" Menu Utama ");
            System.out.println("1. Cek Triple Pythagoras");
            System.out.println("2. Menentukan Sisi Miring Segitiga");
            System.out.println("3. Menentukan Sisi Tegak Segitiga");
            System.out.println("4. Keluar");
            System.out.println("==============================");
            System.out.println("Pilih Menu dulu ya [1/2/3/4] =  "); int pilih = input.nextInt();
            System.out.println("==============================");
            switch (pilih){
                case 1:{
                    Swicth_Menu sm = new Swicth_Menu();
                    sm.MenuTriple();
                    break;
                }
                
                case 2:{
                    SisiMiring sn = new SisiMiring();
                    sn.HitungMiring();
                    break;
                }
                case 3:{
                    SisiSiku ss = new SisiSiku();
                    ss.HitungSiku();
                    break;
                }
                case 4:{
                    System.exit(4);
                    System.out.println("Terima Kasih Kaka");
                }
                
                break;   
        }
            System.out.println("==========================================");
            System.out.println("Apakah kamu ingin mengulangi lagi(y/n) ?");
            ulang = input.next();
        }
    }
    
}
