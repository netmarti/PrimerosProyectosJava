package examentiendita;

public class NodoLista {
	
    
        public int id;
        public double precio;
        public String nombre,classi,provedor;
	public NodoLista sig;
        
        
	public NodoLista(int x, String name, Double prize,String classification,String provider)	{
	    
            id=x;
	    nombre=name;
            precio=prize;
            classi=classification;
            provedor=provider;
            
                    
	}

	public NodoLista(int x, String name, Double prize,String classification,String provider, NodoLista n) {
	   id=x;
	    nombre=name;
            precio=prize;
            classi=classification;
            provedor=provider;
	}
}

