import java.util.Scanner;
class fact{
  public static void main(String[] args){
    int num,i=1,fact=1;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    num=sc.nextInt();
    while(i<=num){
      fact*=i;
      i++;
    }
    System.out.print("The factorial of given number is "+fact);
    sc.close();
  }
