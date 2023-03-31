package basic.dev;

import java.util.Stack;

public class MainApp {

 public static void main(String[] args) {
  //Ngăn Xếp
  Stack<Integer> stack = new Stack<>();
  Stack<Integer> stack1 = new Stack<>();

  stack.push(100);
  stack.push(65);
  stack.push(1);
  stack.push(5);
  stack.push(4);
  stack.push(6);
  stack.push(8);
  stack.push(3);
  System.out.println("stack" + stack);
  while (stack.size() > 0) {

   int decimal = stack.pop();
   // dao nguoc statck
   stack1.push(decimal);
   String binary = decimalToBinary(decimal);
   System.out.println("Số nhị phân của " + decimal + " là " + binary);
  }
  System.out.println("stack sau khi dao nguoc" + stack1);
 }

 public static String decimalToBinary(int decimal) {
   Stack<Integer> stack = new Stack<Integer>();
   while (decimal != 0) {
    int remainder = decimal % 2;
    stack.push(remainder);
    decimal /= 2;
   }
   StringBuilder binary = new StringBuilder();
   while (!stack.isEmpty()) {
    binary.append(stack.pop());
   }
   return binary.toString();
  }

}