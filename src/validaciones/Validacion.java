package validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {


	public static boolean validarTelefono(String tfn) {
		return tfn.trim().chars().allMatch(Character::isDigit);
	}


	public static boolean validarNombre(String nombre) {

		Pattern patron = Pattern.compile("[ A-Za-zñÑáéíóúÁÉÍÓÚäëïöüÄËÏÖÜ-]{3,50}");
		Matcher comprobacion = patron.matcher(nombre);
		return comprobacion.matches();//
	}	
	
	
	
}
