//  https://www.w3resource.com/java-exercises/numbers/index.php

package kyh.övningar;

import java.util.Scanner;
import java.lang.Math;


public class Main {

  public static Scanner in;

  public static void main(String[] args) {
    in = new Scanner(System.in);

    övn1();
  }


  //  övning 1, kolla om ett tal är "fult"
  public static void övn1() {
    while (true) {
      System.out.print("Skriv in ett heltal, 0 för att avsluta: ");
      int n = in.nextInt();

      if (n <= 0)  break;
      while (n % 2 == 0)  n /= 2;
      while (n % 3 == 0)  n /= 3;
      while (n % 5 == 0)  n /= 5;

      System.out.println(n <= 1 ? "Fult." : "Ej fult.");
    }
  }
}