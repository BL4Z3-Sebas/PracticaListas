/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listadoble;

public class NodoDoble<T> {
    private T dato;
    private NodoDoble sig;
    private NodoDoble ant;

    public NodoDoble() {
        
    }

    public NodoDoble(T dato) {
        this.dato = dato;
        this.ant=null;
        this.sig=null;
        
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoDoble getSig() {
        return sig;
    }

    public void setSig(NodoDoble sig) {
        this.sig = sig;
    }

    public NodoDoble getAnt() {
        return ant;
    }

    public void setAnt(NodoDoble ant) {
        this.ant = ant;
    }

    @Override
    public String toString() {
        return "NodoDoble{" + "dato=" + dato + '}';
    }
    
    
}
