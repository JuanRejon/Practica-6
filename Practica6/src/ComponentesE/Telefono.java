/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesE;

import Interfases_Componentes.IComponentesTelefono;
import practica6.ComponentesElectronicos;
import practica6.IComponentesElectronicos;

/**
 *
 * @author Juan Carlos
 */
public class Telefono extends ComponentesElectronicos implements IComponentesElectronicos, IComponentesTelefono{


    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    private int almacenamiento;
    
    @Override
    public String encender(){
        return "Telefono encendido.";
    }
    
    @Override
    public String apagar(){
        return "Telefono apagado.";
    }
    
    @Override
    public String hacerLlamada(String contacto){
        return "Llamando a " + contacto;
    }
    
    @Override
    public String hacerLlamada(long numCont){
        return "Llamando a " + Long.toString(numCont);
    }
}
