
public class Heap {
	
	public static void heapify(int array[], int i, int j){
		int k;
		if (2 * i + 2 <= j){
			k = array[2 * i + 2] > array[2 * i + 1] ? 2 * i + 2 : 2 * i + 1;
		}
		else if(2 * i + 1 <= j){
			k = 2 * i + 1;
		}
		else{
			return;
		}
		
		if (array[i] < array[k]){
			int temp = array[i];
			array[i] = array[k];
			array[k] = temp;
		}
		
		heapify(array, k, j);
	}
	
	public static void buildHeap(int array[]){
		for (int i = array.length / 2 - 1; i >= 0; i--){
			heapify(array, i, array.length - 1);
		}
	}
	
	public static void heapSort(int array[]){
		buildHeap(array);
		int temp;
		
		for (int i = array.length - 1; i > 0; i--){
			temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			heapify(array, 0, i - 1);
		}
	}
	
	public static void print(int array[]){
		for (int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
}