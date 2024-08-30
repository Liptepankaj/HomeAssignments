package week1.HomeAssignmentsW1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		int a[]={1,4,3,2,8,6,7};
		boolean found ;

		Arrays.sort(a);
		for (int j = 0; j < a.length; j++) {
			System.out.print(" "+a[j]);
		}
		for(int i=1;i<a.length;i++)
		{
			found=false;
			for(int num:a)

			{
				if(num==i)
				{
					found=true;
					break;
				}
			}
			if(!found)
			{
				System.out.println('\n'+"Missing Element is: "+i);
			}
		}

	}
}