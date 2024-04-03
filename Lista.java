/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Administrador
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // punto 1
        ArrayList<String> Arra = new ArrayList<>();
        System.out.println("la lista esta sin elemento " + Arra);

        // punto 2
        ArrayList<String> Listaarray = new ArrayList<>();
        Listaarray.add("1");
        Listaarray.add("2");
        Listaarray.add("3");
        Listaarray.add("4");
        Listaarray.add("5");
        Listaarray.add("6");
        System.out.println("la  lista es:" + Listaarray);
        // punto 3
         
        System.out.println("la longitud de la lista es de " + Listaarray.size()+ " Elementos");
        
        //Punto 4
        
        String primerElemento = Listaarray.get(0);
        String elementoCentral = Listaarray.get(2);
        String ultimoElemento = Listaarray.get(4);
        System.out.println("El primer elemento es: "  + primerElemento + '\n' + "El elementro central es: "  + elementoCentral + '\n'+ "El ultimo elemento: " + ultimoElemento);
        
        //Punto 5 
        
        ArrayList<Object> DatosMezclados = new ArrayList<>();
        DatosMezclados.add("R");
        DatosMezclados.add("Edad " + 10+ " años");
        DatosMezclados.add("Altura " + 1.20); 
        DatosMezclados.add("Casado");
        DatosMezclados.add("Barrio mandela");
        System.out.println("Datos: " + DatosMezclados);
        
        //Punto 6
        
        ArrayList<String> itCompanies = new ArrayList<>();
        itCompanies.add("Facebook");
        itCompanies.add("Google");
        itCompanies.add("Microsoft");
        itCompanies.add("Apple");
        itCompanies.add("IBM");
        itCompanies.add("Oracle");
        itCompanies.add("Amazon");
        System.out.println( itCompanies );
        
        //Punto 7
        
        itCompanies.add(1, "Tecnar");
        
        //Punto 8
        
       boolean ExisteEmpresa = itCompanies.contains("Tecnar");
        System.out.println( ExisteEmpresa + "\nSi existe la empresa");
        
        //Punto 9
        
        Collections.sort(itCompanies);
        System.out.println( itCompanies );
        
        //Punto 10 
        
        Collections.reverse(itCompanies);
        System.out.println( itCompanies );
        
        //Punto 11
        
        itCompanies.remove(0);
        System.out.println( itCompanies );
        
        //Punto 12
        
         itCompanies.clear();
        System.out.println(itCompanies );
        
    }
    
}
