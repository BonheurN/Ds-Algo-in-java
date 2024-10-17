import java.util.Stack;

public class stack{
public static void main(String[]args){
// Stack is LIFO data structure and stores object in a sort vertical tower
  // push method to add objects
  // pop method is used to remove obect 
  Stack<String> stack = new Stack<String>();
  stack.push("Marvel");
  stack.push("DC Comics");
  stack.push("Disney land");
  stack.push("20th Century");

   stack.pop(); //this method removes the first element in this list
   stack.peek(); // this method choose the first element of the list and once you print this method it will print the chosen method 
   stack.push(); // push method is used to add element in stack data structure

  // we can display all the element on the list using loops for example lets try to display them 

  while(!stack.isEmpty()){
    System.out.println(stack.pop());
  }
  }
}
