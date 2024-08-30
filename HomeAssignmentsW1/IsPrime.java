package week1.HomeAssignmentsW1;

public class IsPrime {

	public static void main(String[] args) {

		int num = 14;
		int temp = 0;

		for (int i = 2; i < num-1; i++) {

			if(num%i==0) {

				temp = temp=1;

			}			

		}
		if(temp>0) {
			System.out.println(num +" is not a Prime Number");
		}else {
			System.out.println(num +" is a Prime Number");
		}
	}

}
