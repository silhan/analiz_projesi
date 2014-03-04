

package myarray;

public class LinkedList {
    Node head;
    int sayac=0;
    public void add(int i){
        Node new_data = new Node(i);
        if(head==null){
            head=new_data;
            
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_data;
        }
    }
    public void show(){
            Node temp=head;
            while(temp.next!=null){
                System.out.println(temp.value);
                temp=temp.next;
            }
            System.out.println(temp.value);
            
        }
}
