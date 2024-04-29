// Trabajas para una tienda de informática y te encargan crear una base de datos para los nuevos ordenadores que van llegando.

// Necesitas crear el objeto Ordenador, con sus atributos correspondientes: marca, modelo, memoria RAM, capacidad del disco duro, precio ... etc (cantidad y tipo de  atributos a tu gusto, pero poner al menos 3).

// Debes añadir el método constructor, los getters y setters y el toString(). Recuerda no hacer copiar y pegar, ni buscar ningún método de generación de código automático. Hay que pensar y practicar, al menos por hoy!

// Siéntete libre de modificar el toString a tu gusto.

// Una vez definida la clase del ordenador, crea al menos 3 instancias y prueba a imprimir los objetos en dos maneras:

// 1. Todas sus características OK

// 2. Imprime solo características sueltas como la marca y el precio del ordenador elegido.

// 3. Probar a cambiar una propiedad y volver a mostrarla


public class Java9ejercicio1 {
    public static void main(String[] args) throws Exception {

        // creamos las 3 instancias:
        
        Ordenador ordenador1 = new Ordenador("Dell", "XPS15", 16, 512, 1599);
        Ordenador ordenador2 = new Ordenador("HP", "Spectre x360", 8, 256, 1199);
        Ordenador ordenador3 = new Ordenador("Apple", "MacBook Air", 8, 256, 999);

        // mostramos el objeto al completo, mostrando todas las caracteristicas:

        System.out.println("Marca: " + ordenador1.getMarca() + ", modelo: " + ordenador1.getModelo() + ", memoria RAM: " + ordenador1.getMemoriaRam() + ", capacidad de disco duro: " + ordenador1.getCapacidadDisco() + ", precio: " + ordenador1.getPrecio() + " dolares.");

        System.out.println("Marca: " + ordenador2.getMarca() + ", modelo: " + ordenador2.getModelo() + ", memoria RAM: " + ordenador2.getMemoriaRam() + ", capacidad de disco duro: " + ordenador2.getCapacidadDisco() + ", precio: " + ordenador2.getPrecio() + " dolares.");

        System.out.println("Marca: " + ordenador3.getMarca() + ", modelo: " + ordenador3.getModelo() + ", memoria RAM: " + ordenador3.getMemoriaRam() + ", capacidad de disco duro: " + ordenador3.getCapacidadDisco() + ", precio: " + ordenador3.getPrecio() + " dolares.");

        // imprimimos SOLO la marca:

        System.out.println(ordenador1.getMarca());
        System.out.println(ordenador2.getMarca());
        System.out.println(ordenador3.getMarca());

        // imprimimos SOLO el precio:

        System.out.println(ordenador1.getPrecio());
        System.out.println(ordenador2.getPrecio());
        System.out.println(ordenador3.getPrecio());

        // cambiamos propiedad y la volvemos a mostrar:

        ordenador1.setMarca("HP");
        ordenador2.setMarca("Dell");
        ordenador3.setMarca("Lenovo");

        System.out.println(ordenador1.toString());
        System.out.println(ordenador2.toString());
        System.out.println(ordenador3.toString());
        
    }
}
