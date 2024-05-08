import java.util.Scanner;

public class Menu {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String op;
    do {
      System.out.println("=============");
      System.out.println("1. Opción 1");
      System.out.println("2. Opción 2");
      System.out.println("Salir");
      System.out.println("=============");
      System.out.println("Selecciona una opción:");
      op = sc.nextLine();

      if (op.equals("1") || op.equals("2")) {
        System.out.printf("Elegiste la opción %s\n", op);
      } else if (!op.equalsIgnoreCase("salir")) {
        System.out.println("Debes elegir una opción correcta");
      }
    } while (!op.equalsIgnoreCase("salir"));

    System.out.println("Adiocito");


  }
}
