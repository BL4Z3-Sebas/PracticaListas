/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listadoble;

import java.util.ArrayList;

/**
 *
 * @author smindiola
 */
public class Main {
    public static void main(String[] args) {
        
        NodoDoble<String> nodo1= new NodoDoble<>("A");
        System.out.println("Info del nodo: "+nodo1.getDato());
        
        NodoDoble<Integer> nodo2= new NodoDoble<>(10);
        System.out.println("Info del nodo: "+nodo2.getDato());
        
        NodoDoble<ArrayList> nodo3= new NodoDoble<ArrayList>();
        ArrayList<String> lista=new ArrayList<String>();
        
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        
        nodo3.setDato(lista);
        
        for (Object info : nodo3.getDato()) {
            System.out.println("Info del nodo: "+info);
        }
        
       
    }
}
