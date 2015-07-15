package selectsort;

public class Merge {

	public static void main(String[] args) {
		// TODO 
		int[] a = { 1, 3, 5, 7 };
		int[] b = { 2, 4, 6 };
		int[] c = merge(a, b);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

	}

	public static int[] merge(int[] a, int[] b) {
		int pa = 0;
		int pb = 0;
		int pc = 0;
		int m = a.length;
		int n = b.length;
		int[] c = new int[m + n];
		while (pa < m && pb < n) {
			if (a[pa] < b[pb]) {
				c[pc++] = a[pa++];
			} else {
				c[pc++] = b[pb++];
			}
		}
		if (pa < m) {
			while (pa < m)
				c[pc++] = a[pa++];
		} else {
			while (pb < n)
				c[pc++] = b[pb++];
		}
		return c;
	}
}
