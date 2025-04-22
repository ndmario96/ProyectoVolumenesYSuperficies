package clases;
/**
 * Clase cubo
 */
public class Cubo {


private int lado;

/**
 * Crea un Cubo con el parámetro (lado) especificado en centímetros
 * 
 * @param lado en centimetros
 */
public Cubo (int lado) {
	this.lado = lado;
}

/**
 * Crea un Cubo con lado de 1 centímetro
 * 
 */
public Cubo () {
	this.lado = 1;
}

/**
 * Calcula la superficie del cubo
 * 
 * @return La superficie es en centímetros cuadradados
 */

public double superficie() {
	return 6 * (this.lado*this.lado);
}


/**
 * Calcula el volumen del cubo 
 * 
 * @return El resultado es en centímetros cúbicos
 */

public double volumen() {
	return this.lado*this.lado*this.lado;
}


}
