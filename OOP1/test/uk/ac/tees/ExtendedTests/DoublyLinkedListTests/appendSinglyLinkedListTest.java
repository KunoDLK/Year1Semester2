/** appendSinglyLinkedListTest.java
 * program to unit-test the appendSinglyLinkedList method of class DoublyLinkedList
 */
package DoublyLinkedListTests;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import uk.ac.tees.linkedlistica.*;;

public class appendSinglyLinkedListTest {
        @BeforeClass
        public static void setUpClass() {
                System.out.println("\ntesting the appendSinglyLinkedList() method of class DoublyLinkedList\n");
        }

        /**
         * Test 1 of appendSinglyLinkedList method, of class DoublyLinkedList.
         */
        @Test
        public void test_EmptyList_AddEmptyList_Size() {
                System.out.println("> Test1 - test_EmptyList_AddEmptyList_Size(): no nodes should be appended");
                System.out.print("creating an empty list...");
                int[] emptyList = {};
                DoublyLinkedList instance = new DoublyLinkedList(emptyList);
                int expResult = 0;
                System.out.println("attempting to append a empty SinglyLinkedList in a non-existing list...");
                // select node to be appended
                SinglyLinkedList list = new SinglyLinkedList();
                instance.appendSinglyLinkedList(list);

                // test empty list
                assertNull(instance.head);
                System.out.println("As expected, no nodes was found");
        }

        /**
         * Test 2 of appendSinglyLinkedList method, of class DoublyLinkedList.
         */
        @Test
        public void test_EmptyList_AddNonEmptyList_Size() {
                System.out.println("> Test2 - test_emptyList(): no nodes should be appended");
                System.out.print("creating an empty list...");
                int[] EmptyArray = {};
                int[] NonEmptyArray = { 1, 2, 3 };
                DoublyLinkedList instance = new DoublyLinkedList(EmptyArray);
                int expResult = 3;
                System.out.println("attempting to append a SinglyLinkedList in a non-existing list...");
                // select node to be appended
                SinglyLinkedList list = new SinglyLinkedList(NonEmptyArray);
                instance.appendSinglyLinkedList(list);
                // test node appending
                assertEquals(expResult, instance.getSize());
                System.out.println("As expected, no nodes was found, appending aborted");
        }

        /**
         * Test 3 of appendSinglyLinkedList method, of class DoublyLinkedList.
         */
        @Test
        public void test_NonEmptyList_AddNonEmptyList_Size() {
                System.out.println("> Test3 - test_nonEmptyList(): all nodes should be appended");
                System.out.print("creating a list with 3 nodes...");
                int[] intArray = { 1, 2, 3 };
                int[] intArray2 = { 4, 5, 6 };
                DoublyLinkedList instance = new DoublyLinkedList(intArray);
                int expResult = 6;
                System.out.println("attempting to append a SinglyLinkedList with 3 nodes...");

                // select node to be appended
                SinglyLinkedList list = new SinglyLinkedList(intArray2);
                instance.appendSinglyLinkedList(list);

                // test node appending
                assertEquals(expResult, instance.getSize());
                System.out.println("All nodes were successfully appended");
        }

        /**
         * Test 3 of appendSinglyLinkedList method, of class DoublyLinkedList.
         */
        @Test
        public void test_NonEmptyList_AddNonEmptyList_CheckForwardsLinks() {
                System.out.println("> Test3 - test_nonEmptyList(): all nodes should be appended");
                System.out.println("creating a list with 3 nodes...");
                int[] intArray = { 1, 2, 3 };
                int[] intArray2 = { 4, 5, 6 };
                DoublyLinkedList instance = new DoublyLinkedList(intArray);
                
                System.out.println("attempting to append a SinglyLinkedList with 3 nodes...");

                // select node to be appended
                SinglyLinkedList list = new SinglyLinkedList(intArray2);
                instance.appendSinglyLinkedList(list);

                DoublyLinkedListNode node = instance.head;
                for (int i = 1; i <= 6; i++) {
                        // test node appending
                        assertEquals(i, node.data);
                        node = node.next;
                        System.out.println("Checking node NO" + i);

                }
                System.out.println("All nodes were successfully appended");
        }

        /**
         * Test 3 of appendSinglyLinkedList method, of class DoublyLinkedList.
         */
        @Test
        public void test_NonEmptyList_AddNonEmptyList_CheckReverseLinks() {
                System.out.println("> Test3 - test_nonEmptyList(): all nodes should be appended");
                System.out.println("creating a list with 3 nodes...");
                int[] intArray = { 1, 2, 3 };
                int[] intArray2 = { 4, 5, 6 };
                DoublyLinkedList instance = new DoublyLinkedList(intArray);

                System.out.println("attempting to append a SinglyLinkedList with 3 nodes...");

                // select node to be appended
                SinglyLinkedList list = new SinglyLinkedList(intArray2);
                instance.appendSinglyLinkedList(list);

                DoublyLinkedListNode node = instance.head;
                for (int i = 1; i <= 5; i++) {
                        
                        System.out.println("Checking node NO" + i);
                        // test node appending
                        DoublyLinkedListNode nextNode = node.next;
                        assertEquals(node, nextNode.prev);
                        node = node.next;
                }
                System.out.println("All nodes were successfully appended");
        }

        /**
         * Test 3 of appendSinglyLinkedList method, of class DoublyLinkedList.
         */
        @Test
        public void test_NonEmptyList_AddEmptyList_Size() {
                System.out.println("> Test3 - test_nonEmptyList(): all nodes should be appended");
                System.out.print("creating a list with 3 nodes...");
                int[] intArray = { 1, 2, 3 };
                int[] emptyList = {};
                DoublyLinkedList instance = new DoublyLinkedList(intArray);
                int expResult = 3;
                System.out.println("attempting to append a SinglyLinkedList with 3 nodes...");

                // select node to be appended
                SinglyLinkedList list = new SinglyLinkedList(emptyList);
                instance.appendSinglyLinkedList(list);

                // test node appending
                assertEquals(expResult, instance.getSize());
                System.out.println("All nodes were successfully appended");
        }
}