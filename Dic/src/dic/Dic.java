/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dic;

import java.io.IOException;

/**
 *
 * @author comp
 */
public class Dic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Lista lista = new Lista("Dic");
        lista.cargarLista();
        lista.imprimirLista();
        
    }
}
