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
import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class dialoginput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("D:\\328\\modul-03\\modul 03\\src\\modul\\pkg03\\toilet2.png");
        Object jk = JOptionPane.showInputDialog(null, "masukan jenis kelamin ", "PILIH", JOptionPane.PLAIN_MESSAGE, icon, new String[]{"laki-laki","prempuan"},"laki-laki");
        JOptionPane.showMessageDialog(null,"anda memilih "+jk,"Informasi", JOptionPane.INFORMATION_MESSAGE, icon);
    }
    
}