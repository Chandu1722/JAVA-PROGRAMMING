class Parent{
  void printParent(){
    System.out.print("This is parent class");
  }
}
class Child extends Parent{
  void printChild(){
    System.out.print("This is child class");
  }
}
class SingleInheritance{
  public static void main(String[] args){
    Child c=new Child();
    c.printChild();
    c.printParent();//accessing parent class method
  }
}
