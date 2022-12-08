/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luas_segitiga;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class segitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=================================================||");
        System.out.println("Nama = Rizki Dwi Sanjaya                         ||");
        System.out.println("Nim = 20210801091                                ||");
        System.out.println("Teknik Informatika                               ||");
        System.out.println("PROGRAM JAVA MENGHITUNG LUAS PERSEGI PANJANG :   ||");
        System.out.println("=================================================||");
          Scanner input=new Scanner(System.in);
        int a, t;
        double luas;
        
        System.out.print("Masukan Alas : ");
        a=input.nextInt();
        System.out.print("Masukan Tinggi : ");
        t=input.nextInt();
        
        luas=0.5*a*t;
        System.out.println("Luas Segitiga : "+luas);
    }  
} 