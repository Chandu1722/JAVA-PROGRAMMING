import java.util.Scanner;

class Factorial{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int num=sc.nextInt(); 
    sc.close();
    Factorial f=new Factorial();
    System.out.print("The factorial of given number is "+f.fact(num));
  }
  int fact(int x){
    if(x==0){
      return 1;
    }
    return x*fact(x-1);
  }
