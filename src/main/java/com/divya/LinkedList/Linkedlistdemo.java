package com.divya.LinkedList;

import java.util.Collections;

public class Linkedlistdemo {
	
	Node head;
	
	class Node{
		Node next;
		int d;
		
		Node(int data)
		{
			d = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		
		Linkedlistdemo ll = new Linkedlistdemo();
		ll.addNodes(1);
		ll.addNodes(2);
		ll.addNodes(3);

		ll.addBeforeHead(-1);
		ll.addBeforeHead(0);
		

		
		ll.insertafterValue(2, 6);
		
		ll.addMiddle(ll.head.next,5);
		
		ll.delNodeAtlast();
		
		ll.printNode(ll.head);

	}
	
	public void delNodeAtlast()
	{
		Node tmp = head;
		
		while(tmp.next != null)
		{
			tmp = tmp.next;
		}
		
		tmp = null;
	}
	
	public void addNodes(int data)
	{
		Node newnode = new Node(data);
		
		newnode.next = null;
		
		if(head == null)
		{
			head = newnode;
			return;
		}
		
		Node tmp = head;
		while(tmp.next != null)
		{
			tmp = tmp.next;
		}
	
		
		tmp.next = newnode;
		
	}
	
	public void printNode(Node n)
	{
		Node temp = n;
		while( temp != null)
		{
			System.out.println(temp.d+ " ");
			
			temp = temp.next;
		}
	}
	
	public void addBeforeHead(int data)
	{
		
		Node newnode = new Node(data);
		
		newnode.next = head;
		
		head = newnode;
		
	}

	
	public void addMiddle(Node prev,int data)
	{
		
		Node newnode = new Node(data);
		newnode.next = prev.next;
		prev.next = newnode;
		
		
	}
	
	public void insertafterValue(int prev,int data)
	{
		Node newnode = new Node(data);
		
		Node temp = head;
		
		while(temp.d != prev)
		{
			//System.out.println(temp.d+   "   ");
			temp = temp.next;
		}
		
		newnode.next = temp.next;
		temp.next = newnode;
	}
}
