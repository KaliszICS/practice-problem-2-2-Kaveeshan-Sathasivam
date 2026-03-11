/* 
File: Lesson 2.2 - More Functions
Author: Kaveeshan Sathasivam
Date Created: Mar 11, 2026
Date Last Modified: Mar 11, 2026
*/


public class PracticeProblem {

	public static void main(String args[]) {
		

}
	public static boolean isEven(int number) {
    return number % 2 == 0;
}

	public static boolean isOdd(int number) {
    return number % 2 != 0;

	
}
	public static boolean isPositive(int number) {
    return number > 0;
}

	public static boolean isNegative(int number) {
    return number < 0;
}

	public static int combinedLength(String str1, String str2) {
    return str1.length() + str2.length();
}
}
