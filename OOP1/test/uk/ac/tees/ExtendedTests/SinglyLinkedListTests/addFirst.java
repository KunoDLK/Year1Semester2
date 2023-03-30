package SinglyLinkedListTests;

import static org.junit.Assert.*;
import org.junit.Test;
import uk.ac.tees.linkedlistica.*; // import the related package here

public class addFirst {
    
    @Test
    public void testAddFirst() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        assertEquals(1, list.getFirst());
    }
    
    @Test
    public void testAddFirstMultiple() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        assertEquals(3, list.getFirst());
    }
    
    @Test
    public void testAddFirstEmptyList() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        assertEquals(1, list.getAtPos(0));
    }
}