package asus;

public class Jump_search_ex {
		public static int jumpSearch(int [] numbers,int target) {
			int n=numbers.length;
			int step=(int) Math.sqrt(n);
			int prev=0;
			
			while(numbers[Math.min(step, n)-1]<target) {
				prev=step;
				step  +=(int) Math.sqrt(n);
				if (prev>=n) {
					return-1;
				}
				
			}
			for(int i=prev;i<Math.min(step,n);i++) {
				if(numbers[i]==target) {
					return i;
				}
			}
			return -1;
			
		}
		public static void main(String[] args) {
	        int[] numbers = {2, 3, 4, 5, 6, 7}; 
	        int target = 6;

	        int result = jumpSearch(numbers, target);

	        if (result != -1) {
	            System.out.println("Found " + target + " at index " + result);
	        } else {
	            System.out.println("Number " + target + " not found");
	        }
	    }

		

	}

