package clases;

/**
 * Clase Cilindro
 */
public class Cilindro {

private int radio;
private int altura;

/**
 * Crea un Cilindro con los parámetros introducidos
 * 
 * @param radio en centímetros
 * @param altura en centímetros
 */
public Cilindro (int radio, int altura) {
	this.radio = radio;
	this.altura = altura;
}

/**
 * Crea un cilindro de radio 1 y altura 1 en centímetros
 * 
 */
public Cilindro() {
	this.radio = 1;
	this.altura = 1;
}

/**
 * Calcula la superficie del cilindro
 * 
 * @return Devuelve la superficie del cilindro en centimetros cuadrados
 */
public double superficie() {
	return (2 * 3.14 * (this.radio*this.radio)) + (2*3.14*this.radio*this.altura);
}

/**
 * Calcula el volumen de un cilindro
 * 
 * @return Devuelve el volumen en centímetros cúbicos
 */
public double volumen() {
	return (3.14* (this.radio*this.radio)) * this.altura;
}
}
