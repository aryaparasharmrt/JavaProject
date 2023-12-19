import java.util.Scanner;

class Main{
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int val1 = sc.nextInt();
    int val2 = sc.nextInt();

    int added = add(val1, val2);
    int subtracted = add(val1, val2);
    System.out.print(added+" "+subtracted);
  }

  public static int add(int val1, int val2) {
    return val1 + val2;
  }

  public static int subtract(int val1, int val2) {
    return val1 - val2;
  }  
}
