package dad.maven.prueba;

import org.apache.commons.lang.StringUtils;

public class Combinar {
	
	public static String combinar(Object [] array) {
		
		return StringUtils.join(array," ");
		
//		StringBuilder sc= new StringBuilder();
//	     int contador=0;
//	     for (Object i:array) {
//	         sc.append(array[contador++].toString()+" ");
//	      }
//
//	   return sc.toString();
	}

	public static void main(String[] args) {
		Object[] array = {"hola", 3.1426, "adios", 4, true};
		String resultado = combinar(array);
		System.out.println(resultado);

	}

}
