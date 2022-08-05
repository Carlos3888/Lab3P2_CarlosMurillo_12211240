
package lab3p2_carlosmurillo_12211240;

import java.util.ArrayList;

public class Planetas {
    private String nombre;
    private double masa;
    private double radio;
    private double temperatura;
    private double velocidad;
    private ArrayList lista;
    private int tipo;
    private double densidad;
    private boolean vida;
    private double presion;
    private int anillos;
    
    public void set_nombre(String nombre){
        this.nombre = nombre;
    }
    public String get_nombre(){
        return nombre;
    }
    
    public void set_masa(double masa){
        this.masa = masa;
    }
    public double get_masa(){
        return masa;
    }
    
    public void set_radio(double radio){
        this.radio = radio;
    }
    public double get_radio(){
        return radio;
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
    
    public void set_tipo(int tipo){
        this.tipo = tipo;
    }
    public int get_tipo(){
        return tipo;
    }
    
    public void set_densidad(double densidad){
        this.densidad = densidad;
    }
    public double get_densidad(){
        return densidad;
    }
    
    public void set_vida(boolean vida){
        this.vida = vida;
    }
    public boolean get_vida(){
        return vida;
    }
    
    public void set_presion(double presion){
        this.presion = presion;
    }
    public double get_presion(){
        return presion;
    }
    
    public void set_anillos(int anillos){
        this.anillos = anillos;
    }
    public int get_anillos(){
        return anillos;
    }
    
    public Planetas(ArrayList lista, String nombre, double masa, double radio, double temperatura, double velocidad, int tipo, double densidad, boolean vida){
        this.nombre = nombre;
        this.masa = masa;
        this.radio = radio;
        this.temperatura = temperatura;
        this.velocidad = velocidad;
        this.lista = lista;
        this.tipo = tipo;
        this.densidad = densidad;
        this.vida = vida;
        this.velocidad = velocidad;
    }
    public Planetas(ArrayList lista, String nombre, double masa, double radio, double temperatura, double velocidad, int tipo, double presion, int anillos){
        this.nombre = nombre;
        this.masa = masa;
        this.radio = radio;
        this.temperatura = temperatura;
        this.velocidad = velocidad;
        this.lista = lista;
        this.tipo = tipo;
        this.presion = presion;
        this.anillos = anillos;
        this.velocidad = velocidad;
    }
    
    public String toString(){
        String cadena = "pa";
        if(tipo == 1){
            cadena = "Planeta"+"\n"+"   Nombre: "+nombre+"\n"+"   Masa: "+masa+"\n"+"   Radio: "+radio+"\n"+"   Temperatura: "+temperatura+"\n"+"   velocidad de escape: "+velocidad+"\n"+"   Lunas: "+lista+"\n"+"   Rocoso{"+"\n"+"   densidad: "+densidad+"\n"+"   Hay vida: "+vida+"}";
        }
        else if(tipo == 2){
            cadena = "Planeta"+"\n"+"   Nombre: "+nombre+"\n"+"   Masa: "+masa+"\n"+"   Radio: "+radio+"\n"+"   Temperatura: "+temperatura+"\n"+"   velocidad de escape: "+velocidad+"\n"+"   Lunas: "+lista+"\n"+"   Gaseoso{"+"\n"+"   presion: "+presion+"\n"+"   Anillos: "+anillos+"}";
        }
        return cadena;
    }
}
