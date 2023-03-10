
import java.util.*;


class Queue
{
    static class Node 
    {
    Object ele;
    Node next;
    Node(Object e,Node n) 
    {
        this.ele = e;
        next = n;
                }
            }

  
    
    private Node first=null;
    private Node last=null;
    private int count=0;
    public void add(Object e) 
    {
        if(first==null)
        {
             first=new Node(e,null);
            last=first;
            count++;
            return;
        }
        last.next=new Node(e,null);
        last=last.next;
        count++;
    }
    public boolean isEmpty()
    {
        if(size()==0) return true;
        return false;
    }
    public int size()
    {
        return count;
    }
    public Object poll() 
    {
        if(isEmpty()) return null;
        Object e=first.ele;
        first=first.next;
        count--;
        if(isEmpty()) last=null;
        return e;     
    }
    public Object peek() 
    {
    if(isEmpty())return null;
    return first.ele;    
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(5);
        q.add(10);
        q.add(30);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.poll();
            // q.poll();
        }
        
    }
}

// public class Queue {
//     static class Node {
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//             next = null;
//         }
//     }
 
 
//     static class QueueB {
//         static Node head = null;
//         static Node tail = null;
 
 
//         public static boolean isEmpty() {
//             return head == null && tail == null;
//         }
 
 
//         public static void add(int data) {
//             Node newNode = new Node(data);
//             if(isEmpty()) {
//                 tail = head = newNode;
//             } else {
//                 tail.next = newNode;
//                 tail = newNode;
//             }
//         }
 
 
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             int front = head.data;
//             //single node
//             if(head == tail) {
//                 tail = null;
//             }
//             head = head.next;
//             return front;
//         }
 
 
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
           
//             return head.data;
//         }
//     }
//     public static void main(String args[]) {
//         QueueB q = new QueueB();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
 
 
//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }
 
