package set;

public class RemoveDuplicates {

	public static int[] uniqueElements(int[] ints) {
		MaxSet<Integer> unique = new MaxSet<Integer>();
		for (int i : ints) {
			unique.add(i);
		}
		int[] sorted = new int[unique.size()];
		for (int i = sorted.length - 1; i >= 0; i--) {

			sorted[i] = unique.getMax();

			unique.remove(unique.getMax());

		}

		return sorted;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] o = new int[] { 7, 5, 3, 5, 2, 2, 7 };

		int[] j = uniqueElements(o);

		for (int i = 0; i < j.length; i++) {

			System.out.println(j[i]);
		}
	}

}