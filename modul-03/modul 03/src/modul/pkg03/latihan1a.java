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
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class latihan1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        String p=null, l=null;
        
        try {
            System.out.print("masukan panjang = ");
            p = dataIn.readLine();
            System.out.print("masukan lebar = ");
            l = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        int pjg = Integer.parseInt(p);
        System.out.println("panjang =n" + pjg);
        int lbr = Integer.parseInt(l);
        System.out.println("panjang = " + lbr);
        
        int kel = (2*pjg) + (2*lbr);
        int luas = pjg*lbr;
        System.out.println("luas = " + luas);
        System.out.println("keliling = " + kel);
    }
        
        
       
        
    }
    
