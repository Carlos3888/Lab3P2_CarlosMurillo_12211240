
package lab3p2_carlosmurillo_12211240;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_CarlosMurillo_12211240 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        boolean desicion = true;
        
        ArrayList lista_co = new ArrayList();
        ArrayList lista_pl = new ArrayList();
        ArrayList lista_nu = new ArrayList();
        ArrayList lista_pe = new ArrayList();
        ArrayList lista_lu = new ArrayList();

        while(desicion == true){
            System.out.println("========MENU========");
            System.out.println("1) Crear Cohete");
            System.out.println("2) Crear Planeta");
            System.out.println("3) Editar Cohete");
            System.out.println("4) Editar Planeta");
            System.out.println("5) Listar Cohetes");
            System.out.println("6) Listar PLanetas");
            System.out.println("7) Probar cohete");
            System.out.println("8) Salir");
            System.out.print("Ingrese la opcion que desea: ");
            int opcion = lea.nextInt();
            switch(opcion){
                case 1:{
                    boolean desi1 = true;
                    int tipo = 0;
                    
                    
                    System.out.print("Peso Soportable: ");
                    double peso = lea.nextDouble();
                    System.out.print("Nombre: ");
                    String nombre = lea.next();
                    System.out.print("Serie: ");
                    String serie = lea.next();
                    System.out.print("Potencia: ");
                    int potencia = lea.nextInt();
                    while(desi1 == true){
                        System.out.println("1) Liquido\n"+"2) De fases\n"+"3) Solido");
                        System.out.print("Tipo: ");
                        tipo = lea.nextInt();
                        if(tipo == 1){
                            System.out.print("Litros: ");
                            double litros = lea.nextDouble();
                            desi1 = false;
                            lista_co.add(new Cohete(lista_nu,peso,nombre,serie,potencia,tipo,litros));
                        }
                        else if(tipo == 2){
                            System.out.print("Fases: ");
                            int fases = lea.nextInt();
                            System.out.print("Motores: ");
                            int motores = lea.nextInt();
                            System.out.print("Altura: ");
                            double altura = lea.nextDouble();
                            desi1 = false;
                            lista_co.add(new Cohete(lista_nu,peso,nombre,serie,potencia,tipo,fases,motores,altura));
                        }
                        else if(tipo == 3){
                            System.out.print("Kilos: ");
                            double kilos = lea.nextDouble();
                            System.out.print("Material: ");
                            String material = lea.nextLine();
                            lea.nextLine();
                            desi1 = false;
                            lista_co.add(new Cohete(lista_nu,peso,nombre,serie,potencia,tipo,kilos,material));
                        }
                        else{
                            System.out.print("Opcion incorrecta: ");
                        }
                        
                        
                    } 
                }break;
                case 2:{
                    boolean desi1 = true;
                    int tipo = 0;
                    
                    System.out.print("Nombre: ");
                    String nombre = lea.next();
                    System.out.print("Masa: ");
                    double masa = lea.nextDouble();
                    System.out.print("Radio: ");
                    double radio = lea.nextDouble();
                    System.out.print("Temperatura: ");
                    double temperatura = lea.nextDouble();
                    
                    double g = 6.67 * Math.pow(10, -11);
                    double num = 2*g*masa/radio;
                    double velocidad = Math.sqrt(g);
                    
                    while(desi1 == true){
                        System.out.println("1) Rocoso\n"+"2) Gaseoso");
                        System.out.print("Tipo: ");
                        tipo = lea.nextInt();
                        if(tipo == 1){
                            System.out.print("Densidad: ");
                            double densidad = lea.nextDouble();
                            System.out.print("Hay vida [NO = 0]: ");
                            int desi2 = lea.nextInt();
                            boolean vida = true;
                            if(desi2 == 0){
                                vida = false;
                            }
                            desi1 = false;
                            
                            lista_pl.add(new Planetas(lista_nu,nombre,masa,radio,temperatura,velocidad,tipo,densidad,vida));
                        }
                        else if(tipo == 2){
                            System.out.print("Presion: ");
                            double presion = lea.nextDouble();
                            System.out.print("Anillos: ");
                            int anillos = lea.nextInt();
                            desi1 = false;
                            lista_pl.add(new Planetas(lista_nu,nombre,masa,radio,temperatura,velocidad,tipo,presion,anillos));
                        }
                        else{
                            System.out.print("Opcion incorrecta: ");
                        }
                        
                        
                    }
                }break;
                case 3:{
                    String salida1="";
                    for (Object object : lista_co) {
                        if (object instanceof Cohete) {
                            salida1+=lista_co.indexOf(object)+"- "+object+"\n";
                            
                        }
                    }
                    System.out.println(salida1);
                    System.out.println();
                    
                    boolean desi3 = true;
                    
                    while(desi3){
                        System.out.println("1) Agregar personas");
                        System.out.println("2) Eliminar personas");
                        System.out.println("3) Listar personas");
                        System.out.println("4) Salir");
                        int opcion1 = lea.nextInt();
                        switch(opcion1){
                            case 1:{
                                System.out.println("Nombre: ");
                                String nom = lea.next();
                                System.out.println("Edad: ");
                                int edad = lea.nextInt();
                                System.out.println("Peso: ");
                                double peso = lea.nextDouble();
                                int cade = lista_pe.size();
                                String cadena = "["+cade+"]"+" Nombre= "+nom+" Edad= "+edad+" Peso= "+peso;
                                lista_pe.add(cadena);
                            }break;
                            case 2:{
                                System.out.println("Ingrese la posicion de la persona a eliminar: ");
                                int eliminar = lea.nextInt();
                                lista_pe.remove(eliminar);
                            }break;
                            case 3:{
                                for(int i = 0; i < lista_pe.size(); i++){
                                    System.out.println(lista_pe.get(i));
                                }
                            }break;
                            case 4:{
                                desi3 = false;
                            }break;
                        }
                    }
                }break;
                case 4:{
                    String salida1="";
                    for (Object object : lista_co) {
                        if (object instanceof Cohete) {
                            salida1+=lista_co.indexOf(object)+"- "+object+"\n";
                            
                        }
                    }
                    System.out.println(salida1);
                    System.out.println();
                    
                    boolean desi3 = true;
                    
                    while(desi3){
                        System.out.println("1) Agregar luna");
                        System.out.println("2) Eliminar luna");
                        System.out.println("3) Listar lunas");
                        System.out.println("4) Salir");
                        int opcion1 = lea.nextInt();
                        switch(opcion1){
                            case 1:{
                                System.out.println("Nombre: ");
                                String nom = lea.next();
                                System.out.println("Crateres: ");
                                int cra = lea.nextInt();
                                int cade = lista_pe.size();
                                String cadena = "["+cade+"]"+" Nombre= "+nom+" Crateres= "+cra;
                                lista_lu.add(cadena);
                            }break;
                            case 2:{
                                System.out.println("Ingrese la posicion de la luna a eliminar: ");
                                int eliminar = lea.nextInt();
                                lista_lu.remove(eliminar);
                            }break;
                            case 3:{
                                for(int i = 0; i < lista_lu.size(); i++){
                                    System.out.println(lista_lu.get(i));
                                }
                            }break;
                            case 4:{
                                desi3 = false;
                            }break;
                        }
                    }
                }break;
                case 5:{
                    String salida1="";
                    for (Object object : lista_pl) {
                        if (object instanceof Planetas) {
                            salida1+=lista_pl.indexOf(object)+"- "+object+"\n";
                            
                        }
                    }
                    System.out.println(salida1);
                    System.out.println();
                    
                    
                }break;
                case 6:{
                    String salida1="";
                    for (Object object : lista_pl) {
                        if (object instanceof Planetas) {
                            salida1+=lista_pl.indexOf(object)+"- "+object+"\n";
                            
                        }
                    }
                    System.out.println(salida1);
                    System.out.println();
                }break;
                case 7:{
                    
                }break;
                case 8:{
                    desicion = false;
                }break;
                default:{
                    System.out.println("Opcion in correcta");
                }break;
            }
        }
    }
    
}
