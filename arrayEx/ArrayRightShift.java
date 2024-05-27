package arrayEx;

import java.util.Arrays;

public class ArrayRightShift {
	public static void rightShift(int array[],int num) {
		for(int i=0;i<num;i++) {
		int temp=array[array.length-1];
		for(int j=0;j<array.length-1;j++)
			array[j]=array[j+1];
		array[array.length-1]=temp;
	}
		for(int a:array)
			System.out.println(a);
	}
	public static void main(String[] args) {
		//System.out.println(Arrays.toString(rightShift([1,2,3,4,5], 2)));
		
		rightShift(new int[]{1,2,3,4,5}, 2);
	}

}
