package vehiculo;

import java.util.Scanner;

/**
 * 2. Crea la clase Vehiculo , así como las clases Bicicleta y Coche
 *    como subclases de la primera. Para la clase Vehiculo , crea los
 *    atributos de clase vehiculosCreados y kilometrosTotales , así como
 *    el atributo de instancia kilometrosRecorridos . Crea también algún
 *    método específico para cada una de las subclases. Prueba las
 *    clases creadas mediante un programa con un menú como el que se
 *    muestra a continuación:
 *    VEHÍCULOS
 *    =========
 *    1. Anda con la bicicleta
 *    2. Haz el caballito con la bicicleta
 *    3. Anda con el coche
 *    4. Quema rueda con el coche
 *    5. Ver kilometraje de la bicicleta
 *    6. Ver kilometraje del coche
 *    7. Ver kilometraje total
 *    8. Salir
 *    Elige una opción (1-8):
 * 
 */
public class PruebaVehiculos {

  public static void main(String[] args) {

    int opcion = 0;
    int km;
    Scanner sc= new Scanner(System.in);
    
    Bicicleta bhSpeedrom = new Bicicleta(9);
    Coche saab93 = new Coche(1900);

    while (opcion != 8) {
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8): ");
      
      opcion = sc.nextInt();
      
      switch (opcion) {
        case 1:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = sc.nextInt();
          bhSpeedrom.recorre(km);
          break;
        case 2:
          bhSpeedrom.hazCaballito();
          break;
        case 3:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = sc.nextInt();
          saab93.recorre(km);
          break;
        case 4:
          saab93.quemaRueda();
          break;
        case 5:
          System.out.println("La bicicleta lleva recorridos ");
          System.out.println(bhSpeedrom.getKilometrosRecorridos() + " Km");
          break;
        case 6:
          System.out.println("El coche lleva recorridos ");
          System.out.println(saab93.getKilometrosRecorridos() + " Km");
          break;
        case 7:
          System.out.println("Los vehículos llevan recorridos ");
          System.out.println(Vehiculo.getKilometrosTotales() + " Km");
        default:
      } // switch
    } // while
  }
}//otros cambios en mi rama
