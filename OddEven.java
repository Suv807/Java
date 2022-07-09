import java.lang.*;
import java.util.*;

class OddEven
{
  public  static void main(String[] args){
  System.out.print("please enter a number");
  Scanner sc= new Scanner(System.in);
  int n= sc.nextInt();
    if (n%2==0)
    {
      System.out.print("even");

    }
    else{
      System.out.print("odd");
    }
  }
}
