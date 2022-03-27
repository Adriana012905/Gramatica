/*Esta es la clase Palabra en la cual se conforma de los simbolos*/

package com.example.normalizacion.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palabra {

    private String p;
    private List<String> simbolos;

    public Palabra (String palabra){
        this.p = palabra;
        this.simbolos = crearSimbolosList(palabra);
    }

    public Palabra (List<String> simbolos){
        this.simbolos = simbolos;
        StringBuilder palabra = new StringBuilder();
        for (String simbol : simbolos) {
            palabra.append(simbol);
        }
        this.p = palabra.toString();
    }

    public Palabra (){}

    public String getPalabra() {
        return p;
    }

    public List<String> getSimbolos() {
        return simbolos;
    }

    public void setPalabra(String palabra) {
        this.p = palabra;
    }

    public void setSimbolos(ArrayList<String> simbolos) {
        this.simbolos = simbolos;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Palabra){
            Palabra s = (Palabra) o;
            return s.p.equals(this.p);
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.p.hashCode();
    }

    public List<String> crearSimbolosList (String p){
        String[] simbolosArray = p.split("");
        return Arrays.asList(simbolosArray);
    }

    public int length (){
        return this.simbolos.size();
    }

    public String substring(int beginIndex, int endIndex){
        return this.p.substring(beginIndex, endIndex);
    }
    
    public String substring(int beginIndex){
        return this.p.substring(beginIndex);
    }

    @Override
    public String toString(){
        return p;
    }

    public void actualizarPalabra(){
        StringBuilder palabra = new StringBuilder();
        for (String simbol : this.simbolos) {
            palabra.append(simbol);
        }
        this.p = palabra.toString();
    }
}

