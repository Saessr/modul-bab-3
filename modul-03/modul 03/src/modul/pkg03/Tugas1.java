/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg03;

/**
 *
 * @author budis
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Clock;

public class Tugas1 {

    public static void main(String[] args) {
       
        int n1 = 10, n2 = 20, n3 = 45;
        int rata;
 
        rata = (n1 + n2 + n3) / 3;
        System.out.println("number 1 = " + n1);
        System.out.println("number 2 = " + n2);
        System.out.println("number 3 = " + n3);
        System.out.println("Rata-rata = " + rata);
    }
}
