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
public class HugeInteger {
     private boolean isPositive;
     private int length;
     private Node head;
     private Node tail;
     

    public HugeInteger(){//Main advantage is memory management
        head=null; 
        tail=null;
        isPositive=true; //Set to true by default
        length=0; //Length is set to 0
    }
    
    public HugeInteger(String number){
       //Creates the number from the string with all leading zeros removed
    }
    
    HugeInteger addPositive(HugeInteger num2){
        
        return num2;
    }
    
    int compareTo(HugeInteger num2){
        
        return 1;
    }
    
    void concatenateDigit(int digit){
        Node newNode = new Node(digit);
        if(head==null){
            head=tail=newNode;//attach the head and tail to the newNode
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    
    void addLast(int digit){//Adds a digit to the fron of the number
        //Step1. Create a new Node
        Node newNode = new Node(digit);
        if(head==null){//First Case, where linkedList is empty
            head=tail=newNode; //attach the head and tail to the newNode
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    
}
