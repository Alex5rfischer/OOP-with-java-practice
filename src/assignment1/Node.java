/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Alex La
 */
public class Node {
    public int data; //This can be anything but this linkedList we are focusing on integers
    public Node next;//This is a reference to the next node
    public Node prev; //This is a reference to the prevous node
    
    public Node(int data){
        this.data = data; //Review what "this" is used for
        this.next = null;
        this.prev = null;
    }
}