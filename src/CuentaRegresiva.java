import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CuentaRegresiva {
  public static void main(String[] args) {

    int i = 10;
    System.out.println("*** INICIANDO AUTODESTRUCCIÓN *** ");
    while (i > 0) {
      System.out.printf("%d\n", i);
      i--;
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e){
        e.printStackTrace();
      }
    }
    System.out.println("*** DESTRUCCIÓN FINALIZADA *** ");

  }
}
