class A{
  void print1(){
    System.out.println("A class");
  }
}
class B extends A{
  void print2(){
    System.out.println("B class");
  }
}
class C extends B{
  void print3(){
    System.out.println("C class");
  }
}
class ABC{
  public static void main(String[] args){
    C c1=new C();
    c1.print1();
    c1.print2();
    c1.print3();
  }
}
