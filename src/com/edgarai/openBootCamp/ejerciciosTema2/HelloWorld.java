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
     * Función principal. Ejecuta e imprime un ejemplo de la función calcularPrecioConIVA.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        float amount = 25f;
        float total = calcularPrecioConIVA(amount);
        String msg = "El precio completo de un producto que sin IVA vale %.2f€ es: %.2f".formatted(amount, total);
        System.out.println(msg);
    }
}
