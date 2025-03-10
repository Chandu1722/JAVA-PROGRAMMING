import java.util.Scanner;
class Base7{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int n=sc.nextInt();
    sc.close();
    Solution s=new Solution();
    String str=s.convertToBase7(n);
     System.out.print("The base 7 of given number is "+str);
  }
}
class Solution {
    public String convertToBase7(int num) {
        //StringBuilder str=new StringBuilder();
        if(num==0) return "0";
        int n=num;
        String str="";
        if(num<0) num=num*-1;
        while(num!=0){
            int r=num%7;
            num/=7;
           // str.append(String.valueOf(r));
           str=String.valueOf(r)+str;
        }
       if(n<0){
        return "-"+str;
       }
        return str;
    }
}
