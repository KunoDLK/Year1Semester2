/** deleteAtPoTest.java
 * program to unit-test the deleteAtPo method of class DoublyLinkedList
 */
package DoublyLinkedListTests;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import uk.ac.tees.linkedlistica.*;;

public class deleteAllNodesWithValue {
        @BeforeClass
        public static void setUpClass() {
                System.out.println("\ntesting the deleteAllNodesWithValue() method of class DoublyLinkedList\n");
        }

        /**
         * Test 1 of deleteAtPo method, of class DoublyLinkedList.
         */
        @Test
        public void test_EmptyList() {
                System.out.println("> Test1 - test_emptyList(): no nodes should be deleted");
                System.out.print("creating an empty list...");
                int[] intArray = {};
                DoublyLinkedList instance = new DoublyLinkedList(intArray);
                int expResult = 0;
                System.out.println("attempting to deleteAllNodesWithValue of value 1 in a non-existing list...");
                // select node to be deleteAtPod
                int deleteValue = 1;
                int result = instance.deleteAllNodesWithValue(deleteValue);
                // test node deletion
                assertEquals(expResult, result);
                System.out.println("As expected, no nodes was found, deleting aborted");
        }

        /**
         * Test 2 of deleteAtPo method, of class DoublyLinkedList.
         */
        @Test
        public void test_NonemptyList_noNodesDetected() {
                System.out.println("> Test2 - test_nonemptyList_noNodesDetected(): no nodes should be deleted");
                System.out.print("creating an list...");
                int[] intArray = { 1, 2, 3, 4, 5 };
                DoublyLinkedList instance = new DoublyLinkedList(intArray);
                int expResult = 0;
                System.out.println("attempting to deleteAllNodesWithValue of value 0 in list...");
                // select node to be deleteAtPod
                int deleteValue = 0;
                int result = instance.deleteAllNodesWithValue(deleteValue);
                // test node deletion
                assertEquals(expResult, result);
                System.out.println("As expected, no nodes was found, deleting aborted");
        }

        /**
         * Test 3 of deleteAtPo method, of class DoublyLinkedList.
         */
        @Test
        public void test_NonemptyList_NodesDetected() {
                // Create instance, delete first node containing '3'.
                DoublyLinkedList instance = new DoublyLinkedList(new int[] { 8, 3, 6, 3 });
                int firstPass = instance.deleteAllNodesWithValue(3);
                assertEquals("Number of nodes deleted should be returned.", 2,
                                firstPass);
                int secondPass = instance.deleteAllNodesWithValue(6);
                assertEquals("Number of nodes deleted should be returned.", 1,
                                secondPass);
                int nullPass = instance.deleteAllNodesWithValue(99);
                assertEquals("Number of nodes deleted should be returned.", 0,
                                nullPass);
                // Compare to expected.
                assertArrayEquals("Items should be correctly deleted.",
                                new int[] { 8 }, doublyLinkedListToArray(instance));
        }

        /**
         * Converts a doubly linked list to an array.
         * 
         * @param list the list to convert
         * @return the converted list
         */
        private static int[] doublyLinkedListToArray(DoublyLinkedList list) {
                // Gauge size.
                int n = 0;
                DoublyLinkedListNode c = list.head;
                while (c != null) {
                        n++;
                        c = c.next;
                }
                // Copy to int array.
                int[] arr = new int[n];
                c = list.head;
                int i = 0;
                while (c != null) {
                        arr[i++] = c.data;
                        c = c.next;
                }
                return arr; // Return result.
        }

        /**
         * Test 4 of deleteAtPo method, of class DoublyLinkedList.
         */

        @Test
        public void test_NonEmptyList_deleteAtPoFirstNode_headDisconnected() {
                System.out.println(
                                "> Test5 - attempting to deleteAtPo the first node of a list: head should be disconnected from deleteAtPod node");
                System.out.print("creating a non-empty list with an arbitrary number of nodes...");
                int[] a = { 1, 2, 3, 4, 5 };
                DoublyLinkedList instance = new DoublyLinkedList(a);
                // mark node to be deleteAtPod
                DoublyLinkedListNode toDeleteNode = instance.head;
                System.out.println("attempting to delete the first node in list...");
                // select node to be deleteAtPod
                int expected = 1;
                int result = instance.deleteAllNodesWithValue(1);
                // test node deletion
                assertEquals(result, expected);
                assertNotSame("head of list still connected to deleteAtPod node", instance.head, toDeleteNode);
                System.out.println("As expected, head no longer points to deleteAtPod node");
        }

        /**
         * Test 5 of deleteAtPo method, of class DoublyLinkedList.
         */

        @Test
        public void test_nonEmptyList_deleteAtPoMiddleNode_deleteAtPodNodeStillConnectedToFirstPartOfList() {
                System.out.println(
                                "> Test13 - attempting to deleteAtPo a node in middle of list: first part of list should be disconnected from deleteAtPod node");
                System.out.print("creating a non-empty list with an arbitrary number of nodes...");
                int[] a = { 1, 2, 3, 4, 5, 6 };
                DoublyLinkedList instance = new DoublyLinkedList(a);
                // get to and mark node before node to be deleteAtPod
                DoublyLinkedListNode before = instance.head;
                // select arbitrary node to be deleteAtPod
                int nodeIndex = 5;
                for (int i = 0; i < nodeIndex - 1; i++)
                        before = before.next;
                // mark node to be deleteAtPod
                DoublyLinkedListNode todeleteAtPo = before.next;
                System.out.println("attempting to deleteAtPo a node in middle of list...");
                boolean result = instance.deleteAtPos(nodeIndex);
                // test node deletion
                assertNotSame("node to be deleteAtPod still connected to first part of list", todeleteAtPo.prev,
                                before);
                System.out.println("As expected, the deleteAtPod node is now disconnected from the first part of list");
        }

