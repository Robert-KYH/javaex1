package kyh.övningar;

//  https://www.w3resource.com/java-exercises/numbers/index.php

import java.util.Scanner;
import java.lang.Math;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    //  övning 1, kolla om ett nummer är "fult"

    while (true) {
      System.out.print("Skriv in ett heltal, 0 för att avsluta: ");
      int n = in.nextInt();

      if (n <= 0)  break;
      while (n%2 == 0)  n /= 2;
      while (n%3 == 0)  n /= 3;
      while (n%5 == 0)  n /= 5;

      System.out.println(n <= 1 ? "Fult." : "Ej fult.");
    }



  }
}
