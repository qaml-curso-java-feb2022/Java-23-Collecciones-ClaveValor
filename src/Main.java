import java.util.*;

public class Main {
    public static void main(String ... args){

        // HashMap almacena los datos en una pareja de Clave(Índice)/Valor (Key/Value pair)
        // No se pueden almacenar datos con Claves repetidas.
        // Puede aceptar un dato con una Clave null.
        // NO GARANTIZA EL ORDENAMIENTO DE LOS DATOS
        System.out.println("HASHMAP:");
        HashMap<Integer, String> frutasEnHashMap = new HashMap<>(2);
        frutasEnHashMap.put(1, "Sandía");
        frutasEnHashMap.put(2, "Melón");
        frutasEnHashMap.put(null, "Fruta Desconocida");
        frutasEnHashMap.put(93, "Pitaya");
        frutasEnHashMap.put(74, "Naranja");
        frutasEnHashMap.put(35, "Naranja");
        frutasEnHashMap.put(26, "Aguacate");
        frutasEnHashMap.put(26, "Mango");

        System.out.println("Las frutas son: " + frutasEnHashMap);
        System.out.println("Reemplazamos a la fruta en la Clave 1 con 'Mandarina': " + frutasEnHashMap.replace(1, "Mandarina"));
        System.out.println("Y quitaremos la que tiene la Clave 2: " + frutasEnHashMap.remove(2));
        System.out.println("La lista actual de frutas es: ");
        for (Map.Entry<Integer, String> fruta : frutasEnHashMap.entrySet()) {
            System.out.println("Key (Clave): " +  fruta.getKey() + " Value (Valor):" + fruta.getValue());
        }
        System.out.println();

        // TreeMap almacena los datos en una pareja de Clave(Índice)/Valor (Key/Value pair)
        // No se pueden almacenar datos con Claves repetidas.
        // No puede aceptar un dato con una Clave null.
        // GARANTIZA EL ORDENAMIENTO DE LOS DATOS POR MEDIO DE SU ÍNDICE
        System.out.println("TREEMAP:");
        TreeMap<Integer, String> frutasEnTreeMap = new TreeMap<>();
        frutasEnTreeMap.put(1, "Sandía");
        frutasEnTreeMap.put(2, "Melón");
        frutasEnHashMap.put(null, "Fruta Desconocida");
        frutasEnTreeMap.put(93, "Pitaya");
        frutasEnTreeMap.put(74, "Naranja");
        frutasEnTreeMap.put(35, "Naranja");
        frutasEnTreeMap.put(26, "Aguacate");
        frutasEnTreeMap.put(26, "Mango");

        System.out.println("Las frutas son: " + frutasEnTreeMap);
        System.out.println("Reemplazamos a la fruta en la Clave 1 con 'Mandarina': " + frutasEnTreeMap.replace(1, "Mandarina"));
        System.out.println("Y quitaremos la que tiene la Clave 2: " + frutasEnTreeMap.remove(2));
        System.out.println("La lista actual de frutas es: ");
        for (Map.Entry<Integer, String> fruta : frutasEnTreeMap.entrySet()) {
            System.out.println("Key (Clave): " +  fruta.getKey() + " Value (Valor):" + fruta.getValue());
        }
        System.out.println();

        // LinkedHashMap almacena los datos en una pareja de Clave(Índice)/Valor (Key/Value pair)
        // No se pueden almacenar datos con Claves repetidas.
        // No puede aceptar un dato con una Clave null.
        // GARANTIZA EL ORDENAMIENTO DE LOS DATOS POR MEDIO DEL ORDEN DE INSERCIÓN
        System.out.println("LINKEDHASHMAP:");
        LinkedHashMap<Integer, String> frutasEnLinkedHashMap = new LinkedHashMap<>(2);
        frutasEnLinkedHashMap.put(1, "Sandía");
        frutasEnLinkedHashMap.put(2, "Melón");
        frutasEnHashMap.put(null, "Fruta Desconocida");
        frutasEnLinkedHashMap.put(93, "Pitaya");
        frutasEnLinkedHashMap.put(74, "Naranja");
        frutasEnLinkedHashMap.put(35, "Naranja");
        frutasEnLinkedHashMap.put(26, "Aguacate");
        frutasEnLinkedHashMap.put(26, "Mango");

        System.out.println("Las frutas son: " + frutasEnLinkedHashMap);
        System.out.println("Reemplazamos a la fruta en la Clave 1 con 'Mandarina': " + frutasEnLinkedHashMap.replace(1, "Mandarina"));
        System.out.println("Y quitaremos la que tiene la Clave 2: " + frutasEnLinkedHashMap.remove(2));
        System.out.println("La lista actual de frutas es: ");
        for (Map.Entry<Integer, String> fruta : frutasEnLinkedHashMap.entrySet()) {
            System.out.println("Key (Clave): " +  fruta.getKey() + " Value (Valor):" + fruta.getValue());
        }
        System.out.println();
    }
}
