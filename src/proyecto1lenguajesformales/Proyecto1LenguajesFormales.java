/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1lenguajesformales;

/**
 *
 * @author Mariano
 */
public class Proyecto1LenguajesFormales {
    //llamamos nuestro frame interfaz
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });    
    }
}
