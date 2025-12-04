package com.tiendacafe;

public class Cafe {

    private String nombre;
    private String region;
    private double precioPorKilo;
    private double cantidadEnKilos;

    // Constructor
    public Cafe(String nombre, String region, double precioPorKilo, double cantidadEnKilos) {
        this.nombre = nombre;
        this.region = region;
        this.precioPorKilo = precioPorKilo;
        this.cantidadEnKilos = cantidadEnKilos;
    }

    // Mostrar información
    public void mostrarInformacion() {
        System.out.println("Café: " + nombre);
        System.out.println("Región: " + region);
        System.out.println("Precio por kilo: " + precioPorKilo);
        System.out.println("Cantidad disponible (kg): " + cantidadEnKilos);
        System.out.println("-----------------------------------");
    }

    // Calcular precio total
    public double calcularPrecioTotal() {
        return precioPorKilo * cantidadEnKilos;
    }

    // Actualizar cantidad
    public void actualizarCantidad (double nuevaCantidad) {
        this.cantidadEnKilos = nuevaCantidad;
    }

    // NUEVO MÉTODO – aplicar descuento
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Porcentaje inválido. Debe estar entre 0 y 100.");
            return;
        }

        double descuento = precioPorKilo * (porcentaje / 100);
        precioPorKilo -= descuento;

        System.out.println("Se aplicó un descuento del " + porcentaje + "%.");
        System.out.println("Nuevo precio por kilo: " + precioPorKilo);
    }

    // Getters y setters opcionales
    public String getNombre () {
        return nombre;
    }

    public String getRegion() {
        return region;
    }

    public double getPrecioPorKilo() {
        return precioPorKilo;
    }

    public double getCantidadEnKilos() {
        return cantidadEnKilos;
    }
}
