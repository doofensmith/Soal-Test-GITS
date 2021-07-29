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
public class soal4 {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        
        //input
        System.out.print("Masukkan kalimat : ");
        String kalimat = sc.nextLine();
        
        //proses
        String reversed = "";
        for (int i = kalimat.length()-1; i >= 0; i--) {
            reversed += kalimat.charAt(i);
        }       
        
        //output
        System.out.println(reversed);
    }
}
