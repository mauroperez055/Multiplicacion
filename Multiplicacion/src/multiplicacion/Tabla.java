
package multiplicacion;


public class Tabla {
    
    Pasajero[] pas;

    public Tabla() {
        this.pas = new Pasajero[107];
    }
    
    public float parteDecimal (int clave){
        
        return (clave * 0.6180334f)-((float) Math.floor(clave * 0.6180334f));
        
    }
    
    public int multiplicacion (int clave){
        
        return (int) Math.floor(parteDecimal(clave) * 107);
        
    }
    
    public void insertar (Pasajero p){
        
        pas[multiplicacion(p.id)] = p;
        
    }
}
