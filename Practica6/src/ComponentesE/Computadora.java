/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesE;

import Interfases_Componentes.IComponentesComputadora;
import practica6.ComponentesElectronicos;
import practica6.IComponentesElectronicos;

/**
 *
 * @author Juan Carlos
 */
public class Computadora extends ComponentesElectronicos implements IComponentesElectronicos, IComponentesComputadora{

    /**
     * @return the RAM
     */
    public int getRAM() {
        return RAM;
    }

    /**
     * @param RAM the RAM to set
     */
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    /**
     * @return the teclado
     */
    public String getTeclado() {
        return teclado;
    }

    /**
     * @param teclado the teclado to set
     */
    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    /**
     * @return the mouse
     */
    public String getMouse() {
        return mouse;
    }

    /**
     * @param mouse the mouse to set
     */
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
    
    private int RAM;
    private String teclado;
    private String mouse;
    
    @Override
    public String encender(){
        return "Computadora encendida.";
    }
    
    @Override
    public String apagar(){
        return "Computadora apagada.";
    }
    
    @Override
    public String actualizar(){
        return "Actualizando computadora.";
    }
}
