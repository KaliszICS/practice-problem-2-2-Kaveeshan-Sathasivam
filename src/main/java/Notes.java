
class Notes {
	public static void main(String[] args) {

	}

	//void functions, no parameter
	public static void printGreeting() {
        System.out.println("Hello, World!");
    }

    // void function, String parameter
    public static void printPersonalGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

	// int return type, No parameters
    public static int getLuckyNumber() {
        return 42;
    }

    // int return type, One double parameter
    public static int roundDown(double n) {
        return (int)n;
    }

	// String return type, String + int parameters
    public static String repeatWord(String word, int times) {
        return (word + " ").repeat(times).trim();
    }

	// boolean return type, String parameters
	public static boolean stringsMatch(String a, String b) {
        return a.equals(b);
    }
}
