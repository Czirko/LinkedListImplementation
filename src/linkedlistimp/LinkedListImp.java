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
public class LinkedListImp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Llist list= new Llist();
        
       list.add("bbbb");
       list.add("masodik");
       list.add("fff");
       int s = 6;
       list.add(s);
       list.add(s);
       
       
       
       
        System.out.println(list.toString());
        System.out.println(list.size());
        Object[] arr=list.toArray();
        for (Object o : arr) {
            System.out.println(o);
        }
        
       
       
    }
    
}
