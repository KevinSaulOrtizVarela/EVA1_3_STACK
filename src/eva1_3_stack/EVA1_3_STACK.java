
package eva1_3_stack;

/**
 *
 * @author 16550549
 */
public class EVA1_3_STACK {

    public static void main(String[] args) {    
       
    }
    public static void A(){
        System.out.println("Llamando a B");
        B();
        System.out.println("Termino llamada a B");
    }
    public static void B(){
        System.out.println("Llamando a C");
        C();
        System.out.println("Termino llamada a C");
    }
    public static void C(){
        System.out.println("Fin del camino");
    }
    
}
