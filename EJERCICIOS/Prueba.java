public class Prueba {
    public static void main(String[] args){
        OperacionesMatInteger operacionesInt = new OperacionesMatInteger();
        System.out.println("Suma de Enteros -----------------> "+ operacionesInt.suma(1,100));
        System.out.println("Resta de Enteros ----------------> "+ operacionesInt.resta(100,5));
        System.out.println("Division de Enteros -------------> "+ operacionesInt.division(10,2));
        System.out.println("Multiplicacion de Enteros -------> "+ operacionesInt.producto(20,3));
        
        OperacionesMatDouble operacionesDouble = new OperacionesMatDouble();
        System.out.println("Suma de Doubles -----------------> "+ operacionesDouble.suma(1.5, 2.5));
        System.out.println("Resta de Doubles ----------------> "+ operacionesDouble.resta(5.0, 2.0));
        System.out.println("Division de Doubles -------------> "+ operacionesDouble.division(5.0, 2.0));
        System.out.println("Multiplicacion de Doubles -------> "+ operacionesDouble.producto(5.0, 2.0));
    }
}
