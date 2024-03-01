/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import javax.swing.JOptionPane;

/**
 *
 * @author tamal
 */
public class Calculadora {

    public static void main(String[] args) {
        int n1 =Integer.parseInt(JOptionPane.showInputDialog("coloca el num1"));
        int n2 =Integer.parseInt(JOptionPane.showInputDialog("coloca el num2"));
  
                
        Operaciones op=new Operaciones();
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n1);
        op.mostrarResultados();
        
    }
}
