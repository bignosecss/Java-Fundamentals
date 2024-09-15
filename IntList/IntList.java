public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	public int size() {
		if (rest == null) {
			return 1;
		}
		return 1 + rest.size();
	}

	public int get(int i) {
		if (i == 0) {
			return first;
		}
		return rest.get(i - 1);
	}

	public int iterativeSize() {
		int size = 0;
		IntList i = this;

		while (i != null) {
			size = size + 1;
			i = i.rest;
		}
		return size;
	}

	public IntList addFirst(int x) {
		return new IntList(x, this);
	}

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.println("Initial List:");
		System.out.println(L.first);
		System.out.println(L.rest.first);
		System.out.println(L.rest.rest.first);

		L = L.addFirst(20);
		System.out.println("List after adding 20:");
		System.out.println(L.first);
		System.out.println(L.rest.first);
		System.out.println(L.rest.rest.first);
		System.out.println(L.rest.rest.rest.first);

		//System.out.println(L.size());
		//System.out.println(L.iterativeSize());
		System.out.println(L.get(0));
		System.out.println(L.get(1));
		System.out.println(L.get(2));
	}
}
