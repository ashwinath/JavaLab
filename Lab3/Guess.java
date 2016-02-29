import java.util.Scanner;

public class Guess {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int numset = 5;
		//numset = Integer.parseInt(args[0]); // if you want arbitrary number of sets
		int numlen = Integer.toString((1<<(numset))-1).length();
		int choice = 0;
		int guess = 0;
		System.out.println("Think of a number 1-"+((1<<(numset))-1)+", inclusive.");
		for (int i=0; i<numset; i++) {
			// System.out.println("Set"+(i+1));
			for (int j=0; j<(1<<(numset-1)); j++) {
				x = ((((1<<(numset-1-i))-1)<<i)&j)<<1;
				x += 1<<i;
				x += ((1<<i)-1)&j;
				for (int k=Integer.toString(x).length(); k<numlen; k++)
					System.out.print(" ");
				System.out.print(x+" ");
				if ((j+1)%(1<<(numset<3 ? numset-1 : numset/2))==0) System.out.println("");
			}
			System.out.print("Is your number in this set? ");
			choice = scanner.nextInt();
			System.out.println("");
			// Assuming 0 or 1 only
			guess += choice<<i;
		}
		System.out.println("Your number is: "+guess);
	}
}
