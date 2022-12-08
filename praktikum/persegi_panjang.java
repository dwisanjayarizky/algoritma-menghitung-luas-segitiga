/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luas_persegi_panjang;

import java.util.Scanner;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class persegi_panjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);

        int panjang, lebar, luas;
        System.out.println("=================================================||");
        System.out.println("Nama = Rizki Dwi Sanjaya                         ||");
        System.out.println("Nim = 20210801091                                ||");
        System.out.println("Teknik Informatika                               ||");
        System.out.println("PROGRAM JAVA MENGHITUNG LUAS PERSEGI PANJANG :   ||");
        System.out.println("-----------------------------------------------");

        System.out.print("Masukan Panjang      : ");
        panjang=input.nextInt();
        System.out.print("Masukan Lebar        : ");
        lebar=input.nextInt();
        
        luas=panjang*lebar;

        System.out.println("Luas Persegi Panjang : "+luas);
    }  
}