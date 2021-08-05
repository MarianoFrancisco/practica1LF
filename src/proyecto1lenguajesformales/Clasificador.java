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
    private Enum enumerador;
    public Clasificador(Enum enumerador) {
        this.enumerador = enumerador;
    }

    public Enum getEnumerador() {
        return this.enumerador;
    }

    public void setEnumerador(Enum enumerador) {
        this.enumerador = enumerador;
    }
    public void imprimirClasificador(){
        enumerador.getEvaluador();
    }
}
