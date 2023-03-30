package SinglyLinkedListTests;

import static org.junit.Assert.*;
import org.junit.Test;

import uk.ac.tees.linkedlistica.*;

public class addLast {
    @Test
    public void testAddLast() {
        int[] data = {1, 2, 3};
        SinglyLinkedList list = new SinglyLinkedList(data);
        list.addLast(4);
        assertEquals(4, list.getAtPos(3));
    }
    
    @Test
    public void testAddLastEmptyList() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(4);
        assertEquals(4, list.getAtPos(0));
    }
}