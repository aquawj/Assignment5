package assignment5;

public class extraCredit {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = 0, j = 0;

		int countInNums1 = m;
		for (j = 0; j < n; j++) {
			while (nums1[i] < nums2[j] && i < nums1.length - 1) {
				i++;
			}
			// found one in nums1 with the index of i that is bigger than nums2[j]
			// move all the elements after nums1[i] backward
			for (int k = countInNums1; k > i; k--) {
				nums1[k] = nums1[k - 1];
			}
			nums1[i] = nums2[j]; // insert nums2[j] in this proper position
			countInNums1++; // valid elements in nums1 added
			i++;
		}
	}
	public static void main(String args[]){
		extraCredit ec=new extraCredit();
		int[] nm1=new int[10];
		nm1[0]=1;
		nm1[1]=2;
		nm1[2]=3;
		nm1[3]=5;
		nm1[4]=6;

		int[] nm2=new int[]{0,3,4,6,8};
		merge(nm1, 5, nm2, 5);
		System.out.println("Merging two arrays: ");
		for(int i=0;i<10;i++)
			System.out.print(nm1[i]+" ");
	}
}
