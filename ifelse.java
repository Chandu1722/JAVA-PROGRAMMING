import java.util.Scanner;
class EvenorOdd{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int num=sc.nextInt();
    if(num%2==0){
       System.out.print("Even number");
    }
    else{
       System.out.print("Odd number");
    }
    sc.close();
  }
}
