import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear una instancia de OperacionesMatGen para Integer y Double
        OperacionesMatGen<Integer> operacionesInteger = new OperacionesMatGen<>();
        OperacionesMatGen<Double> operacionesDouble = new OperacionesMatGen<>();
        
        // Variable para seleccionar el tipo de número (Integer o Double)
        int tipoDato;
        
        // Menú para seleccionar el tipo de datos
        System.out.println("Seleccione el tipo de dato con el que quiera trabajar:");
        System.out.println("Entero (Integer) --------> 1");
        System.out.println("Decimal (Double) --------> 2");
        System.out.print("Ingrese su opcion: ");
        tipoDato = scanner.nextInt();
        
        // Menú de operaciones
        int opcion;
        while (true) {
            System.out.println("\n -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-. ");
            System.out.println("\nMenu de Operaciones:");
            System.out.println("Suma --------------------> 1");
            System.out.println("Resta -------------------> 2");
            System.out.println("Producto ----------------> 3");
            System.out.println("Division ----------------> 4");
            System.out.println("Potencia ----------------> 5");
            System.out.println("Raiz Cuadrada -----------> 6");
            System.out.println("Raiz Cubica -------------> 7");
            System.out.println("Salir -------------------> 8");
            System.out.println("\n -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-. ");
            System.out.print("Ingrese su opcion: ");
            opcion = scanner.nextInt();
            
            
            if (opcion == 8) {
                System.out.println("--- SALIENDO ---");
                break;  // Salir del bucle y terminar el programa
            }

            // Operaciones y entrada de números según el tipo de dato seleccionado
            if (tipoDato == 1) {  // Para Integer
                System.out.print("Ingrese el primer numero entero: ");
                Integer num1 = scanner.nextInt();
                System.out.print("Ingrese el segundo numero entero: ");
                Integer num2 = scanner.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.println("Resultado de la Suma: " + operacionesInteger.suma(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado de la Resta: " + operacionesInteger.resta(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado del Producto: " + operacionesInteger.producto(num1, num2));
                        break;
                    case 4:
                        System.out.println("Resultado de la Division: " + operacionesInteger.division(num1, num2));
                        break;
                    case 5:
                        System.out.println("Resultado de la Potencia: " + operacionesInteger.potencia(num1, num2));
                        break;
                    case 6:
                        System.out.println("Resultado de la Raiz Cuadrada: " + operacionesInteger.raizCuadrada(num1));
                        break;
                    case 7:
                        System.out.println("Resultado de la Raiz Cubica: " + operacionesInteger.raizCubica(num1));
                        break;
                    default:
                        System.out.println("OPCION INVALIDA");
                        break;
                }
            } else if (tipoDato == 2) {  // Para Double
                System.out.print("Ingrese el primer numero decimal: ");
                Double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo numero decimal: ");
                Double num2 = scanner.nextDouble();
                
                switch (opcion) {
                    case 1:
                        System.out.println("Resultado de la Suma: " + operacionesDouble.suma(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado de la Resta: " + operacionesDouble.resta(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado del Producto: " + operacionesDouble.producto(num1, num2));
                        break;
                    case 4:
                        System.out.println("Resultado de la Division: " + operacionesDouble.division(num1, num2));
                        break;
                    case 5:
                        System.out.println("Resultado de la Potencia: " + operacionesDouble.potencia(num1, num2));
                        break;
                    case 6:
                        System.out.println("Resultado de la Raiz Cuadrada: " + operacionesDouble.raizCuadrada(num1));
                        break;
                    case 7:
                        System.out.println("Resultado de la Raiz Cubica: " + operacionesDouble.raizCubica(num1));
                        break;
                    default:
                        System.out.println("OPCION INVALIDA");
                        break;
                }
            } else {
                System.out.println("Opcion de tipo de dato invalida");
                break;  // Salir si la opción de tipo de dato es incorrecta
            }
        }
        
        scanner.close();  // Cerrar el scanner al finalizar
    }
}

