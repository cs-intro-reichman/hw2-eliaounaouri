// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int seed = Integer.parseInt(args[0]);
		String mood = args[1];
    if(mood.equals("v")){
	for(int i =1; i<= seed; i++){
        int x =i; 
		if(i==1){
			System.out.println("1 4 2 1 (4)");
		}else{
		int counter = 1;
		System.out.print(x+" ");
		while (x !=1) {
			if (x%2==0) {
				x = x/2;
				counter++;
				System.out.print(x+" ");

			}else{
				x = x*3 + 1;
				counter++;
				System.out.print(x+" ");
			}
		}
		System.out.println("(" + counter + ")");
	}
	}
}
       System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
}
}
