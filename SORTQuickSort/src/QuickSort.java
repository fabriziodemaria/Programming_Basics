
public class QuickSort {

	public static void sort(int[] array) {
		
		helper(array,0,array.length-1);
		
	}

	private static void helper(int[] array, int start, int end){
		
		if(start>=end) return;		

		int pivot = scan(array,start,end);
		helper(array,start,pivot-1);
		helper(array,pivot,end);
	}

	private static int scan(int[] array, int start, int end){
		int i = start;
		int j = end;
		int p = array[(start+end)/2];
//		System.out.print("Beginning scan --- Array now :");
//		for(int g = 0 ; g < 9; g++){
//			System.out.print(array[g] + " ");
//		}
//		System.out.println();
		while(i<j){
			while(array[i]<p) i++;
			while(array[j]>p) j--;
			if(i<j){
				exchange(array,i,j);
//				System.out.print("Exchanged --- Array now :");
//				for(int g = 0 ; g < 9; g++){
//					System.out.print(array[g] + " ");
//				}
//				System.out.println();
			}
			i++;
			j--;
		}
//		System.out.print("Pivot was " + p + " --- Array now :");
//		for(int g = 0 ; g < 9; g++){
//			System.out.print(array[g] + " ");
//		}
//		System.out.println("Return " + i);
		return i;
	}

	private static void exchange(int[] array, int a, int b){
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}

}


