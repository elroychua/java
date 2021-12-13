// Creating a basic calculator class that can perform simple operations on two integers.
// class
public class Calculator{
// Constructor
  public Calculator() {

  }
  // Addition method
  public int add(int a, int b){
    return a + b;
  } 
  // Subtraction method
  public int subtract(int a, int b){
    return a - b;
  }
  // Multiplication method
  public int multiply(int a, int b){
    return a * b;
  }
  //Division method
  public int divide(int a, int b){
    return a / b;
  }
  //Modulo item
  public int modulo(int a, int b){
    return a % b;
  }
  public static void main(String[]args){
    // object of a class / instance
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
    System.out.println(myCalculator.multiply(5,7));
    System.out.println(myCalculator.divide(9,3));
    System.out.println(myCalculator.modulo(10,3));
  }
}