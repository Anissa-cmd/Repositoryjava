package schoolWork;

public class ArrayCode {

	public static void main(String[] args) {
		//1
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//1.a
		int diff = ages[ages.length- 1]- ages[0];
		System.out.println(diff);
		
		//1.b
		int[] age = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
		int diffN = age[age.length - 1] - age[0];
		System.out.println(diffN);
		
		//1.c
		int sumAge = 0;
		for ( int i = 0; i < age.length; i++) {
			sumAge = sumAge + age[i];
			System.out.println(sumAge);
		}
		int average = sumAge / age.length;
		System.out.println("The average is: " + average);
		
		//2
		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//2.a
		int sum = 0;
		for ( int i = 0; i < names.length; i++) {
			sum = sum + names[i].length();
			System.out.println(sum);
		}
		double averageNumber = sum / names.length;
		
		System.out.println("The avarage number is : " + averageNumber);
		
		//2.b
		String names1[] = {"Sam Tommy Tim Sally Buck Bob"};
		int sumN = 0;
		for (int i = 0; i < names1.length; i++) {
			sumN = sumN + names1[i].length();
		}
		System.out.println(sumN);
		
		//3.how do you access the last element of any array?
		int[] example = {4, 7, 12, 14, 15, 18};
			System.out.println(example[example.length - 1]);
				
		//4.how do you access the first element of any array?
			System.out.println(example[0]);
			
		//5.
		String[] nameLengths = new String[] {"Sam, Tommy, Tim, Sally, Buck, Bob"};
		
		//6.
		int sumLength = 0;
		for (int i = 0; i < nameLengths. length; i++) {
			sumLength = sumLength + nameLengths[i].length();
			System.out.println(sumLength);
		}
		
		//7.
		String word = "Hello";
		int a = 3;
		String s = createS1(word, a);
		  System.out.println(s);
		  
	   //8.
	   String firstName = "Ashley";
	   String lastName = "White";
	   String fullName = createFullName(firstName, lastName);
		System.out.println(fullName);
	 
	  //9.
		int[] arr = {65, 72, 95};
		int sumArr =0;
		
	    for (int i = 0; i < arr.length; i++) {
			sumArr = sumArr + arr[i];
			System.out.println(sumArr > 100);
		}
		
	    //10
	    int arrA[] = {2, 4, 5, 6, 8, 10, 12, 14};
		int number = arrA.length;
		  System.out.println(average(arrA, number));
		
		for (int i = 0; i < arrA.length; i++) {
			sum = sum + arrA[i];
		}
		
		//11.
		int[] array1 = {30, 50, 70, 90};
		int sum1 = 0;
		int[] array2 = {20, 40, 60, 80};
		int sum2 = 0;
		
	    for (int i = 0; i < array1.length; i++ ) {
	    	sum1 = sum + array1[i];
	    }
		int average1 = sum1 / array1.length;
		System.out.println("Average1 : " + average1);
		
	    for (int i = 0; i < array2.length; i++ ) {
		    	sum2 = sum + array2[i];
		    }
	    int average2 = sum2 / array2.length;
			System.out.println("Average2 : " + average2);
			System.out.println(average1 > average2);
		
		//12.
		int isHotOutside = 100;
		double moneyInPocket = 11.00;
		boolean willBuyDrink = createBoolean(isHotOutside, moneyInPocket);
			System.out.println(willBuyDrink);
			
		//13.
		int group1 = 25; 
		int group2 = 16;
		int sumGroups = createsumGroups(group1, group2);
		System.out.println(sumGroups);
		
		
	}

	private static int createsumGroups(int group1, int group2) {
		
		return group1 + group2;
	}

	private static boolean createBoolean(int isHotOutside, double moneyInPocket) {
		
		return isHotOutside > 98 && moneyInPocket > 10.50;
	}

	private static int average(int[] arrA, int number) {
		int sum = 0;
		return sum / number;
	}

	private static String createFullName(String x, String y) {
		
		return x + " " + y;
	}

	private static String createS1(String word, int a) {
	
		return word + word + word;
	}

}
