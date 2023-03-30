package SinglyLinkedListTests;

import static org.junit.Assert.*;
import org.junit.Test;

import uk.ac.tees.linkedlistica.*;

public class getFirst {
 
    @Test
    public void testGetFirstEmptyList() {
        SinglyLinkedList list = new SinglyLinkedList();
        int expected = -999;
        int actual = list.getFirst();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetFirstNonEmptyList() {
        SinglyLinkedList list = new SinglyLinkedList(new int[]{1, 2, 3});
        int expected = 1;
        int actual = list.getFirst();
        assertEquals(expected, actual);
    }
}