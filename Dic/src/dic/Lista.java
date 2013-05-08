package dic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
public class Lista {

	public Lista (String nombreLista) {
		inicio = null;
		nombre = nombreLista;
	}
        
	public Lista () {
		inicio = null;
		nombre = null;
	}
        
	
	public NodoLista inicio;
        
	
        public String nombre;
	
        
        public void cargarLista () throws IOException {
		int cantidad, i, x;
		NodoLista aux,ant = null;
		    
		inicio = null;
		
aux = new NodoLista (1,"Carro", "Car");

if (inicio == null) {
				inicio = aux;
			    ant = aux; 
			}   
			else {
				ant.sig = aux;
				ant = aux;
			}

aux = new NodoLista (2,"Perro", "Dog");
if (inicio == null) {
				inicio = aux;
			    ant = aux; 
			}   
			else {
				ant.sig = aux;
				ant = aux;
			}
		}
	

	public void imprimirLista () {
		NodoLista aux;
		
		aux = inicio;
		System.out.print (nombre+": \n");
		while (aux != null) {
			System.out.println ("ID: "+ aux.id +" Espanol: " + aux.espanol + " Ingles: " + aux.ingles);
			aux = aux.sig;
		}
		
	}
        
        
        
        
        
        
}