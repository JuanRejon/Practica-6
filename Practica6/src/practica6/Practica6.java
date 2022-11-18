/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6;

import ComponentesE.Telefono;
import ComponentesE.Computadora;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class Practica6 {

    public static void main(String[] args) throws IOException {
        
        Scanner scanf = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Telefono tl = new Telefono();
        Telefono tl1 = new Telefono();
        Telefono tl2 = new Telefono();
        Computadora comp = new Computadora();
        Computadora comp1 = new Computadora();
        Computadora comp2 = new Computadora();
        
        ArrayList <ComponentesElectronicos> al = new ArrayList();
        ArrayList <ComponentesElectronicos> compu = new ArrayList();
        //generic arraylist de puros componentes electronicos
        al.add(tl);
        al.add(tl1);
        al.add(tl2);
        
        compu.add(comp);
        compu.add(comp1);
        compu.add(comp2);
        //existe una relacion de herencia entre telefono. computadora y la lista
        for (ComponentesElectronicos o :al){
            System.out.println("Ingresar marca: ");
            o.setMarca(scanf.nextLine());
            System.out.println("Ingresar modelo: ");
            o.setModelo(scanf.nextLine());
            System.out.println("Ingresar color: ");
            o.setColor(scanf.nextLine());
            System.out.println("Ingresar precio: ");
            float s = Float.parseFloat(in.readLine());
            o.setPrecio(s);
            System.out.println(o.encender());
            System.out.println(o.getModelo());
            System.out.println(o.getMarca());
            System.out.println(o.getColor());
            System.out.println(o.getPrecio());
        }
        
        for (ComponentesElectronicos o :compu){
            System.out.println("Ingresar marca: ");
            o.setMarca(scanf.nextLine());
            System.out.println("Ingresar modelo: ");
            o.setModelo(scanf.nextLine());
            System.out.println("Ingresar color: ");
            o.setColor(scanf.nextLine());
            System.out.println("Ingresar precio: ");
            float s = Float.parseFloat(in.readLine());
            o.setPrecio(s);
            System.out.println(o.encender());
            System.out.println(o.getModelo());
            System.out.println(o.getMarca());
            System.out.println(o.getColor());
            System.out.println(o.getPrecio());
        }
    }
    
}
