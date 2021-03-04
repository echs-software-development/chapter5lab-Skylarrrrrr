import java.util.Scanner;

public class Prob4 {
  public static void main(String[] args){

    int count = 1;

    for (int i = 100; i <= 1000; i++){
      if (i % 5 == 0 && i % 6 == 0)
        System.out.println((count++ % 10 != 0) ? i + " ": i + "\n");
    }

  }
}