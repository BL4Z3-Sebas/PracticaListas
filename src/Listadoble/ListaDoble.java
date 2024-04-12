/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listadoble;

/**
 *
 * @author smindiola
 */
public class ListaDoble<E> {
    private NodoDoble<E> PTR,FINAL;

    public NodoDoble<E> getPTR() {
        return PTR;
    }

    public void setPTR(NodoDoble<E> PTR) {
        this.PTR = PTR;
    }

    public NodoDoble<E> getFINAL() {
        return FINAL;
    }

    public void setFINAL(NodoDoble<E> FINAL) {
        this.FINAL = FINAL;
    }
    private NodoDoble crearNodoDoble(E dato){
        NodoDoble<E> nodoDoble=new NodoDoble<>(dato);
        return nodoDoble;
    }    
    
    
    public void agregarNodo(E dato){
        NodoDoble<E> nodoDoble=new NodoDoble<>(dato);
        
        if (PTR==null) {
            PTR=nodoDoble;
            FINAL= nodoDoble;
        }else{
            FINAL.setSig(FINAL);
            nodoDoble.setAnt(FINAL);
            FINAL=nodoDoble;
        }
    }
    
    public void mostrarLista(){
        NodoDoble nododoble=PTR;
        while(nododoble!=null){
            System.out.println("Info: "+nododoble.getDato().toString());
            nododoble=nododoble.getSig();
        }
    }
}
