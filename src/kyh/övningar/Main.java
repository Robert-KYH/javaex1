//  https://www.w3resource.com/java-exercises/numbers/index.php

package kyh.övningar;

import java.util.Scanner;
import java.lang.Math;


public class Main {

  public static Scanner in;

  public static void main(String[] args) {
    in = new Scanner(System.in);

    övn1();
    övn2();
    övn3();
    övn4();
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


  //  övning 2, räkna antalet defekta, perfekta, och överflödande tal
  public static void övn2() {
    int n_def = 0, n_perf = 0, n_över = 0;

    for (int n = 1; n <= 10000; ++n) {
      int summa = 0;
      for (int d = 1; d <= n/2; ++d)  summa += (n%d == 0 ? d : 0);

      if (summa < n)       ++n_def;
      else if (summa > n)  ++n_över;
      else                 ++n_perf;
    }

    System.out.println("     Defekta tal: "+n_def);
    System.out.println("    Perfekta tal: "+n_perf);
    System.out.println("Överflödande tal: "+n_över);
  }


  //  övning 3, generera slumptal i intervall
  public static void övn3() {
    System.out.print("Intervall (ex. 10 500):  ");
    int start = in.nextInt(), slut = in.nextInt();

    int gen = 40429;
    for (int n = 10000; n > 0; --n) {
      gen %= 46341;
      gen = gen*40853 + 20071;
      int r = start + gen%(slut-start);
      if (r < start  ||  r > slut) {
        System.out.println("!!! Slumptalsgeneratorn gav ett felaktigt tal");
        return;
      }

    }

    System.out.println("Alla slumptal låg inom intervallet");
  }

  //  övning 4, räkna upp alla Kaprekar-tal under 1000
  public static void övn4() {
    System.out.println("Kaprekar-tal under 1000:");

    for (int n = 1; n <= 999; ++n) {
      int siffror = (int)Math.ceil(Math.log10(n+1));
      int exp = (int)Math.pow(10, siffror);
      int n2 = n*n;
      int a = n2/exp, b = n2%exp;

      if (a+b == n)  System.out.println(n+": "+n+"² = "+n2+", "+a+"+"+b+" = "+n);
    }
  }
}
