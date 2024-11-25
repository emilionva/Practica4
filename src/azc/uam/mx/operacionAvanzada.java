/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package azc.uam.mx;

/**
 * Clase que contiene métodos matemáticos avanzados para diversas operaciones.
 * @author Equipo 6
 * @version 1.0
 */
public class operacionAvanzada {
    /**
     * Calculadora de base "a" elevado a la "b" potencia.
     * @param a Base de la potencia
     * @param b Exponente de la potencia
     * @return  Resultado de "a" elevado a la "b" potencia.
     */
    public static int elevarPotencia(int a, int b){
    int resultado = 1;
    for (int i = 0; i<b; i++){
    resultado *=a;
    }
    return resultado;
    }
    /**
     * Validacion para saber si dos números son amigos.
     * @param num1 Primer número a validar con num2
     * @param num2 Segundo número a validar con num1
     * @return verdadero (true) si los números son amigos , falso (false) si los números no son amigos.
     */
    public static boolean validarAmigos(int num1, int num2){
    return (sumarDivisores(num1)==(num2))&&(sumarDivisores(num2)==(num1));
    }
    /**
     * Metodo para sumar los divisores propios de un número.
     * @param num Número al cual se le van a sumar los divisores propios.
     * @return Suma de los divisores propios del número.
     */
    private static int sumarDivisores(int num) {
        int suma = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
    /**
     * Calcula el n-ésimo término de la secuencia de Fibonacci.
     * @param n Índice del término de la secuencia de Fibonacci.
     * @return El n-ésimo término de la secuencia de Fibonacci.
     */
    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int prev1 = 0, prev2 = 1;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = prev1 + prev2;
            prev1 = prev2;
            prev2 = result;
        }
        return result;
    }
    /**
     * Calcula las soluciones de una ecuación cuadrática de la forma ax^2 + bx + c.
     *
     * @param a Coeficiente cuadrático.
     * @param b Coeficiente lineal.
     * @param c Término independiente.
     * @return Una cadena que describe las soluciones de la ecuación cuadrática.
     */
    public static String calcularEcuaciones(int a, int b, int c) {
        int discriminante = b * b - 4 * a * c;
        if (discriminante < 0) {
            return "No tiene soluciones reales";
        } else if (discriminante == 0) {
            double x = -b / (2.0 * a);
            return "Una solucion: x = " + x;
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2.0 * a);
            return "Dos soluciones: x1 = " + x1 + ", x2 = " + x2;
        }
    }
    /**
     * Verifica si un número es un número Armstrong.
     * Un número es Armstrong si la suma de sus dígitos elevados a la potencia del número de dígitos es igual al número mismo.
     * @param num Número a verificar.
     * @return verdadero (true) si el número es Armstrong, falso (false) en caso contrario.
     */
    public static boolean validarAmstrong(int num) {
        int suma = 0, temp = num;
        int n = Integer.toString(num).length();
        while (temp > 0) {
            int digito = temp % 10;
            suma += Math.pow(digito, n);
            temp /= 10;
        }
        return suma == num;
    }
}
