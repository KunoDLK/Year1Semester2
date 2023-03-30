package SinglyLinkedListTests;

import static org.junit.Assert.*;
import org.junit.Test;

import uk.ac.tees.linkedlistica.*;

public class cloneLinkedList {
 
    @Test
    public void testCloneLinkedList() {
        int[] data = {1, 2, 3};
        SinglyLinkedList list = new SinglyLinkedList(data);
        SinglyLinkedList clonedList = list.cloneLinkedList();
        
        assertNotSame(list, clonedList);
        assertEquals(list.getFirst(), clonedList.getFirst());
        assertEquals(list.getAtPos(2), clonedList.getAtPos(2));
    }
    
    @Test
    public void testCloneLinkedListEmpty() {
        SinglyLinkedList list = new SinglyLinkedList();
        SinglyLinkedList clonedList = list.cloneLinkedList();
        
        assertNotSame(list, clonedList);
        assertNull(clonedList.head);
    }
}