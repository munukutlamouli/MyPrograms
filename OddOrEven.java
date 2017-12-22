
public class OddOrEven {

	public static void main(String[] args) {
		int input = 1735;
        while (input > 0) {
            if (input % 2 == 0) {
               // System.out.println(input % 10 + " is even");
            } else {
                System.out.println(input % 10 + " is odd");
            }
            input = input / 10;
        }

	}

}
