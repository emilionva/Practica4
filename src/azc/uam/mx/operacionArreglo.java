/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package azc.uam.mx;

/**
 * Clase OperacionArreglo donde se declaran los metodos
 * @author Equipo 6
 * @version 1.0
 */
public class operacionArreglo {
    /**
     * Este metodo verifica que el arreglo no este vacio, despues recorre todo el arreglo
     * sumando cada entero y al final, la suma la divide entre el tamaño del arreglo
     * @param arreglo de numeros enteros
     * @return promedio de la suma de cada entero del arreglo
     */
    public double calcularPromedio(int []arreglo){
        if (arreglo == null || arreglo.length == 0) {
            System.out.println("El arreglo no puede estar vacio");
        }
       
        int suma = 0;
       
        for (int numero : arreglo) {
            suma += numero;
        }
       
        double promedio = (double) suma / arreglo.length;
        return promedio;
    }
   
    /**
     * Este metodo verifica que el arreglo no este vacio y calcula el promedio de los
     * enteros del arreglo, despues recorre el arreglo desde el inicio comparando
     * cada entero con el promedio y crea al final un arreglo donde inserta los enteros
     * mayores al promedio
     * @param arreglo de numeros enteros
     * @return arreglo que guarda los numeros mayores al promedio
     */
    public int[] obtenerMayoresPromedio(int []arreglo){
        if (arreglo == null || arreglo.length == 0) {
            System.out.println("El arreglo no puede estar vacio");
        }

        double promedio = calcularPromedio(arreglo);

        int contador = 0;
        for (int numero : arreglo) {
            if (numero > promedio) {
                contador++;
            }
        }

        int[] numerosMayores = new int[contador];
        int indice = 0;

        for (int numero : arreglo) {
            if (numero > promedio) {
                numerosMayores[indice] = numero;
                indice++;
            }
        }

        return numerosMayores;
       
    }
   
    /**
     * Este metodo verifica que el arreglo no este vacio y recorre el arreglo hasta
     * el lugar indicado y procede a insertar el nuevo entero indicado
     * @param arreglo de numeros enteros
     * @param entero numero que se insertara en el arreglo
     * @param pos posicion en la que se insertara el numero entero
     * @return arreglo que guarda los numeros enteros del anterior arreglo mas
     * el nuevo elemento que se inserto
     */
    public int[] insertar(int []arreglo, int entero, int pos){
       if (pos < 0 || pos > arreglo.length) {
            System.out.println("La posisicon esta fuera del arreglo");
        }

        int[] nuevoArreglo = new int[arreglo.length + 1];

        for (int i = 0; i < pos; i++) {
            nuevoArreglo[i] = arreglo[i];
        }

        nuevoArreglo[pos] = entero;

        for (int i = pos; i < arreglo.length; i++) {
            nuevoArreglo[i + 1] = arreglo[i];
        }

        return nuevoArreglo;
    }
   
    /**
     * Este metodo verifica que que el arreglo no este vacio y recorre el arreglo
     * hasta la posicion seleccionada y verifica con cada posicion del elemento del arreglo
     * y verifica si el residuo es distinto de 2 o 0 para elminarlo del arreglo
     * @param arreglo de numeros enteros
     * @param posicion posicion donde se empezara a contar 
     * @return suma de los elementos enteros impares del arreglo
     */
    public int sumarPosicionesImpares(int[] arreglo, int posicion){
       if (posicion < 0 || posicion >= arreglo.length) {
            throw new IllegalArgumentException("La posición está fuera del arreglo");
        }

        int suma = 0;

        for (int i = posicion; i < arreglo.length; i++) {
            if (i % 2 != 0) { 
                suma += arreglo[i];
            }
        }

        return suma;
    }
   
    /**
     * Este metodo ordena de menor a mayor los elementos enteros de un arreglo
     * mediante el algoritmo de insercion simple
     * @param arreglo de numeros enteros
     * @return arreglo ordenado de menor a mayor
     */
    public int[] ordenar(int []arreglo){
        int i, j;
        int actual;

        for (i = 1; i < arreglo.length; i++) {
            actual = arreglo[i];
            for (j = i; j > 0 && arreglo[j - 1] > actual; j--) {
                arreglo[j] = arreglo[j - 1];
            }
            arreglo[j] = actual;
        }

        return arreglo;
    }
}
