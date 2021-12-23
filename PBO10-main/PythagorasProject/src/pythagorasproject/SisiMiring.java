/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

import java.util.Scanner;
public class SisiMiring {
    public void HitungMiring(){
        double a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("MENENTUKAN SISI MIRING");
        System.out.println("----------------------");
        System.out.println("Masukkan Nilai a (sisi Tegak) : ");
        a = input.nextDouble();
        System.out.println("Masukkan Nilai b (sisi siku-siku): ");
        b = input.nextDouble();
        c = ((b*b) + (a*a));
        System.out.println("Panjang sisi miring segitiga tersebut adalah: " +(Math.sqrt(c)));
        
        
    }
}
