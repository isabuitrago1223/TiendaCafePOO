package com.tiendacafe;

public class TiendaCafe {

    public void ejecutar() {

        Cafe c1 = new Cafe("Café de Nariño", "Nariño", 35000, 5);
        Cafe c2 = new Cafe("Café de Antioquia", "Antioquia", 30000, 3);
        Cafe c3 = new Cafe("Café del Huila", "Huila", 40000, 4);

        c1.mostrarInformacion();
        System.out.println("Total: " + c1.calcularPrecioTotal());

        c2.mostrarInformacion();
        System.out.println("Total: " + c2.calcularPrecioTotal());

        c3.mostrarInformacion();
        System.out.println("Total: " + c3.calcularPrecioTotal());

        c3.actualizarCantidad(10);
        System.out.println("\nCantidad actualizada:");
        c3.mostrarInformacion();
    }
}
