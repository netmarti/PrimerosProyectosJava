package nuevo.banco;
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
        public NodoListaUsuario inicio2;
	
        public String nombre;
	
        public void cargarUsuarios () throws IOException {
		int cantidad, i, x;
		NodoListaUsuario aux,ant = null;
		    
		inicio = null;
		
aux = new NodoListaUsuario (1, "Daniel Lozano", 0, " ", 0,0);

if (inicio2 == null) {
				inicio2 = aux;
			    ant = aux; 
			}   
			else {
				ant.sig = aux;
				ant = aux;
			}

aux = new NodoListaUsuario (2, "Wendoli", 0, " ", 0,0);
if (inicio2 == null) 
{
inicio2 = aux;
  ant = aux; 
}   
else {
ant.sig = aux;
ant = aux;
			}

        }
        
        
        
        
        
        
        public void cargarLista () throws IOException {
		int cantidad, i, x;
		NodoLista aux,ant = null;
		    
		inicio = null;
		
aux = new NodoLista (1,"The Land Before Time", "Charlee Cheen",0);

if (inicio == null) {
				inicio = aux;
			    ant = aux; 
			}   
			else {
				ant.sig = aux;
				ant = aux;
			}

aux = new NodoLista (2,"The Land Before Time 2", "Charlee Cheen",0);
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
		System.out.print (nombre+": ");
		while (aux != null) {
			System.out.println ("ID: "+ aux.id +" Titulo: " + aux.nombre + " Autor: " + aux.autor + " Prestado: " + aux.pres);
			aux = aux.sig;
		}
		
	}
        
        public void imprimirUsuarios () {
		NodoListaUsuario aux;
		
		aux = inicio2;
		System.out.print ("Usuarios \n");
		while (aux != null) {
			System.out.println ("ID: "+ aux.id +" Nombre: " + aux.nombre + " Numero de Libros: " + aux.numlib + " Libros: " + aux.Libros+ " Libro1: " + aux.lib1 +" Libro2: "+ aux.lib2);
			aux = aux.sig;
		}
		
	}
        
        public void CheckOut (int book,int user){
		
            
	NodoLista aux;
        String libnombre="x";
        int x=book;
        int y=user;
        aux = inicio;
        while (aux != null) {
            
            if(aux.id==x)
            {
            aux.pres=y;
            }
            
            aux = aux.sig;
		}
        
            
        
            
        
     
        
}   

        
        public void CheckOutUser (int book,int user, String Nombre){
            
        int x=book;
        int y=user;
        String bookname=Nombre;
        NodoListaUsuario aux;
		
		aux = inicio2;
        while (aux != null) {
            
            if(y==aux.id)
            {
            
            aux.Libros=aux.Libros+bookname;
            if (aux.lib1==0)
            {
            aux.lib1=x;
            }
            if (aux.lib2==0)
            {
            aux.lib2=x;
            }
            else
            {
            JOptionPane.showMessageDialog(null, "Solo puede sacar 2 libros ala vez!");
            
            }
            
            }
            
            aux = aux.sig;
            
}
        
        
        
        
}
        
        
        
        public void FindUser(){	
            
	NodoListaUsuario aux;
        int x=1;
        aux = inicio2;
        while (aux != null) {
            
            if(aux.id==x)
            {
            JOptionPane.showMessageDialog(null, "encontrado");
            }
            
            aux = aux.sig;
		}
            
        
}   

}