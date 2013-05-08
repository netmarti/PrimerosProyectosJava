package nuevo.banco;

public class NodoListaUsuario {
	
    
        public int id, numlib,lib1,lib2;
        public String nombre, Libros; 
	public NodoListaUsuario sig;
        
        
	public NodoListaUsuario(int x, String name, int lib, String listalib, int libro1,int libro2)	{
	    
            id=x;
	    sig=null;
            nombre=name;
            numlib=lib;
            Libros=listalib;
            lib1=libro1;
            lib2=libro2;
	}

	public NodoListaUsuario(int x, String name, int lib, String listalib, int libro1,int libro2, NodoListaUsuario n) {
	   id=x;
	    sig=n;
            nombre=name;
            numlib=lib;
            Libros=listalib;
            lib1=libro1;
            lib2=libro2;
	}
}

