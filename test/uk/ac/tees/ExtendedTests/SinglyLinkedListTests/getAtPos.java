package SinglyLinkedListTests;

import static org.junit.Assert.*;
import org.junit.Test;

import uk.ac.tees.linkedlistica.*;

public class getAtPos {
 
   @Test
   public void testGetAtPos() {
      int[] data = {1, 2, 3, 4};
      SinglyLinkedList list = new SinglyLinkedList(data);
      
      assertEquals(2, list.getAtPos(1));
      assertEquals(4, list.getAtPos(3));
      assertEquals(-999, list.getAtPos(4));
   }
   
   @Test
   public void testGetAtPosEmptyList() {
      SinglyLinkedList list = new SinglyLinkedList();
      
      assertEquals(-999, list.getAtPos(0));
   }
}