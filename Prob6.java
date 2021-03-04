import java.util.Scanner;

public class Prob6 {
  public static void main(String[] args){

    for (int x = 4; x >= 0; x--)
    {
      for (int y = 0; y < x; y++)
      {
        System.out.println("*");
      }
      System.out.println();
    }
  }
}