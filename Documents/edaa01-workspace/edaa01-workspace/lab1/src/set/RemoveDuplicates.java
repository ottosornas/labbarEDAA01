package set;

public class RemoveDuplicates {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		int[] o = new int[] {7,5,3,5,2,2,7};
		int[] j = MaxSet.uniqueElements(o);

		 for(int i = 0; i<j.length; i++){
			System.out.println(j[i]);
		 }
	}

}
