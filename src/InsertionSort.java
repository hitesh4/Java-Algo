import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random RandomNumber = new Random();
		int size = RandomNumber.nextInt(50) + 10; 
		System.out.println(size);
		int[] A = new int[size];
		for(int i = 0; i < A.length; i++){
			
			A[i] = randomFill();
		}
		System.out.println(Arrays.toString(A));
		for (int i=1; i<A.length; i++){
			int key = A[i];
			int j=i-1;
			while(j>=0 && A[j]>key){
				A[j+1]=A[j];
				j--;
			}
			A[j+1] = key;
		}
		System.out.println(Arrays.toString(A));
	}
	
	public static int randomFill(){
		Random rand = new Random();
		int randomNum = rand.nextInt(100);
		System.out.println(randomNum);
		return randomNum;
	}

}
