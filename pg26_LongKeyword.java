public class pg26_LongKeyword {
	public long longMethod() {
		return 10L;
	}

	public static void main(String[] args) {
		pg26_LongKeyword obj = new pg26_LongKeyword();
		long doubleVal = (long) 10.5;
		long floatVal = (long) 10f;
		long charVal = 'a';

		System.out.println("Double to Long value : " + doubleVal);
		System.out.println("Float to Long value : " + floatVal);
		System.out.println("Char to Long value : " + charVal);

		System.out.println("Method Returns Long value :" + obj.longMethod());

	
		// Max value is equal to 2^63 - 1
		System.out.println("The Maximum value allowed in long variable is : " + Long.MAX_VALUE);

		// Min value is equal to -2^63
		System.out.println("The Minimum value allowed in long variable is : " + Long.MIN_VALUE);
	}
}
