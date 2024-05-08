import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    String myPassword = "password";

    Scanner sc = new Scanner(System.in);
    String password;
    do {
      System.out.println("Ingresa la contraseña:");
      password = sc.nextLine();

    } while (!password.equals(myPassword));

    System.out.println("Acceso autorizado");
  }
}