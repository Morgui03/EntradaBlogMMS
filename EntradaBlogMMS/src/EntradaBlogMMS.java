/** Clase para manejar las entradas de un blog.
 * 
 * @author Morgana Morales
 * @since 14/03/2021
 * @version 2.3
 */

public class EntradaBlogMMS {
	
	/**
	 * Separador es el car�cter que separa ENTRADA DE del nombre del autor
	 */
	
	public static char separador = ':';
	private int id;
	private String texto;
	private String autor;
	
	/**
	 * Constructor de la clase.
	 * @param id - recibe el n�mero de entrada
	 * @param autor - recibe el nombre del autor
	 * @param texto - texto que contiene la entrada
	 * @trows IllegalArgumentException - Si el n�mero de entrada es negativo, lanza una excepci�n.
	 */
	
	public EntradaBlogMMS(int id, String autor, String texto) throws IllegalArgumentException{
		if(id<=0)
			throw new IllegalArgumentException("El id no puede ser negativo");
		this.id = id;
		this.autor = autor;
		this.texto = texto;
	}
	
	@Override
	public String toString(){
		String cad="";
		cad += "\nENTRADA DE" + separador + autor;
		cad += "\n "+ texto;
		return cad;
	}
	
	/** 
	 * @return id - Devuelve el n�mero de la entrada 
	 */
	public int getId(){
		return this.id;
	}
	
	/** 
	 * @return texto - Devuelve el texto completo de la entrada
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/** 
	 * @return autor - Devuelve el nombre del autor de la entrada en may�sculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/** 
	 * @return autor - Devuelve el nombre del autor
	 * @deprecated
	 * @see getAutor()
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * M�todo main
	 * @param args - No tiene porqu� tener argumentos
	 */
	public static void main(String[] args) {
		EntradaBlogMMS e1 = new EntradaBlogMMS (3," MORGANA MORALES SAGASTA","�ltimas noticias, est� disponible BixBy 2.0");
		System.out.println(e1);
	}
}