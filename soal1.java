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
public class soal1 {
    
    public static void main(String[] args) {
        //scanner
        Scanner sc = new Scanner(System.in);
        
        //input
        System.out.print("Masukkan input bilangan : ");
        int n = sc.nextInt();
        
        //proses
        if (n%3 == 0) {
            System.out.print("Hello ");
        }
        if (n%5 == 0) {
            System.out.print("World");
        }
    }
}
