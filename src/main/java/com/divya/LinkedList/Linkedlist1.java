package com.divya.LinkedList;

public class Linkedlist1 {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {

Linkedlist1 l1 = new Linkedlist1();

l1.insertfirst(0);
l1.append(1);
l1.insertMiddle(l1.head.next, 2);
l1.printnod(l1.head);
	}
	
	public void insertfirst(int data)
	{
		Node newnode = new Node(data);
		
	newnode.next= head;
	head = newnode;
			
	}
	
	public void insertMiddle(Node prev, int data)
	{
		Node node = new Node(data);
		
		node.next = prev.next;
		
		prev.next= node;
				
	}
	
	public void append(int d)
	{
		Node node = new Node(d);
		
		if(head == null)
		{
			head = node;
			return;
		}
		
		node.next= null;
		
		Node tmp = head;
		while(tmp.next != null)
			tmp = tmp.next;
		
		tmp.next = node;
		return;
	}
	
	public void printnod(Node head)
	{
		Node n = head;
		while(n != null)
		{
			System.out.println(n.data+" ");
			n = n.next;
		}
	}

}
