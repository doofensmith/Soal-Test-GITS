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
public class soal3 {
    public static void main(String[] args) {
        //scanner
        Scanner sc = new Scanner(System.in);
        
        //input
        System.out.println("Contoh input - 11:00 PM");
        System.out.print("Masukkan waktu format [hh:mm PM/AM] : ");
        String waktu = sc.nextLine();
        
        //proses
        int jam = Integer.valueOf(waktu.substring(0, 2));
        String menit = waktu.substring(3, 5);
        String waktu_konversi;
        if (waktu.substring(6, 8).equals("PM")) {
            if (jam == 12) {
                jam += 0;
            }else {
                jam += 12;
            }
        }else if (waktu.substring(6, 8).equals("AM")) {
            if (jam == 12) {
                jam -= 12;
            }else {
                jam += 0;
            }           
        }
        
        //output
        waktu_konversi = (jam<10?"0"+jam:jam)+":"+menit;
        System.out.println(waktu+" => "+waktu_konversi);
    }
}
