package dsimpl;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;

// trying to implement the hash table
/*
    1. we need to create a function to calculate the hash code this is call
       hash function
    2. we need to create an array which will store the values
    3. stored values are accessed using the index
    4. hash code is used to store the values in array
 */
public class HashTableImpl {


    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
       MyHashTable table = new MyHashTable(20);
       table.add("ajay","Tcs");
       table.add("ajay","hmg");
       table.add("vijay","amazon");
       table.add("test","value");

       table.print();

    System.out.println(
    table.get("vijay"));
    }
}

class MyHashTable{
   private EntryNode[] array;

   private int LIMIT = 11;

    MyHashTable(){
        array = new EntryNode[this.LIMIT];
    }

   MyHashTable(int limit){
        array = new EntryNode[limit];
   }

   private int hashFunction(String key){
       int hashCode = key.hashCode();
       return hashCode % array.length;
   }



   void add(String key,String value){
        EntryNode node = new EntryNode(key,value);
       if(array[hashFunction(key)]==null){
      System.out.println("entered empty");
           array[hashFunction(key)] = node;
      System.out.println(array[hashFunction(key)]);
       }else{
           System.out.println("entered existing");
           EntryNode head = array[hashFunction(key)];
           while (head.next!=null){
               head=head.next;
           }
           head.next = node;
       }
   }


   String get(String key){
    int hashCode = key.hashCode() % array.length;
    EntryNode head = array[hashCode];
        while (head.next!=null){
            if(head.key.equals(key)){
                return head.value;
            }
        }
    System.out.println("no value found");
        return null;

   }

   void print(){
        for(EntryNode s : array){
            while (s!=null ){
                System.out.print(String.format("{%s,%s}",s.key,s.value));
                s=s.next;
            }
            System.out.println(" ");
        }
   }


}

class EntryNode{
    String key;
    String value;
    EntryNode next;

    EntryNode(String key,String value){
        this.key=key;
        this.value = value;
        this.next=null;
    }
}
