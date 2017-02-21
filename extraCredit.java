package assignment5;

public class extraCredit {
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		nums1=new int[m+n];
		nums2=new int[n];
		
		int i,j,k;
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				if(nums2[j]<=nums1[i]){
					for(k=i;k<m;k++){
						nums1[k+1]=nums1[k];
					}
					nums1[i]=nums2[j];
					for(k=j;k<n-1;k++){
						nums2[k]=nums2[k+1];
					}
				}
				else break;
			}
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
		ec.merge(nm1, 5, nm2, 5);
		System.out.println("Merging two arrays: ");
		for(int i=0;i<10;i++)
			System.out.print(nm1[i]+" ");
	}
}
