/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1lenguajesformales;

import static proyecto1lenguajesformales.Interfaz.area;

/**
 *
 * @author Mariano
 */
public enum Enum {
    //hibrido entre una clase y una constante, podemos crear constantes 
    LETRA("letra",1),//1
    PUNTO("punto",2),//2
    NUMERO("numero",3),//3
    SIMBOLO("simbolo",4),//4
    ESPACIO("espacio",5),//5
    COMA("coma",6);//6
    private String evaluador;
    private int opcion;
    private Enum(String evaluador,int opcion){
        this.evaluador=evaluador;
        this.opcion=opcion;
    }
    public static Enum valueOf(int opcion){
        switch(opcion){
            case 1:
                return LETRA;
            case 2:
                return PUNTO;
            case 3:
                return NUMERO;
            case 4:
                return SIMBOLO;
            case 5:
                return ESPACIO;
            case 6:
                return COMA;
            default:  
        }
        return null;
    }
    public String getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(String evaluador) {
        this.evaluador = evaluador;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
}
