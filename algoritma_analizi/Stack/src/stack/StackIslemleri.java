
package stack;

public class StackIslemleri implements IStack{
     Node top;
     @Override
    public void push(int i){
        Node yeniNode= new Node(i);
        if(top==null){
            top=yeniNode;
            return;
        }
        yeniNode.prev=top;
        top=yeniNode;
    }
    
     @Override
    public int pop(){
        if(top==null) {
           System.out.println("Empty Stack");
            return 0;
        }
        Node temp=top;
        top=top.prev;
        return temp.i;
    }
}
