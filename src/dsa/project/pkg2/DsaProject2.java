/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.project.pkg2;
import edd.*;
import interfaz.interfaz;

/**
 *
 * @author manch
 */
public class DsaProject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CreateHashTable hashtable = new CreateHashTable();
        //hashtable.createHashtable();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }
    
}
