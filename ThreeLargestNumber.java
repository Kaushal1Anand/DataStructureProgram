package AlgoExpert;

public class ThreeLargestNumber {

	public static void main(String[] args) {
		int[] arr = { 141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7 };
		int[] largestArr = { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
		for (int num : arr) {
			update(largestArr,num);
			System.out.print(num + " ");
		}
		System.out.println();
		
		 for(int x : largestArr) { 
			 System.out.print(x + " ");
		 }
		 System.out.println();
		 

	}

	public static void update(int[] largestArr, int num) {
		if ( num > largestArr[2]) {
			shiftAndUpdate(largestArr, num, 2);
		} else if ( num > largestArr[1]) {
			shiftAndUpdate(largestArr, num, 1);
		} else if ( num > largestArr[0]) {
			shiftAndUpdate(largestArr, num, 0);
		}

	}

	public static void shiftAndUpdate(int[] largestArr, int num, int idx) {
		for (int x = 0; x <= idx; x++) {
			if (x == idx) {
				largestArr[x] = num;
			
			} else {
				largestArr[x] = largestArr[x + 1];
			}
		}

	}

}
