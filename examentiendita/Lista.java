package examentiendita;
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
		    
                
                
                int codigo;
                String nom,cat,pro;
                Double pre;
		inicio = null;
                int cant=0;
                
                aux = new NodoLista (1203,"Submarino",10.50,"comida","Bimbo");

if (inicio == null) {
				inicio = aux;
			    ant = aux; 
			}   
			else {
				ant.sig = aux;
				ant = aux;
			}


                        aux = new NodoLista (1203,"Rebanadas",14.50,"comida","Bimbo");

if (inicio == null) {
				inicio = aux;
			    ant = aux; 
			}   
			else {
				ant.sig = aux;
				ant = aux;
			}
                        
aux = new NodoLista (1203,"Tostitos",15.50,"comida","Sabritas");

if (inicio == null) {
				inicio = aux;
			    ant = aux; 
			}   
			else {
				ant.sig = aux;
				ant = aux;
			}
aux = new NodoLista (1203,"Doritos",17.50,"comida","Sabritas");

if (inicio == null) {
				inicio = aux;
			    ant = aux; 
			}   
			else {
				ant.sig = aux;
				ant = aux;
			}
                cant=Integer.parseInt(JOptionPane.showInputDialog("Cuantos Productos tiene?"));
		for(i=0;i<cant;i++)
                {
                    
                    codigo=Integer.parseInt(JOptionPane.showInputDialog("Codigo del producto " + i));
                    nom=JOptionPane.showInputDialog("Nombre del producto " + i);
                    pre=Double.parseDouble(JOptionPane.showInputDialog("Precio del producto "+ i));
                    cat=JOptionPane.showInputDialog("Clasificacion del producto " + i);
                    pro=JOptionPane.showInputDialog("Provedor del producto " + i);
                
aux = new NodoLista (codigo,nom,pre,cat,pro);

if (inicio == null) {
				inicio = aux;
			    ant = aux; 
			}   
			else {
				ant.sig = aux;
				ant = aux;
			}

                
                }
		}
	

	public void imprimirLista () {
		NodoLista aux;
		String data="";
		aux = inicio;
                
		
		while (aux != null) {
			data=data+"Codigo: "+ aux.id +" Nombre: " + aux.nombre + " Precio: " + aux.precio + " Clasificacion: " +aux.classi+ " Provedor: "+aux.provedor+"\n";
			aux = aux.sig;
		}
                JOptionPane.showMessageDialog(null, data);
		
	}
        
        public void imprimir1000 () {
		NodoLista aux;
		String data=" PRODUCTOS 1000+ \n";
		aux = inicio;
                
		
		while (aux != null) 
                { 
                    if(aux.precio>1000){
			data=data+"Codigo: "+ aux.id +" Nombre: " + aux.nombre + " Precio: " + aux.precio + " Clasificacion: " +aux.classi+ " Provedor: "+aux.provedor+"\n";
                    }
                        aux = aux.sig;
		}
        
                JOptionPane.showMessageDialog(null, data);
		
	}
        
        public void imprimirProvedor () {
		NodoLista aux;
		String  bimbo="BIMBO \n",sabritas="SABRITAS \n",otros="OTROS \n";
		aux = inicio;
                
		
		while (aux != null) 
                { 
                    if(aux.provedor=="Bimbo"){
			bimbo=bimbo+"Codigo: "+ aux.id +" Nombre: " + aux.nombre + " Precio: " + aux.precio + " Clasificacion: " +aux.classi+ " Provedor: "+aux.provedor+"\n";
                       
                    }
                    
                    if(aux.provedor=="Sabritas"){
			sabritas=sabritas+"Codigo: "+ aux.id +" Nombre: " + aux.nombre + " Precio: " + aux.precio + " Clasificacion: " +aux.classi+ " Provedor: "+aux.provedor+"\n";
                        
                    }
                    if(aux.provedor!="Bimbo"&&aux.provedor!="Sabritas")
                        {
			otros=otros+"Codigo: "+ aux.id +" Nombre: " + aux.nombre + " Precio: " + aux.precio + " Clasificacion: " +aux.classi+ " Provedor: "+aux.provedor+"\n";
                        
                    }
                        
                        aux = aux.sig;
		}
        
                JOptionPane.showMessageDialog(null, bimbo+sabritas+otros);
		
	}
        
        
        
        
        
        
        
}