package com.edgarai.openBootCamp.ejerciciosTema2;

public class HelloWorld {

    /**
     * Función que devuelve el precio con el IVA incluido.
     * @param amount Precio neto a partir del cual calcular el total (IVA incluido)
     */
    static float calcularPrecioConIVA(float amount) {
        return amount * 1.21f;
    }

    /**
     * Función principal. Simplemente imprime 'Hello World!'
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
