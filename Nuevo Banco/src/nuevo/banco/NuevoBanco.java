/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo.banco;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author comp
 */
public class NuevoBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO code application logic here
        
        Lista lista = new Lista("Libros");
		
		lista.cargarLista();
		lista.imprimirLista();
                lista.cargarUsuarios();
                lista.imprimirUsuarios();
               
               int x;
              x=Integer.parseInt(JOptionPane.showInputDialog("Id del libro que desea sacar?"));
               int y;
            y=Integer.parseInt(JOptionPane.showInputDialog("Id del usuario que saca el libro?"));
                lista.CheckOut(x, y);
                
                lista.imprimirLista();
                lista.imprimirUsuarios();
               
                
                
    }
}
