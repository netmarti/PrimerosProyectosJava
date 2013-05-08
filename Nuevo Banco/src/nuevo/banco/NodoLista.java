package nuevo.banco;

public class NodoLista {
	
    
        public int id, pres;
        public String nombre, autor; 
	public NodoLista sig;
        
        
	public NodoLista(int x, String name, String aut,int prestado)	{
	    
            id=x;
	    sig=null;
            nombre=name;
            autor=aut;
            pres=prestado;
	}

	public NodoLista(int x, String name, String aut,int prestado , NodoLista n) {
	    id=x;
	    sig=n;
            nombre=name;
            autor=aut;
            pres=prestado;
	}
}

