
package lab3p2_carlosmurillo_12211240;

import java.util.ArrayList;

public class Cohete {
    double peso;
    private String nombre;
    private String serie;
    private int potencia;
    private int tipo;
    private double litros;
    private int fases;
    private int motores;
    private double altura;
    private double kilos;
    private String material;
    private double velocidad;
    private ArrayList lista;
    
    public void set_peso(double peso){
        this.peso = peso;
    }
    public double get_peso(){
        return peso;
    }
    
    public void set_nombre(String nombre){
        this.nombre = nombre;
    }
    public String get_nombre(){
        return nombre;
    }
    
    public void set_serie(String serie){
        this.serie = serie;
    }
    public String get_serie(){
        return serie;
    }
    
    public void set_potencia(int potencia){
        this.potencia = potencia;
    }
    public int get_potencia(){
        return potencia;
    }
    
    public void set_tipo(int tipo){
        this.tipo = tipo;
    }
    public int get_tipo(){
        return tipo;
    }
    
    public void set_velocidad(double velocidad){
        this.velocidad = velocidad;
    }
    public double get_velocidad(){
        return velocidad;
    }
    
    public void set_lista(ArrayList lista){
        this.lista = lista;
    }
    public ArrayList get_lista(){
        return lista;
    }
    
    public Cohete(ArrayList lista, double peso, String nombre, String serie, int potencia, int tipo, double litros){
        this.peso = peso;
        this.nombre = nombre;
        this.serie = serie;
        this.potencia = potencia;
        this.litros = litros;
        this.tipo = tipo;
    }
    
    public Cohete(ArrayList lista, double peso, String nombre, String serie, int potencia, int tipo, int fases, int motores, double altura){
        this.peso = peso;
        this.nombre = nombre;
        this.serie = serie;
        this.potencia = potencia;
        this.fases = fases;
        this.motores = motores;
        this.altura = altura;
        this.tipo = tipo;
    }
    public Cohete(ArrayList lista, double peso, String nombre, String serie, int potencia, int tipo, double kilos, String material){
        this.peso = peso;
        this.nombre = nombre;
        this.serie = serie;
        this.potencia = potencia;
        this.kilos = kilos;
        this.material = material;
        this.tipo = tipo;
    }
    
    public String toString(){
        String cadena = "pa";
        if(tipo == 1){
            cadena = "Cohete"+"\n"+"   Peso Soportable: "+peso+"\n"+"   nombre: "+nombre+"\n"+"   Serie: "+serie+"\n"+"   Potencia: "+potencia+"\n"+"   velocidad: "+velocidad+"\n"+"   personas: "+lista+"\n"+"   Liquido{"+"\n"+"   Litros: "+litros+"}";
        }
        else if(tipo == 2){
            cadena = "Cohete"+"\n"+"   Peso Soportable: "+peso+"\n"+"   nombre: "+nombre+"\n"+"   Serie: "+serie+"\n"+"   Potencia: "+potencia+"\n"+"   velocidad: "+velocidad+"\n"+"   personas: "+lista+"\n"+"   Fases{"+"\n"+"   Fases: "+fases+"\n"+"   Motores: "+motores+"\n"+"   Altura: "+altura+"}";
        }
        else if(tipo == 3){
            cadena = "Cohete"+"\n"+"   Peso Soportable: "+peso+"\n"+"   nombre: "+nombre+"\n"+"   Serie: "+serie+"\n"+"   Potencia: "+potencia+"\n"+"   velocidad: "+velocidad+"\n"+"   personaa: "+lista+"\n"+"   Solido{"+"\n"+"   Kilos: "+kilos+"\n"+"   Material: "+material+"}";
        }
        return cadena;
    }
    
    
}
