/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examentiendita;

import java.io.IOException;

/**
 *
 * @author comp
 */
public class ExamenTiendita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         Lista lista = new Lista("Tienda");
        lista.cargarLista();
        lista.imprimirLista();
        lista.imprimir1000();
        lista.imprimirProvedor();
    }
}
