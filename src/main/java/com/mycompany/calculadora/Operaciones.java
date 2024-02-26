/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author tamal
 */
import javax.swing.JOptionPane;
public class Operaciones {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Métodos 
    
    public void leerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("coloca el num1"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("coloca el num2"));
        
    }
    public void sumar(){
       suma =numero1 + numero2;
    }
    
    public void restar(){
       resta =numero1 - numero2;
    }
     public void multiplicar(){
       multiplicacion =numero1 * numero2;
    }
    
    public void dividir(){
       division =numero1 / numero2;
    }
    public void mostrarResultados(){
       System.out.println(" la suma es" + suma);
       System.out.println(" la restsa es" + resta);
       System.out.println(" la multiplicacion es" + multiplicacion);
       System.out.println(" la division es" + division);
    }    
}

