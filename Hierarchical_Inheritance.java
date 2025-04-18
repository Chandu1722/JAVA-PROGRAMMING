class parent{
  void print(){
    System.out.println("This is parent class");
  }
}
class child1 extends parent{
  void printChild1(){
    System.out.println("This is child1 class");
  }
} 
class child2 extends parent{
  void printChild2(){
    System.out.println("This is child2 class");
  }
}
class Hierarchical_Inheritance{
  public static void main(String[] args){
    child1 c1=new child1();
    child2 c2=new child2();
    c1.printChild1();
    c1.print();
    c2.printChild2();
    c2.print();
  }
}

