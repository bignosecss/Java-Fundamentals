package IntList;

public class IntList {

    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        this.first = f;
        this.rest = r;
    }

    public int size() {
        if (this.rest == null) {
            return 1;
        } else {
            return 1 + this.rest.size();
        }
    }

    public int iterativeSize() {
        IntList copyListP = this;
        int size = 1;
        while (copyListP != null) {
            size = size + 1;
            copyListP = copyListP.rest;
        }
        return size;
    }

    public int get(int i) {
        IntList copyIntList = this;
        if (i == 0) {
            return copyIntList.first;
        } else {
            for (int j = 1; j <= i; j++) {
                copyIntList = copyIntList.rest;
            }
            return copyIntList.first;
        }
    }

    public int recurGet(int i) {
        if (i == 0) {
            return this.first;
        } else {
            return this.rest.recurGet(i - 1);
        }
    }

    public static void main(String[] args) {
        IntList L = new IntList(Integer.parseInt(args[0]), null);
        L.rest = new IntList(Integer.parseInt(args[1]), null);
        L.rest.rest = new IntList(Integer.parseInt(args[2]), null);

        for (int x = 0; x <= L.size(); x++) {
            System.out.println("The " + x + "th number of int list is: " + L.get(x));
        }

    }

}