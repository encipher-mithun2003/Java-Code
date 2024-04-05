import java.util.*;

class Unit {
	static void Multiples(int current, int n, int unitDigit)
	{
		if (current > n) {
			return;
		}

		if (current % unitDigit == 0) {
			System.out.print(current + " ");
			Multiples(current + unitDigit, n, unitDigit);
		}
		else {
			Multiples(current + 1, n, unitDigit);
		}
	}
	public static void main(String[] args)
	{
		int n = 39;
		int unitDigit = n % 10;
		if (unitDigit == 0) {
			unitDigit = 10;
		}

		Multiples(unitDigit, n, unitDigit);
	}
}
