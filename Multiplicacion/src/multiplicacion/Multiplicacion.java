
package multiplicacion;

public class Multiplicacion {

    public static void main(String[] args) {
        
        Pasajero p1 = new Pasajero (1010, "Pasajero 1");
        Pasajero p2 = new Pasajero (2012, "Pasajero 1");
        Pasajero p3 = new Pasajero (3053, "Pasajero 1");

        
        Tabla tHash;
        tHash = new Tabla();
        tHash.insertar(p1);
        tHash.insertar(p2);
        tHash.insertar(p3);

        System.out.println("El " + p1.nombre + " ocupa el asiento " + tHash.multiplicacion(p1.id));
        System.out.println("---------------------------------------------------------");
        System.out.println("El " + p2.nombre + " ocupa el asiento " + tHash.multiplicacion(p2.id));
        System.out.println("---------------------------------------------------------");
        System.out.println("El " + p3.nombre + " ocupa el asiento " + tHash.multiplicacion(p3.id));
        System.out.println("---------------------------------------------------------");
    }
    
}