        /**
         * Test 14 of deleteAtPo method, of class DoublyLinkedList.
         */

        @Test
        public void test_nonEmptyList_deleteAtPoMiddleNode_deleteAtPodNodeDisconnectedFromRestOfList() {
                System.out.println(
                                "> Test14 - attempting to deleteAtPo a node in middle of list: node to be deleteAtPod should be disconnected from second part of list");
                System.out.print("creating a non-empty list with an arbitrary number of nodes...");
                int[] a = { 0, 0, 0, 0, 0, 0, 0 };
                DoublyLinkedList instance = new DoublyLinkedList(a);
                // select arbitrary node to be deleteAtPod
                int nodeIndex = 5;
                // get to and mark node to be deleteAtPod
                DoublyLinkedListNode todeleteAtPo = instance.head;
                for (int i = 1; i < nodeIndex; i++)
                        todeleteAtPo = todeleteAtPo.next;
                // mark node after node to be deleteAtPod
                DoublyLinkedListNode after = todeleteAtPo.next;
                System.out.println("attempting to deleteAtPo a node in middle of list...");
                boolean result = instance.deleteAtPos(nodeIndex);
                // test node deletion
                assertNotSame("node to be deleteAtPod still connected to second half of list", todeleteAtPo.next,
                                after);
                System.out.println("As expected, deleteAtPod node is no longer connected to second part of list");
        }

        /**
         * Test 15 of deleteAtPo method, of class DoublyLinkedList.
         */

        @Test
        public void test_nonEmptyList_deleteAtPoMiddleNode_restOfListDisconnectedFromdeleteAtPodNode() {
                System.out.println(
                                "> Test15 - attempting to deleteAtPo a node in middle of list: node to be deleteAtPod should be disconnected from second part of list");
                System.out.print("creating a non-empty list with an arbitrary number of nodes...");
                int[] a = { 0, 0, 0, 0, 0, 0, 0 };
                DoublyLinkedList instance = new DoublyLinkedList(a);
                // select arbitrary node to be deleteAtPod
                int nodeIndex = 5;
                // get to and mark node to be deleteAtPod
                DoublyLinkedListNode todeleteAtPo = instance.head;
                for (int i = 1; i < nodeIndex; i++)
                        todeleteAtPo = todeleteAtPo.next;
                // mark node after node to be deleteAtPod
                DoublyLinkedListNode after = todeleteAtPo.next;
                System.out.println("attempting to deleteAtPo a node in middle of list...");
                boolean result = instance.deleteAtPos(nodeIndex);
                // test node deletion
                assertNotSame("second half of list still connected to node to be deleteAtPod", after.prev,
                                todeleteAtPo);
                System.out.println("As expected, second part of list is no longer connected to deleteAtPod node");
        }

        /**
         * Test 16 of deleteAtPo method, of class DoublyLinkedList.
         */

        @Test
        public void test_nonEmptyList_deleteAtPoMiddleNode_deleteAtPodNodeNextPointerIsNull() {
                System.out.println(
                                "> Test16 - attempting to deleteAtPo a node in middle of list: deleteAtPod node's next pointer should point to null");
                System.out.print("creating a non-empty list with an arbitrary number of nodes...");
                int[] a = { 0, 0, 0, 0, 0, 0, 0 };
                DoublyLinkedList instance = new DoublyLinkedList(a);
                // select arbitrary node to be deleteAtPod
                int nodeIndex = 5;
                // get to and mark node to be deleteAtPod
                DoublyLinkedListNode todeleteAtPo = instance.head;
                for (int i = 0; i < nodeIndex; i++)
                        todeleteAtPo = todeleteAtPo.next;
                System.out.println("attempting to deleteAtPo a node in middle of list...");
                boolean result = instance.deleteAtPos(nodeIndex);
                // test node deletion
                assertNull("node to be deleteAtPod's next pointer not connected to null", todeleteAtPo.next);
                System.out.println("As expected, deleteAtPod node's next pointer is now pointing to null");
        }

        /**
         * Test 17 of deleteAtPo method, of class DoublyLinkedList.
         */

        @Test
        public void test_nonEmptyList_deleteAtPoMiddleNode_deleteAtPodNodePrevPointerIsNull() {
                System.out.println(
                                "> Test17 - attempting to deleteAtPo a node in middle of list: deleteAtPod node's prev pointer should point to null");
                System.out.print("creating a non-empty list with an arbitrary number of nodes...");
                int[] a = { 0, 0, 0, 0, 0, 0, 0 };
                DoublyLinkedList instance = new DoublyLinkedList(a);
                // select arbitrary node to be deleteAtPod
                int nodeIndex = 5;
                // get to and mark node to be deleteAtPod
                DoublyLinkedListNode todeleteAtPo = instance.head;
                for (int i = 0; i < nodeIndex; i++)
                        todeleteAtPo = todeleteAtPo.next;
                System.out.println("attempting to deleteAtPo a node in middle of list...");
                boolean result = instance.deleteAtPos(nodeIndex);
                // test node deletion
                assertNull("node to be deleteAtPod's prev pointer not connected to null", todeleteAtPo.prev);
                System.out.println("As expected, deleteAtPod node's prev pointer is now pointing to null");
        }
}
