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


public class BufferdedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        String name = "";
        System.out.println("Please enter your name : ");
        try {
            name = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.println("Hello " + name + "!");
    }
    
}
