/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;
import java.util.Scanner;

public class Swicth_Menu {
        public void MenuTriple(){
          int a,b,c;
            Scanner input = new Scanner(System.in);
            System.out.println("----CEK TRIPLE PYHTAGORAS----");
            System.out.println("******************************");
            System.out.println("");
            System.out.println("Masukkan Nilai a (sisi tegak): ");
            a = input.nextInt();
            System.out.println("Masukkan Nilai b (sisi siku-siku): ");
            b = input.nextInt();
            System.out.println("Masukkan Nilai c (sisi Miring): ");
            c = input.nextInt();
            if(a==3 && b==4 && c==5){
            System.out.println("Benar, Itu Nilai Pyhtagoras");
        }  else if(a==5 && b==12 && c==13){
                System.out.println("Benar, Itu Nilai Pyhtagoras");
        }  else if(a==7 && b==24 && c==25){
                System.out.println("Benar, Itu Nilai Pyhtagoras");
        }  else if(a==8 && b==15 && c==17){
                System.out.println("Benar, Itu Nilai Pyhtagoras");
        }  else if(a==9 && b==40 && c==41){
                System.out.println("Benar, Itu Nilai Pyhtagoras");
        }  
            else{
                System.out.println("Maaf Itu bukan Pyhtagoras !");
        }
            
               }
}

