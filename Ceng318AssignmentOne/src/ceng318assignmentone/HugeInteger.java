/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceng318assignmentone;

/**
 *
 * @author giree
 */
public class HugeInteger {
     private boolean isPositive;
     private int length;
     private int data;
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
        HugeInteger hix = new HugeInteger(); 
        
        hix.data = num2.data + this.data;
        
        return hix;
    }
    
    int compareTo(HugeInteger num2){
        
        if(num2.data > this.data ){
            return -1;
        }
        
        else if(num2.data == this.data){
        return 0;
        }
        
        else
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
    
    public String toString(){
        
    }
}
