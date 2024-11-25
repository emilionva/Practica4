/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package azc.uam.mx;
import java.util.HashMap;
/**
 * Clase operacionCadena donde se declaran los metodos
 * @author Equipo 6
 * @version 1.0
 */
public class operacionCadena {
    /**
     * Método que cuenta cuantos caracteres son iguales entre dos cadenas
     * @param cad1 Cadena número 1 a comparar
     * @param cad2 Cadena número 2 a comparar
     * @return entero del numero de caracteres
     */
    public int contarCoincidentes(String cad1, String cad2){
        int longitudMin = Math.min(cad1.length(), cad2.length());
        int cont=0;
        for(int i=0; i<longitudMin;i++){
            if(cad1.charAt(i) == cad2.charAt(i)){
                cont++;
            }
        }
        return cont;
    }
    
    /**
     * Método que calcule la similitud total entre dos cadenas y regrese
     * el valor similitud en decimales con 3 cifras.
     * @param cad1 Primer cadena a comparar
     * @param cad2 Segunda cadena a comparar
     * @return resultado al dividir el contador entre el numero de digitos
     * de la cadena más larga
     */
    public double calcularSimilitud(String cad1, String cad2){
        int longitudMin = Math.min(cad1.length(), cad2.length());
        int cont=0;
        for(int i=0; i<longitudMin;i++){
            if(cad1.charAt(i) == cad2.charAt(i)){
                cont++;
            }
        }
        return (double) cont/Math.max(cad1.length(), cad2.length());
    }
    
    /**
     * Método que reciba una cadena y reemplace todos los caracteres con vocales
     * A, E, I, O  por números 4,3,1,0, devolviendo la cadena resultante.
     * @param cad Cadena a reemplazar sus caracteres
     * @return nueva cadena con los caracteres reemplazados
     */
  public String reemplazarVocales(String cad) {
        
        HashMap<Character, Character> reemplazos = new HashMap<>();
        reemplazos.put('A', '4');
        reemplazos.put('E', '3');
        reemplazos.put('I', '1');
        reemplazos.put('O', '0');

        StringBuilder resultado = new StringBuilder();

        
        for (int i = 0; i < cad.length(); i++) {
            char c = cad.charAt(i);
            
            if (reemplazos.containsKey(c)) {
                
                resultado.append(reemplazos.get(c));
            } else {
                
                resultado.append(c);
            }
        }
        return resultado.toString();
    }
    
    /**
     * Método que reciba una cadena y devuelva el número de
     * letras minusculas que hay dentro de la cadena.
     * @param cad cadena a la que se le contarán las minusculas
     * @return el nuúmero de minusculas en la cadena
     */
    public int contarMinusculas(String cad){
        int cont=0;
        for (int i=0; i<cad.length(); i++){
            char caracter = cad.charAt(i);
            if(Character.isLowerCase(caracter)){
                cont++;
            }
        }
        
        return cont;
    }
    
    /**
     * Método que reciba una cadena y devuelva el número de consonates
     * que hay dentro de la cadena.
     * @param cadena cadena a la que se le contaran las consonantes
     * @return el número de consonantes dentro de la cadena
     */
    
        public int contarConsonantes(String cadena) {
        // Definimos un conjunto de consonantes
        String consonantes = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        int contador = 0;

        // Recorremos cada carácter de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            // Verificamos si el carácter es una consonante
            if (consonantes.indexOf(c) != -1) {
                contador++;
            }
        }

        return contador;
    }
    
    /**
     * Método que reciba una cadena y valide si dicha cadena es un palíndromo.
     * @param cad Cadena a saber si es un palíndromo
     * @return booleano que determina si la cadena es un palíndromo
     */
    public boolean esPalinromo(String cad){
        String cadena = cad.toLowerCase();
        cadena = cadena.replaceAll(" ", "");
        for (int i=0; i<cadena.length()/2; i++){
            if(cadena.charAt(i) != cadena.charAt(cadena.length()-1-i)){
                return false;
            }
        }
        return true;
    }

}
