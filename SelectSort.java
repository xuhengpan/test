package selectsort;

public class SelectSort {

	public static void main(String[] args) {
		// TODO �Զ���ɵķ������
		int[] a = { 12, 23, 9, 24, 15, 3, 18 };
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
		selectSort(a);
		for (int m = 0; m < a.length; m++) {
			System.out.print(a[m] + " ");
		}
	}

	private static void selectSort(int[] a) {
		int n = a.length;
		for (int k = 0; k < n - 1; k++) {
			int min = k;
			for (int i = k; i < n; i++) {
				if (a[i] < a[min]) {
					min = i;
				}

			}
			if (k != min) {
				int temp = a[k];
				a[k] = a[min];
				a[min] = temp;
			}
		}
	}
}
