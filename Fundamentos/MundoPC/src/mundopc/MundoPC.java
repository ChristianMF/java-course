
package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    
    public static void main(String[] args) {
        
        Orden orden1 = new Orden();
        
        Computadora cpmutadora1 = new Computadora("Escritorio", "Mac", 15, "USB", "Xerox", "BlueTooth", "Microdoft");
        
        orden1.agregarComputadora(cpmutadora1);
        orden1.mostrarOrden();
        
    }
    
}
