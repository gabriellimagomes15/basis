/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabriel.desafiobasis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author gabrielgomes
 */
public class Validador {
    
    private static final char BRACKET_LEFT = '(';
    private static final char BRACKET_RIGHT = ')';
    private List<Character> list = new ArrayList<Character>();
    
    public boolean checkString(String word){
        
        for(int i= 0; i < word.length(); i++){
        
            if(word.charAt(i) == BRACKET_LEFT){
                this.list.add(BRACKET_LEFT);
            }else if(word.charAt(i) == BRACKET_RIGHT){
                if(list.isEmpty()){
                    return false;
                }else{
                    removeLeast();
                }
            }
        }
        return true;
    }
    
    public void removeLeast(){
        this.list.remove(this.list.size() - 1);
    }
}
