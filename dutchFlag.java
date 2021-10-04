public class dutchFlag{
	public static void main(String args[]){
		int t[] = {0, 1, 2, 0, 2, 1, 1};
		dutch_three(t, 1);
		print_arr(t);
		System.out.println();
		int t2[] = {1, 2, 2, 2, 1, 2};
		int t3[] = {2, 2, 2, 1, 1, 1};
		int t4[] = {1, 1, 2, 2, 2, 1};

		dutch_two(t2, 2);
		dutch_two(t3, 2);
		dutch_two(t4, 2);

		print_arr(t2);
		System.out.println();
		print_arr(t3);
		System.out.println();
		print_arr(t4);
		System.out.println();

	}

	public static void dutch_three(int[] arr, int mid_value){
		int bottom_index = 0;
		int current_index = 0;
		int top_index = arr.length - 1;

		while (current_index<=top_index){
			if (arr[current_index]<mid_value){
				// If value < mid value we will update the top-bottom index and it's respective elements, then move on to the next on the list 
				int aux = arr[current_index];
				arr[current_index] = arr[bottom_index];
				arr[bottom_index] = aux;
				current_index++;//next element
				bottom_index++; // update top-bottom index,any value before it is sorted.
			}
			else if (arr[current_index]>mid_value){
				int aux = arr[current_index];
				arr[current_index] = arr[top_index];
				arr[top_index] = aux;
				top_index--; 
			}else{
				current_index++;
			}
		}
	}

	public static void dutch_two(int [] arr, int mid_value){
		int mid_index = arr.length-1;
		int current_index = 0;

		while (current_index<mid_index){
			if(arr[current_index]>=mid_value){
				int aux = arr[current_index];
				arr[current_index] = arr[mid_index];
				arr[mid_index] = aux;
				mid_index--;
			}else {
				current_index++;
			}
		}
	}

	public static void print_arr(int[] arr){
		System.out.print("[");
		for(int i=0;i<arr.length; i++){
			if(i==arr.length-1){System.out.print(arr[i]);}
			else {System.out.print(arr[i]+", ");}
		}
		System.out.print("]");
	}
}