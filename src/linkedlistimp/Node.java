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
public class Node {
    
     Object data;
     Node next;
   

    public Node(Object data) {
        this.data = data;
       
       
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next=next;
    }
    
   
    
    
    
    
}
