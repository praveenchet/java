package BASICPROJECTS;

public class logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    // && operator
			    System.out.println((5 > 3) && (8 > 5));  // true
			    System.out.println((5 > 3) && (8 < 5));  // false

			    // || operator
			    System.out.println((5 < 3) || (8 > 5));  // true
			    System.out.println((5 > 3) || (8 < 5));  // true
			    System.out.println((5 < 3) || (8 < 5));  // false

			    // ! operator
			    System.out.println(!(5 == 3));  // true
			    System.out.println(!(5 > 3));  // false
			  }
}
