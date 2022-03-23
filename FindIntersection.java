package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		
		int arr1[] = {2,4,6,8,9};
		int arr2[] = {1,3,6,7,9};
		
		for (int i=0;i<arr1.length;i++)
		{
			for (int j=0;j<arr2.length;j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
				
		}
		
		// TODO Auto-generated method stub

	}

}
