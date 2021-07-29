/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Ostarion
 */
public class soal5 {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        
        //input
        System.out.print("Masukkan kalimat 1 : ");
        String kalimat1 = sc.nextLine();

        System.out.print("Masukkan kalimat 2 : ");
        String kalimat2 = sc.nextLine();

        //proses
        System.out.println(kalimat1+" dibalik "+kalimat2+" => "+palindrom(kalimat1, kalimat2));
        System.out.println("");
        
        
       
    }
    
    static String reverse(String kalimat) {
        String reversed = "";
        for (int i = kalimat.length()-1; i >= 0; i--) {
            reversed += kalimat.charAt(i);
        }   
        return reversed;
    }
    
    static boolean palindrom(String kalimat1, String kalimat2) {
        boolean palindrom = false;
        
        if (kalimat1.equals(reverse(kalimat2))&&kalimat1.equalsIgnoreCase(reverse(kalimat1))) {
            palindrom = true;
        }
        
        return palindrom;
    }
    
}
