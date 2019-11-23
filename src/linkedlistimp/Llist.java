/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistimp;

/**
 *
 * @author CzirkO
 */
public class Llist {

    Node head;

    public int size() {
        if (head != null) {
            int s = 1;
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
                s++;
            }
            return s;

        }
        return 0;

    }

    public Object getTail() {
        Node tmp = head;
        if (head != null) {
            while (tmp.next == null) {
                tmp = tmp.next;

            }
        }
        return tmp.data;
    }

    public void add(Object o) {
        Node tmp = head;
        Node newNode = new Node(o);
        if (head != null) {
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        } else {
            head = newNode;
        }

    }

    public void del(Node n) {
        Node tmp = head;
        if (tmp != n) {
            while (tmp.next == n) {
                tmp = tmp.next;
            }
            tmp.next = n.next;
        } else {
            head=head.next;
        }
    }
    
    public void delAt(int i){
        Node tmp=head;
        if(tmp!=null&&i>0){
            for (int j = 0; j < i-1; j++) {
                tmp=tmp.next;
            }
            tmp.next=tmp.next.next;
            
        }else if(i==0){
            head=head.next;
        }
        
        
    }

    public Object get(int i) {
        Node tmp = head;

        for (int j = 0; j < i; j++) {
            tmp = tmp.next;
        }

        return tmp.data;

    }
    public String toString(){
        String s ="";
        Node tmp=head;
        if(tmp!=null){
        while(tmp.next!=null){
            s+="["+tmp.data+"] ";
            tmp=tmp.next;
        }
         s+="["+tmp.data+"] ";
            }
        return s;
    }
    
    public Object[] toArray(){
        Object[] arr=new Object[this.size()];
        Node tmp=head;
        if(tmp!=null){
        for (int i = 0; i < this.size(); i++) {
            arr[i]=tmp.data;
            tmp=tmp.next;
        }
        }
        
        return arr;
    }
}
