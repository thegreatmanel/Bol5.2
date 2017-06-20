/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Boletin52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Suma resultado=new Suma();
        short n1=Short.parseShort(JOptionPane.showInputDialog("Introduzca un número"));
        short n2=Short.parseShort(JOptionPane.showInputDialog("Introduzca un número"));
       
        resultado.resultados(n1, n2);
    } // TODO code application logic here
    }
    

