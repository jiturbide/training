/*
 * Curso OCJP7
 * @author jiturbide
 * @date   30/12/2016
 */
package com.cert8.objective07;

public class TestFunctionalInterface {
    public static void main(String[] args) {
        System.out.println("Inicio del programa");
        
        BaseService service = new MailService();
        service.execute();
        
        service.printDescription();
                
        System.out.println("Fin del programa");
    }
}

@FunctionalInterface
interface BaseService {
    //Puede tener metodos estaticos y default y sigue siendo una interfaz funcional
    static void init() { System.out.println("Initializing service"); }
    public void execute();
    default void printDescription() { System.out.println("BaseService"); }

    // static {}; No puede tener inicializacores estaticos
}

class MailService implements BaseService{
    static { 
        //init(); Si hay un metodo estatico en la base, se debe usar todo el nombre de la clase
        BaseService.init();
        MailService.init();
    }
    
    static void init() { System.out.println("Initializing mail service"); }
    
    @Override
    public void execute() {
        printDescription();
        System.out.println("Executing");
    }
    
    public void printDescription() { 
        System.out.println("Descripcion MailService"); 
    }
}