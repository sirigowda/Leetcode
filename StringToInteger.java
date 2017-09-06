
public class StringToInteger {

	public int myAtoi(String str) {
		// remove white spaces
		str = str.trim();

		// check if string is empty
		if (str.length() == 1)
			return 0;

		// determine if the integer is positive or negative
		boolean positive = true;
		if (str.charAt(0) == '+' || str.charAt(0) == '-') {
			if (str.charAt(0) == '-')
				positive = false;
			str = str.substring(1, str.length());
		}

		// convert string to integer
		int val = 0;
		for (char i : str.toCharArray()) {
			int digit = i - '0';
			if (digit < 0 || digit > 9) {
				return positive == true ? val : ((-1) * val);
			}
			if (Integer.MAX_VALUE / 10 < val || (Integer.MAX_VALUE / 10 == val && Integer.MAX_VALUE % 10 < digit)) {
				return positive == true ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			val = 10 * val + digit;
		}
		return positive == true ? val : ((-1) * val);
	}

}
