// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		double pai = 1;
		double y = 1;
		double x = (1/y);
		int num = Integer.parseInt(args[0]);
		for(int i = 0; i<num-1; i++){
			if(i%2==0){
				y = y + 2;
				x = (1/y);
				pai = pai - x;
			}else{
				y = y + 2;
				x = (1/y);
				pai = pai + x;
			}
			
		}
		System.out.println("pi according to java: " + Math.PI);
		System.out.println("pi, approximated:     " + pai*4);
	}
}
