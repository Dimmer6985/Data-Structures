package com.sebastian;

public class ListNode<E> {

    protected E data;

    protected ListNode<E> next;

    public ListNode() {
        this.data = null;
        this.next = null;
    }// ListNode()

    public ListNode(E val) {
        this.data = val;
        this.next = null;
    }// ListNode()

}// class
