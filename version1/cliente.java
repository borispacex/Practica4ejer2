package version1;

import java.net.MalformedURLException; 
import java.net.URL; 

public class cliente {
	
	public static void main(String[] args) throws MalformedURLException{
		
		// Crea una URL con representación de cadena.
		URL url0 = new URL ("http://localhost/test.html:9090?nombre=Pepe");
  
        // Imprimimos la representación de cadena de la URL.
        System.out.println(url0.toString()); 
        System.out.println();
        // Recupera el protocolo para la URL
        System.out.println("El esquema es: " + url0.getProtocol());
        // Recupera la informacion del usuario
        System.out.println("La informacion de usuario es: " + url0.getUserInfo()); 
        // Recupera el nombre de host de la URL
        System.out.println("El host es: " + url0.getHost()); 
        // Recupera el puerto predeterminado
        System.out.println("El puerto es: " + url0.getPort()); 
        // Recupera la ruta de la URL 
        System.out.println("La ruta (path): " + url0.getPath()); 
        // Recupera la referencia 
        System.out.println("La referencia: " + url0.getRef());
        // Recupera la parte de la consulta de la URL 
        System.out.println("El query string es: " + url0.getQuery());
        
	}
	
}
