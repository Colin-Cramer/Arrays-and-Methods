
public class Week3 {

	public static void main(String[] args) {
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 101};	
		String[] names = {"Sam", "Tommy","Sally", "Tim", "Buck", "Bob"};
		int[] questionNineArray = {6, 3, 12, 9, 20, 5, 14, 2};
		double[] questionTenArray = {34.52, 23.12, 7.002, 321.6, 19.34};
		double[] questionElevenArray1 = {34.24, 65.24, 234.52, 235.03};
		double[] questionElevenArray2 = {42.63, 342.1445, 723.243, 10.0934};
		boolean isHotOutside = true;
		double moneyInPocket = 10.51;
		
		//variables for question 13.
		boolean amIActuallyTired = true;
		int time = 0450;
		boolean isThereInclementWeather = false;
		boolean isThereEnoughPeopleAtWork = true;
		
		System.out.println(ages[ages.length-1] - ages[0]); // 1a. originally printed 90 when 93 was the last element
		
		System.out.println(ages[ages.length-1] - ages[0]); //1b. now prints 98
		
		//1c. Loop used to iterate through the array and calculate average age
		int avgSum = 0;
		for (int age : ages) {
			avgSum += age;
		}
		System.out.println("The average age is: " + avgSum / ages.length);
		
		//2a. Loop used to calculate the average letters per name.
		double letterSum = 0;
		for (String name : names) {
			letterSum += name.length();
		}
		System.out.println("The Average number of letters per name is: " + letterSum / names.length); 
		
		//2b. Loop used to concatenate all the names together.
		String nameSum = "";
		for (String name : names) {
			nameSum += name + " ";
		}
		System.out.println("Here is a list of all of my friends: " + nameSum);
		
		//5. Loop used to iterate over names[] and add the length of each name to the nameLengths[]
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			System.out.print(nameLengths[i] + " ");
		}
		
		//6. Loop used to iterate over the nameLengths[] and calculate the sum of the elements.
		int nameLengthSum = 0;
		for (int name : nameLengths) {
			nameLengthSum += name;
		}
		System.out.println("\n" + "The sum of the name lengths is: " + nameLengthSum);
		
		//Print statement for problem 7.
		System.out.println(multiplyWord("Goodbye", 5)); 
		
		//Print statement for problem 8.
		System.out.println("My full name is: " + fullName("Colin", "Cramer")); 
		
		//Print statement for problem 9.
		System.out.println("Is the sum of this array > 100?: " + intSumBoolean(questionNineArray)); 
		
		//Print statement for problem 10.
		System.out.println("The average of this array of doubles is: " + doubleAvg(questionTenArray)); 
		
		//Print statement for problem 11.
		System.out.println("The average element of the first array is larger than the second: " + doubleAvgBoolean(questionElevenArray1, questionElevenArray2));
		
		//Print statement for problem 12.
		System.out.println("Should I buy a drink?: " + willBuyDrink(isHotOutside, moneyInPocket));
		
		//Print statement for problem 13.
		System.out.println("Can I sleep for 10 more minutes?: " + shouldIHitSnooze(amIActuallyTired, time, isThereInclementWeather, isThereEnoughPeopleAtWork));
	}
	
	//7. Method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
	public static String multiplyWord(String word, int n) {
		String product = "";
		for (int i = 0; i < n; i++) {
			product += word;
		}
		return product;
	}
	
	//8. Method that takes two Strings, firstName and lastName, and returns a full name
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
		 
	}
	
	//9. Method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean intSumBoolean(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum > 100;
	}
	
	//10. Method that takes an array of double and returns the average of all the elements in the array.
	public static double doubleAvg(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}
	
	//11. Method that takes two arrays of double and returns true if the average of the elements in the 
	//first array is greater than the average of the elements in the second array
	public static boolean doubleAvgBoolean(double[] numbers1, double[] numbers2) {
		double sum1 = 0;
		double sum2 = 0;
		
		for (double number1 : numbers1) {
			sum1 += number1;
		}	
		
		for (double number2 : numbers2) {
			sum2 += number2;
		}
		return (sum1 / numbers1.length) > (sum2 / numbers2.length);
		}
	
	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, 
	//and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean x, double y) {
		return (x && y > 10.50);
	}
	
	//13. Method named shouldIHitSnooze that takes a boolean amIActuallyTired, double time,  boolean isThereInclementWeather, 
	//boolean isThereEnoughPeopleAtWork and returns true if amIActuallyTired is true, time is greater than 0445 and less than 0500,
	//isThereInclementWeather is false or isThereEnoughPeopleAtWork is true.
	public static boolean shouldIHitSnooze(boolean x, int y, boolean z, boolean zz) {
		return (x == true &&  (y > 0445 && y < 0500) && (z == false || zz == true));
	}
}
	