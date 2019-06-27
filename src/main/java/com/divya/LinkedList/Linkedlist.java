package com.divya.LinkedList;

public class Linkedlist {
	
	Node head;
	
	 class Node{
		int data;
		Node next;
		
		Node(int n)
		{
			data = n;
			next = null;
		}
	}

	public static void main(String[] args) {
		
		Linkedlist l = new Linkedlist();
		
		l.addAtHeader(1);
		l.append(2);
		l.addAtHeader(0);
		l.append(3);
		
		l.atPosition(l.head.next,6);
		l.printnodes(l.head);

	}
	
	public void printnodes(Node head)
	{
		Node n = head;
		while(n != null)
		{
			System.out.println(n.data+ " ");
			n = n.next;
		}
	}
	
	public void addAtHeader(int d)
	{
		Node node = new Node(d);
		
		node.next = head;
		
		head = node;
		
	}
	
	public void append(int data)
	{
		Node newnode = new Node(data);
		
		if(head == null)
		{
			head = newnode;
			return;
			
		}
		
		newnode.next = null;
		
		Node n = head;

		while(n.next != null)
			n = n.next;

		
		n.next = newnode;
		return;
	}
	
	public void atPosition(Node prev, int data)
	{
		Node newnode = new Node(data);

		newnode.next = prev.next;
		
		prev.next = newnode;
	}
	
	

}
