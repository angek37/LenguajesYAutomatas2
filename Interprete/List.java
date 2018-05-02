import java.util.*;


public class List implements Iterable<String>{
	private Node<Object> head;

	public List() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void add(String id, Object data) {
		if(!exist(id)) {
			head = new Node<Object>(id, data, head);
		}else {
			Node<Object> tmp = head;

			while(!tmp.identificator.equals(id)) {
				tmp = tmp.next;
			}

			tmp.data = data;
		}

	}

	public Object get(String id) {
		Object res = null;
		Node<Object> tmp = head;

		while(!tmp.identificator.equals(id)) {
			tmp = tmp.next;
		}

		if(tmp != null) {
			res = tmp.data;
		}
		return res;
	}

	public Object getFirst() {
		if (head == null) throw new NoSuchElementException();
		return head.data;
	}

	public Object removeFirst() {
		Object tmp = getFirst();
		head = head.next;
		return tmp;
	}

	public void clear() {
		head = null;
	}

	public boolean exist(String id) {
		boolean b = false;
		Node<Object> tmp = head;

		while(tmp != null && !tmp.identificator.equals(id)) {
			tmp = tmp.next;
		}

		if(tmp != null) {
			b = true;
		}
		return b;
	}


	public void remove(String id) {
		if(head == null) throw new RuntimeException("No puede eliminarse");

		if(head.identificator.equals(id)) {
			head = head.next;
			return;
		}

		Node<Object> cur = head;
		Node<Object> prev = null;

		while(cur != null && !cur.identificator.equals(id)) {
			prev = cur;
			cur = cur.next;
		}

		if(cur == null) throw new RuntimeException("No puede eliminarse");

		prev.next = cur.next;
	}

	public String Type(String id) {
		String t = "'" + id + "' No existe";

		Node<Object> tmp = head;

		while(tmp != null && !tmp.identificator.equals(id)) {
			tmp = tmp.next;
		}

		if(tmp != null) {
			t = tmp.data.getClass().toString();
			String separator[] = t.split(" ");
			separator = separator[1].split("\\.");
			t = separator[2];
		}

		return t;
	}


	public String toString() {
		StringBuffer result = new StringBuffer();
		for(Object x : this) result.append(x + " ");
		return result.toString();
	}

	private static class Node<E> {
		private String identificator;
		private E data;
		private Node<E> next;

		public Node(String identificator, E data, Node<E> next) {
			this.identificator = identificator;
			this.data = data;
			this.next = next;
		}
	}

	public Iterator<String> iterator(){
		return new ListIterator();
	}

	private class ListIterator implements Iterator<String> {
		private Node<Object> nextNode;

		public ListIterator() {
			nextNode = head;
		}

		public boolean hasNext() {
			return nextNode != null;
		}

		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			String res = nextNode.identificator;
			nextNode = nextNode.next;
			return res;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
