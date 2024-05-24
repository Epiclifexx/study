package com.study.data_structures;

// Defining a ListNode in Java

/*
* In Java, a ListNode is usually implemented as a class with two instance
* variables: a data field to store the value and a next field to reference
* the next node. Here's an example of a simple ListNode class:
*/
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
    }

    /* Working with ListNode: First, we have to create a Linked List.
     * To create a linked list, we instantiate a ListNode object for each node
     * and establish the connections between them. Here's an example:
     */

    public static void main (String[] args){
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        node1.next = node2;
        node2.next = node3;

        // Traversing a Linked List

        /* To iterate over a linked list, we start from the head node (the first
         * node in the list) and follow the next references until we reach the end
         * (where the next reference is null). Here's an example of traversing the
         * above list:
         */

        ListNode current = node1;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

        // Adding and Removing Nodes

        /* To iterate over a linked list, we start from the head node (the first
         *  ListNode allows us to add and remove nodes at different positions in
         * the linked list) By adjusting the next references, we can insert or
         * delete nodes efficiently. These operations are useful for dynamic data
         * structures that require frequent modifications.
        */

        // Additional Operations

        /* ListNode supports other operations such as searching for a specific value,
         * finding the length of the linked list, and performing various manipulations
         * on the list, such as reversing or sorting.
         */

        // Adding a new node: 15 -> 20 -> 30
        ListNode newNode = new ListNode(15);
        newNode.next = node2;
        node1.next = newNode;
        // Traversing the updated linked list
        System.out.println("Updated Linked List:");
        current = node1;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
        // Output: 10 15 20 30
        // Removing a node: 10 -> 15 -> 30
        node1.next = newNode.next;
        // Traversing the modified linked list
        System.out.println("Modified Linked List:");
        current = node1;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
        // Output: 10 20 30
    }
}




