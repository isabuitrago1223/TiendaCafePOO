**TiendaCafePOO**

Proyecto académico en Java utilizando Programación Orientada a Objetos (POO) y estructura Maven, que simula una tienda de café colombiano.
Incluye el uso de clases, objetos, atributos, métodos y una clase principal encargada de ejecutar la aplicación.

**Descripción**

Este proyecto representa una tienda de café colombiano, donde cada producto (café) tiene:

Nombre
Región de origen
Precio por kilo
Cantidad disponible en kilos
Se aplican conceptos de POO como:

✔ Clases
✔ Objetos
✔ Encapsulación
✔ Métodos y lógica interna

🔹 Clases del Proyecto
**Clase Cafe**
- Representa un producto de café colombiano.
Incluye:
- Constructor
- Método mostrarInformacion()
- Método calcularPrecioTotal()
- Método actualizarCantidad(double nuevaCantidad)

**Clase TiendaCafe**
- Contiene la lógica de la tienda:
- Crea varios objetos Cafe
- Muestra información de cada café
- Calcula el precio total
- Actualiza cantidades
- Organiza la ejecución mediante el método ejecutar()

**Clase Main**

Clase principal del proyecto.
Solo se encarga de ejecutar la tienda:

public static void main(String[] args) {
    TiendaCafe tienda = new TiendaCafe();
    tienda.ejecutar();
}

