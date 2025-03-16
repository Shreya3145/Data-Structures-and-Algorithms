package Arrays;
public class Remove {
	public static void main(String[]args) {
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {20,30};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					arr1[i]=Integer.MIN_VALUE;
				}
				int count=0;
				int min=0;
				for(int a:arr1) {
					if(a==min)
						count++;
				}
				int[] res =new int[arr1.length-count];
				int index=0;
				for(int k=0;k<arr1.length;k++) {
					if(arr1[i]!=min) {
						res[index+1]=arr1[i];
						}
				}
		}
	}		
	}
	}
