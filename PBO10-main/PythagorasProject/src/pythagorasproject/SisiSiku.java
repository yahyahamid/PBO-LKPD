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
public class SisiSiku {
    public void HitungSiku(){
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("MENENTUKAN SISI SIKU-SIKU");
        System.out.println("---------------------------");
        System.out.println("Skuylah");
        System.out.println("");
        System.out.println("Masukkan nilai a (sisi tegak): ");
        a = input.nextInt();
        System.out.println("Masukkan Nilai c (sisi Miring): ");
        c = input.nextInt();
        b = ((c*c)-(a*a));
        System.out.println("Panjang Sisi siku-siku adalah : " +Math.sqrt(b));
    }
}
