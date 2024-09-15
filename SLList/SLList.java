public class SLList {
	public static class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		} 
	}

	/* The first item (if it exists) is at sentinel.next */
	private IntNode sentinel;
	private IntNode last;
	private int size;

	public SLList() {
		sentinel = new IntNode(63, null);
		last = sentinel; // Initialize lastt to sentinel
		size = 0;
	}
	public SLList(int x) {
		sentinel = new IntNode(63, null);
		sentinel.next = new IntNode(x, null);
		last = sentinel.next; // Initialize last to the first node
		size = 1;
	}

	public void addFirst(int x) {
		sentinel.next = new IntNode(x, sentinel.next);
		size += 1;
	}

	public void addLast(int x) {
		last.next = new IntNode(x, null);
		last = last.next;
		size += 1;
	}

	public int getFirst() {
		return sentinel.next.item;
	}

	private static int size(IntNode p) {
		if (p.next == null) {
			return 1;
		}
		return 1 + size(p.next);
	}

	public int size_helper() {
		return size(sentinel.next);
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		SLList L = new SLList(15);
		L.addFirst(10);
		L.addFirst(5);
		L.addLast(20);
		int x = L.getFirst();

		System.out.println(L.size);
	}
}
