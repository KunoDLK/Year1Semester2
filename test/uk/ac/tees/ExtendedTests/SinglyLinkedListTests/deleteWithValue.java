package SinglyLinkedListTests;

import static org.junit.Assert.*;
import org.junit.Test;

import uk.ac.tees.linkedlistica.*;

public class deleteWithValue {
 
    @Test
    public void testDeleteWithValue() {
        int[] data = {1, 2, 3, 4};
        SinglyLinkedList list = new SinglyLinkedList(data);
        assertTrue(list.deleteWithValue(2));
        assertFalse(list.deleteWithValue(5));
    }
}