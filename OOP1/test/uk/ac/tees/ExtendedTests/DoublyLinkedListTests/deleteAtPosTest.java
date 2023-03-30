/** deleteAtPoTest.java
 * program to unit-test the deleteAtPo method of class DoublyLinkedList
 */
package DoublyLinkedListTests;

import org.junit.BeforeClass;
import org.junit.Test;

import uk.ac.tees.linkedlistica.DoublyLinkedList;
import uk.ac.tees.linkedlistica.DoublyLinkedListNode;

import static org.junit.Assert.*;

public class deleteAtPosTest {
    @BeforeClass
    public static void setUpClass() {
        System.out.println("\ntesting the deleteAtPo() method of class DoublyLinkedList\n");
    }

    /**
     * Test 1 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_emptyList_headNull() {
        System.out.println("> Test1 - test_emptyList_headNull(): head should still point to null");
        System.out.print("creating an empty list...");
        int[] intArray = {};
        DoublyLinkedList instance = new DoublyLinkedList(intArray);
        System.out.println("attempting to deleteAtPo a node with an arbitrary index in a non-existing list...");
        // select node to be deleteAtPod
        int nodeIndex = 3;
        boolean result = instance.deleteAtPos(nodeIndex);
        // test node deletion
        assertNull("head no longer points to null", instance.head);
        System.out.println("As expected, deleting aborted, head still points to null");
    }

    /**
     * Test 2 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_emptyList_deleteAtPoAnyNode() {
        System.out.println("> Test2 - test_emptyList_deleteAtPoAnyNode(): should fail");
        System.out.print("creating an empty list...");
        int[] intArray = {};
        DoublyLinkedList instance = new DoublyLinkedList(intArray);
        boolean expResult = false;
        System.out.println("attempting to deleteAtPo a node with an arbitrary index in a non-existing list...");
        // select node to be deleteAtPod
        int nodeIndex = 3;
        boolean result = instance.deleteAtPos(nodeIndex);
        // test node deletion
        assertEquals(expResult, result);
        System.out.println("As expected, no node was found, deleting aborted");
    }

    /**
     * Test 3 of deleteAtPoAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_invalidIndex_headNotNull() {
        System.out.println("> Test3 - test_nonEmptyList_invalidIndex_headNotNull(): head should remain not null");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
        DoublyLinkedList instance = new DoublyLinkedList(a);
        // mark first node in list
        DoublyLinkedListNode first = instance.head;
        System.out.println("attempting to deleteAtPoAtPo a node with an invalid index...");
        // select node to be deleteAtPoAtPod
        int nodeIndex = -1;
        boolean result = instance.deleteAtPos(nodeIndex);
        // test node deletion
        assertEquals("head no longer pointing to first node of list", instance.head, first);
        System.out.println(
                "As expected, node was not found, deleting aborted, head is still non-null and pointing to first node in list");
    }

    /**
     * Test 4 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_invalidIndex() {
        System.out.println(
                "> Test4 - attempting to deleteAtPo a node with an invalid index in a non-empty list: should fail");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
        DoublyLinkedList instance = new DoublyLinkedList(a);
        System.out.println("attempting to deleteAtPo a node with an invalid index...");
        // select node to be deleteAtPod
        int nodeIndex = -1;
        boolean expResult = false;
        boolean result = instance.deleteAtPos(nodeIndex);
        // test node deletion
        assertEquals(expResult, result);
        System.out.println("As expected, node was not found, deleting aborted");
    }

    /**
     * Test 5 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_deleteAtPoFirstNode_headDisconnected() {
        System.out.println(
                "> Test5 - attempting to deleteAtPo the first node of a list: head should be disconnected from deleteAtPod node");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
        DoublyLinkedList instance = new DoublyLinkedList(a);
        // mark node to be deleteAtPod
        DoublyLinkedListNode todeleteAtPo = instance.head;
        System.out.println("attempting to deleteAtPo first node in list...");
        // select node to be deleteAtPod
        int nodeIndex = 0;
        boolean result = instance.deleteAtPos(nodeIndex);
        // test node deletion
        assertNotSame("head of list still connected to deleteAtPod node", instance.head, todeleteAtPo);
        System.out.println("As expected, head no longer points to deleteAtPod node");
    }

    /**
     * Test 6 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_deleteAtPoFirstNode_deleteAtPodNodeNextPointerIsNull() {
        System.out.println(
                "> Test6 - attempting to deleteAtPo the first node of a list: deleteAtPod node's next pointer should point to null");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
        DoublyLinkedList instance = new DoublyLinkedList(a);
        // mark node to be deleteAtPod
        DoublyLinkedListNode todeleteAtPo = instance.head;
        System.out.println("attempting to deleteAtPo first node in list...");
        // select node to be deleteAtPod
        int nodeIndex = 0;
        boolean result = instance.deleteAtPos(nodeIndex);
        // test node deletion
        assertNull("deleteAtPod node not connected to null", todeleteAtPo.next);
        System.out.println("As expected, deleteAtPod node's next pointer is successfully pointing to null");
    }

    /**
     * Test 7 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_deleteAtPoFirstNode_deleteAtPodNodePrevPointerIsNull() {
        System.out.println(
                "> Test7 - attempting to deleteAtPo the first node of a list: deleteAtPod node's prev pointer should point to null");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
        DoublyLinkedList instance = new DoublyLinkedList(a);
        // mark node to be deleteAtPod
        DoublyLinkedListNode todeleteAtPo = instance.head;
        System.out.println("attempting to deleteAtPo first node in list...");
        // select node to be deleteAtPod
        int nodeIndex = 1;
        boolean result = instance.deleteAtPos(nodeIndex);
        // test node deletion
        assertNull("deleteAtPod node not connected to null", todeleteAtPo.prev);
        System.out.println("As expected, deleteAtPod node's prev pointer is successfully pointing to null");
    }

    /**
     * Test 8 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_deleteAtPoFirstNode_nodeStillConnected() {
        System.out.println(
                "> Test8 - attempting to deleteAtPo the first node of a list: deleteAtPod node should no longer be connected to the list");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
        DoublyLinkedList instance = new DoublyLinkedList(a);
        // mark node to be deleteAtPod
        DoublyLinkedListNode todeleteAtPo = instance.head;
        // mark node after node to be deleteAtPod
        DoublyLinkedListNode after = todeleteAtPo.next;
        System.out.println("attempting to deleteAtPo first node in list...");
        // select node to be deleteAtPod
        int nodeIndex = 1;
        boolean result = instance.deleteAtPos(nodeIndex);
        // test node deletion
        assertNotSame("node to be deleteAtPod still connected to list", todeleteAtPo.next, after);
        System.out.println("As expected, the deleteAtPod node is no longer connected to the list");
    }

    /**
     * Test 9 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_deleteAtPoFirstNode_nodeBypassed() {
        System.out.println("> Test9 - attempting to deleteAtPo the first node of a list: deleteAtPod node should be bypassed");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
        DoublyLinkedList instance = new DoublyLinkedList(a);
        // mark node to be deleteAtPod
        DoublyLinkedListNode todeleteAtPo = instance.head;
        // mark node after node to be deleteAtPod
        DoublyLinkedListNode after = todeleteAtPo.next;
        System.out.println("attempting to deleteAtPo first node in list...");
        // select node to be deleteAtPod
        int nodeIndex = 0;
        boolean result = instance.deleteAtPos(nodeIndex);
        // test node deletion
        assertEquals("deleteAtPod node not bypassed in list", instance.head, after);
        System.out.println("As expected, head now points to the successor of the deleteAtPod node in list");
    }

    /**
     * Test 10 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_deleteAtPoFirstNode_successorNodePrevPointerIsNull() {
        System.out.println(
                "> Test10 - attempting to deleteAtPo the first node of a list: the successor node to the deleteAtPod node should point to null");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
        DoublyLinkedList instance = new DoublyLinkedList(a);
        // mark node to be deleteAtPod
        DoublyLinkedListNode todeleteAtPo = instance.head;
        // mark node after node to be deleteAtPod
        DoublyLinkedListNode after = todeleteAtPo.next;
        System.out.println("attempting to deleteAtPo first node in list...");
        // select node to be deleteAtPod
        int nodeIndex = 1;
        boolean result = instance.deleteAtPos(nodeIndex);
        // test node deletion
        assertNull("prev pointer of successor node to deleteAtPod node does not point to null", after.prev);
        System.out
                .println("As expected, the prev pointer of the successor node to the deleteAtPod node now points to null");
    }

    /**
     * Test 11 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_deleteAtPoFirstNode() {
        System.out.println("> Test11 - attempting to deleteAtPo the first node in list");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
        DoublyLinkedList instance = new DoublyLinkedList(a);
        System.out.println("attempting to deleteAtPo first node in list...");
        boolean expResult = true;
        // select node to be deleteAtPod
        int nodeIndex = 1;
        boolean result = instance.deleteAtPos(nodeIndex);
        // test node deletion
        assertEquals(expResult, result);
        System.out.println("As expected, node was found and deleteAtPod");
    }

    /**
     * Test 12 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_deleteAtPoMiddleNode_firstPartOfListStillConnectedTodeleteAtPodNode() {
        System.out.println(
                "> Test12 - attempting to deleteAtPo a node in middle of list: first part of list should be disconnected from deleteAtPod node");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
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
        assertNotSame("first part of list still connected to node to be deleteAtPod", before.next, todeleteAtPo);
        System.out.println("As expected, first part of list is now disconnected from the deleteAtPod node");
    }

    /**
     * Test 13 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_deleteAtPoMiddleNode_deleteAtPodNodeStillConnectedToFirstPartOfList() {
        System.out.println(
                "> Test13 - attempting to deleteAtPo a node in middle of list: first part of list should be disconnected from deleteAtPod node");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
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
        assertNotSame("node to be deleteAtPod still connected to first part of list", todeleteAtPo.prev, before);
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
        assertNotSame("node to be deleteAtPod still connected to second half of list", todeleteAtPo.next, after);
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
        assertNotSame("second half of list still connected to node to be deleteAtPod", after.prev, todeleteAtPo);
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

    /**
     * Test 18 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_deleteAtPoMiddleNode_predecessorNodeConnectedToSuccessorNode() {
        System.out.println(
                "> Test18 - attempting to deleteAtPo a node in middle of list: predecessor node should be connected to successor node");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
        DoublyLinkedList instance = new DoublyLinkedList(a);
        // select arbitrary node to be deleteAtPod
        int nodeIndex = 5;
        // get to and mark node before node to be deleteAtPod
        DoublyLinkedListNode before = instance.head;
        for (int i = 0; i < nodeIndex - 1; i++)
            before = before.next;
        // mark node to be deleteAtPod
        DoublyLinkedListNode todeleteAtPo = before.next;
        // mark node after node to be deleteAtPod
        DoublyLinkedListNode after = todeleteAtPo.next;
        System.out.println("attempting to deleteAtPo a node in middle of list...");
        boolean result = instance.deleteAtPos(nodeIndex);
        // test node deletion
        assertEquals("predecessor node is not connected to successor node", before.next, after);
        System.out.println("As expected, deleteAtPod node was bypassed; predecessor node was connected to successor node");
    }

    /**
     * Test 19 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_deleteAtPoMiddleNode_successorNodeConnectedToPredecessorNode() {
        System.out.println(
                "> Test19 - attempting to deleteAtPo a node in middle of list: successor node should be connected to predecessor node");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
        DoublyLinkedList instance = new DoublyLinkedList(a);
        // select arbitrary node to be deleteAtPod
        int nodeIndex = 5;
        // get to and mark node before node to be deleteAtPod
        DoublyLinkedListNode before = instance.head;
        for (int i = 0; i < nodeIndex - 1; i++)
            before = before.next;
        // mark node to be deleteAtPod
        DoublyLinkedListNode todeleteAtPo = before.next;
        // mark node after node to be deleteAtPod
        DoublyLinkedListNode after = todeleteAtPo.next;
        System.out.println("attempting to deleteAtPo a node in middle of list...");
        boolean result = instance.deleteAtPos(nodeIndex);
        // test node deletion
        assertEquals("successor node is not connected to predecessor node", after.prev, before);
        System.out.println("As expected, successor node is connected to predecessor node");
    }

    /**
     * Test 20 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_deleteAtPoMiddleNode() {
        System.out.println("> Test20 - attempting to deleteAtPo a node in middle of list: node should be deleteAtPod");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
        DoublyLinkedList instance = new DoublyLinkedList(a);
        boolean expResult = true;
        System.out.println("attempting to deleteAtPo a node in middle of list...");
        // select arbitrary node to be deleteAtPod
        int nodeIndex = 5;
        boolean result = instance.deleteAtPos(nodeIndex);
        // test node deletion
        assertEquals(expResult, result);
        System.out.println("As expected, node was found and deleteAtPod");
    }

    /**
     * Test 21 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_deleteAtPoLastNode_predecessorNodeNextPointerIsNull() {
        System.out.println(
                "> Test21 - attempting to deleteAtPo the last node of a list: predecessor node's next pointer should now point to null");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
        DoublyLinkedList instance = new DoublyLinkedList(a);
        // select node to be deleteAtPod
        int nodeIndex = a.length;
        // get to and mark node before node to be deleteAtPod
        DoublyLinkedListNode before = instance.head;
        for (int i = 0; i < nodeIndex - 1; i++)
            before = before.next;
        System.out.println("attempting to deleteAtPo last node in list...");
        boolean result = instance.deleteAtPos(nodeIndex);
        // test node deletion
        assertNull("predecessor node's next pointer not connected to null", before.next);
        System.out.println("As expected, predecessor node's next pointer now points to null");
    }

    /**
     * Test 22 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_deleteAtPoLastNode_deleteAtPodNodeNextPointerIsNull() {
        System.out.println(
                "> Test22 - attempting to deleteAtPo the last node of a list: deleteAtPod node's next pointer should point to null");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
        DoublyLinkedList instance = new DoublyLinkedList(a);
        // select node to be deleteAtPod
        int nodeIndex = a.length;
        // get to and mark node to be deleteAtPod
        DoublyLinkedListNode todeleteAtPo = instance.head;
        for (int i = 1; i < nodeIndex; i++)
            todeleteAtPo = todeleteAtPo.next;
        System.out.println("attempting to deleteAtPo last node in list...");
        boolean result = instance.deleteAtPos(nodeIndex);
        // test node deletion
        assertNull("deleteAtPod node's next pointer is not set to null", todeleteAtPo.next);
        System.out.println("As expected, deleteAtPod node's next pointer now points to null");
    }

    /**
     * Test 23 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_deleteAtPoLastNode_deleteAtPodNodePrevPointerIsNull() {
        System.out.println(
                "> Test23 - attempting to deleteAtPo the last node of a list: deleteAtPod node's prev pointer should point to null");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
        DoublyLinkedList instance = new DoublyLinkedList(a);
        // select node to be deleteAtPod
        int nodeIndex = a.length;
        // get to and mark node to be deleteAtPod
        DoublyLinkedListNode todeleteAtPo = instance.head;
        for (int i = 1; i < nodeIndex; i++)
            todeleteAtPo = todeleteAtPo.next;
        System.out.println("attempting to deleteAtPo last node in list...");
        boolean result = instance.deleteAtPos(nodeIndex - 1);
        // test node deletion
        assertNull("deleteAtPod node's prev pointer is not set to null", todeleteAtPo.prev);
        System.out.println("As expected, deleteAtPod node's prev pointer now points to null");
    }

    /**
     * Test 24 of deleteAtPo method, of class DoublyLinkedList.
     */

    @Test
    public void test_nonEmptyList_deleteAtPoLastNode() {
        System.out.println("> Test24 - attempting to deleteAtPo the last node of a list: last node should be deleteAtPod");
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = { 0, 0, 0, 0, 0, 0, 0 };
        DoublyLinkedList instance = new DoublyLinkedList(a);
        boolean expResult = true;
        System.out.println("attempting to deleteAtPo last node in list...");
        // select node to be deleteAtPod
        int nodeIndex = a.length;
        boolean result = instance.deleteAtPos(nodeIndex - 1);
        // test node deletion
        assertEquals(expResult, result);
        System.out.println("As expected, last node was found and deleteAtPod");
    }
}
