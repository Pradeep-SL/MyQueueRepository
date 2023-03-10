class StackdataStr
{
    public static class  Node 
        {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
        
    }
     static class stack 
    {
        public static Node head=null;
        public void push(int data) 
        {
            Node newNode=new Node (data);
            if(head==null)
            {
                head=newNode;
                return;
            }  
            newNode.next=head;
            head=newNode;
        }

        public static int pop() 
        {
        if(isEmpty())
            {
                return -1;
            } 
            Node top =head;
             head=head.next;
            return top.data;   
        }

        public static int Peek() 
        {
            if(isEmpty())
            {
                return -1;
            }
            Node top=head;
            return top.data;    
        }
        


        public static boolean isEmpty() 
        {
            return head==null;   
        }


    }
    
    public static void main(String[] args) 
    {
        stack s=new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        while (!s.isEmpty()) 
        {
            System.out.println(s.Peek());
            s.pop();
            s.pop();
    
        }
        

        
        

    }
}