/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examenvector;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author comp
 */
public class ExamenVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /** 
        Vector v=new Vector();
        v.addElement("uno");
        v.addElement("dos");
        v.addElement("cuatro");
        v.addElement("cinco");
        v.addElement("seis");
        v.addElement("siete");
        v.addElement("ocho");
        v.addElement("nueve");
        v.addElement("diez");
        v.addElement("once");
        v.addElement("doce");
        v.insertElementAt("tres", 2);
        System.out.println("nº de elementos "+v.size());
        System.out.println("dimensión "+v.capacity());

        System.out.println();

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
       
     */   
        
 /**       Vector<String> mivector = new Vector<String>();

mivector.add("Elemento Uno");
mivector.add("Elemento Dos");
mivector.add("Elemento Tres");
Iterator<String> iter = mivector.iterator();
while (iter.hasNext())
System.out.println(iter.next());

   */

Vector<String> juegos = new Vector<String>();

juegos.add("Soccer");
juegos.add("Basket");
juegos.add("Volley");
juegos.add("Uno");
juegos.add("XBOX");
juegos.add("Manopoly");
juegos.add("Pictionary");

Iterator<String> iter = juegos.iterator();
while (iter.hasNext())
System.out.println(iter.next());
System.out.println("nº de elementos "+juegos.size());
        System.out.println("dimensión "+juegos.capacity());


    }
}
