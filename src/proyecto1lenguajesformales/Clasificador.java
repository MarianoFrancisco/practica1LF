/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1lenguajesformales;

/**
 *
 * @author Mariano
 */
public class Clasificador {
    //creamos un constructor para nuestro enum utilizando la clase clasificador
    private Enum enumerador;
    public Clasificador(Enum enumerador) {
        this.enumerador = enumerador;
    }
    //gets and sets
    public Enum getEnumerador() {
        return this.enumerador;
    }
    public void setEnumerador(Enum enumerador) {
        this.enumerador = enumerador;
    }
}
