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
public class soal2 {
    
    public static void main(String[] args) {
        //scanner
        Scanner sc = new Scanner(System.in);
        
        //input
        System.out.print("Masukkan email : ");
        String email = sc.next();
        
        //proses
        if (cekStep1(email)&&cekStep2(email)&&cekStep3(email)&&cekStep4(email)) {
            System.out.println("Email ini disetujui.");
        }else {
            System.out.println("Ada salah format");
        }
    }
    
    static boolean cekStep1(String email) {
        boolean isEmail = false;
        
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                isEmail = true;
            }
        }
        
        return isEmail;
    }
    
    static boolean cekStep2(String email) {
        boolean isEmail = false;
        
        int n = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                n = i;               
            }
        }
        
        if (n<=20) {
            isEmail = true;
        }
        
        return isEmail;
    }
    
    static boolean cekStep3(String email) {
        boolean isEmail = false;
        
        if (email.contains(".co.id")||email.contains(".id")) {
            isEmail = true;
        }
        
        return isEmail;
    }
    
    static boolean cekStep4(String email) {
        boolean isEmail = true;
        
        int n = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                n = i;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (email.charAt(i) == '.') {
                isEmail = false;
            }
        }
        
        return isEmail;
    }
    
}
