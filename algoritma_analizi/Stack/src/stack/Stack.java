
package stack;

/**
 *
 * @author ebru
 */
public class Stack {

    public static void main(String[] args) {
        // TODO code application logic here
         
         StackIslemleri stack = new StackIslemleri();
         stack.push(10);
         stack.push(12);
         System.out.println(stack.pop());
         System.out.println(stack.pop());
         System.out.println(stack.pop());
         
    }
    
}
