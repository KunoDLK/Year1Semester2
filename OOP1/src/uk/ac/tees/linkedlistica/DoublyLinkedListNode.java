package uk.ac.tees.linkedlistica;

// DO NOT MODIFY THIS FILE.

/**
 * Represents a node in a doubly linked list.
 */
public class DoublyLinkedListNode {
    
    /**
     * Stores the data for the node (an integer value).
     */
    public int data;
    
    /**
     * Stores the link to the next node.
     */
    public DoublyLinkedListNode next;    
    
    /**
     * Stores the link to the previous node.
     */
    public DoublyLinkedListNode prev;

    /**
     * Creates a new empty node.
     */
    public DoublyLinkedListNode() {
        data = 0;
        next = null;
        prev = null;
    }

    /**
     * Creates a new node with `data` stored in it.
     *
     * @param data  the data to store in the new node
     */
    public DoublyLinkedListNode(int data) {
        this.data = data;
        next = null;
        prev = null;
    }

    /**
     * Creates a new node storing `data` and linked to `next` and `previous`.
     *
     * @param data  the data to store in the new node
     * @param next  the next node in the list
     * @param prev  the previous node in the list
     */
    public DoublyLinkedListNode(int data, DoublyLinkedListNode next, DoublyLinkedListNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}