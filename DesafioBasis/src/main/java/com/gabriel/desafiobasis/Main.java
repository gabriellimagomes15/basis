/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabriel.desafiobasis;

import javax.swing.JOptionPane;

/**
 *
 * @author gabrielgomes
 */
public class Main {
    public static void main(String[] args){
        Validador check = new Validador();
        String word     = JOptionPane.showInputDialog("Digita a string a ser verificada");
        if(check.checkString(word)){
            JOptionPane.showMessageDialog(null,"String válida");
        }else{
            JOptionPane.showMessageDialog(null,"String inválida");            
        }
    }
}
