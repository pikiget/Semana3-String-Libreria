package lib;

public class Libreria {
	public Libreria() {
		
	}
	
	public static String textoValido(String a) {
		return a.trim();
	}
	
	public static int logitudTextoValido(String a) {
		String textoValido = textoValido(a);
		return textoValido.length();
	}
	
	public static char primeraLetra(String a) {
		String textoValido = textoValido(a);
		return textoValido.charAt(0);
	}
	
	public static char ultimaLetra(String a) {
		String textValido = textoValido(a);
		return  textValido.charAt(textValido.length()-1);
	}
	
	
	public static String ajustarEspacios(String a) {
		String textValido = textoValido(a);
		return textValido.replaceAll("\\s+", " ");
		
	}
	public static int logitudTextoAjustado(String a) {
		String textoAjustado = ajustarEspacios(a);
		return textoAjustado.length();	
	}
	public static int cantidadPalabras(String a) {
		int contadorPalabras = 0;
		String textAjustado = ajustarEspacios(a);
		String [] palabras = textAjustado.split(" ");
		
		for (String palabra : palabras) {
			if(!palabra.isEmpty()) {
				contadorPalabras ++;
			}
		}
		return contadorPalabras;
	}
	public static String textoMinuscula(String a) {
		String textAjustado = ajustarEspacios(a);
		return textAjustado.toLowerCase();
	}
	public static String textoMayuscula(String a) {
		String textAjustado = ajustarEspacios(a);
		return textAjustado.toUpperCase();
	}
	public static String espacionPorGuiones(String a) {
		String textAjustado = ajustarEspacios(a);
		return textAjustado.replace(" ", "-");
	}
	public static int posicionPrimerEspacio(String a) {
		String textoAjustado = ajustarEspacios(a);
		int posicion = -1;

		for (int i=0; i<textoAjustado.length(); i++) {
			char caracter = textoAjustado.charAt(i);
			if(Character.isWhitespace(caracter)) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}
	public static String primeraPalabra(String a) {
		//Ajustar los espacion del texto
		String textoAjustado = ajustarEspacios(a);
		
		//Dividir el texto en palabras usando el espacio como delimitador
		String[] palabras = textoAjustado.split(" ");
		
		//Devolver la primera palabra si hay una palabra en el texto
		if(palabras.length>0) {
			return palabras[0];
		}
		return "";
	}
    public static int posicionUltimoEspacio(String a) {
        String textoAjustado = ajustarEspacios(a);
        int posicion = -1;

        for (int i = textoAjustado.length() - 1; i >= 0; i--) {
            char caracter = textoAjustado.charAt(i);
            if (Character.isWhitespace(caracter)) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    public static String ultimaPalabra(String a) {
    	String textoAjustado = ajustarEspacios(a);
    	
    	String[] palabras = textoAjustado.split(" ");
    	
    	for(int i=palabras.length-1; i>=0;) {
    		return palabras[i];
    	}
    	return "";
    }
    public static String sinPrimeraPalabra(String a) {
    	String textoAjustado = ajustarEspacios(a);
    	
    	 // Encontrar la posición del primer espacio
        int posicionPrimerEspacio = posicionPrimerEspacio(textoAjustado);

    	
        // Si no hay espacios, significa que hay una sola palabra o el texto está vacío
        if (posicionPrimerEspacio == -1) {
            return ""; // Devolver una cadena vacía si no hay más palabras
        }
        
        // Devolver la subcadena que comienza después del primer espacio
        return textoAjustado.substring(posicionPrimerEspacio + 1).trim();
    }
    public static String sinUltimaPalabra(String a) {
        // Ajustar los espacios del texto
        String textoAjustado = ajustarEspacios(a);

        // Encontrar la posición del último espacio
        int posicionUltimoEspacio = posicionUltimoEspacio(textoAjustado);

        // Si no hay espacios, significa que hay una sola palabra o el texto está vacío
        if (posicionUltimoEspacio == -1) {
            return ""; // Devolver una cadena vacía si no hay más palabras
        }

        // Devolver la subcadena que termina antes del último espacio
        return textoAjustado.substring(0, posicionUltimoEspacio).trim();
    }
    
    public static String primeraPalabraAlFinal(String a) {
        // Ajustar los espacios del texto
        String textoAjustado = ajustarEspacios(a);

        // Obtener la primera palabra
        String primeraPalabra = primeraPalabra(textoAjustado);

        // Obtener el texto sin la primera palabra
        String textoSinPrimeraPalabra = sinPrimeraPalabra(textoAjustado);

        // Si el texto está vacío o solo tiene una palabra, devolver el texto ajustado
        if (textoSinPrimeraPalabra.isEmpty()) {
            return textoAjustado;
        }

        // Combinar la parte restante del texto con la primera palabra al final
        return textoSinPrimeraPalabra + " " + primeraPalabra;
    }
    public static String ultimaPalabraAlInicio(String a) {
        // Ajustar los espacios del texto
        String textoAjustado = ajustarEspacios(a);

        // Encontrar la posición del último espacio
        int posicionUltimoEspacio = posicionUltimoEspacio(textoAjustado);

        // Si no hay espacios, significa que hay una sola palabra o el texto está vacío
        if (posicionUltimoEspacio == -1) {
            return textoAjustado; // Devolver el texto ajustado si no hay más palabras
        }

        // Extraer la última palabra
        String ultimaPalabra = textoAjustado.substring(posicionUltimoEspacio + 1);

        // Obtener el texto sin la última palabra
        String textoSinUltimaPalabra = textoAjustado.substring(0, posicionUltimoEspacio).trim();

        // Combinar la última palabra al inicio con la parte restante del texto
        return ultimaPalabra + " " + textoSinUltimaPalabra;
    }
}
