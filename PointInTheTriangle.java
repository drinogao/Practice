import java.util.*;

class Triangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		final double A_X = 0,A_Y = 0,B_X = 0,B_Y = 100,C_X = 200,C_Y = 0;
		System.out.print("Enter a point's x and y(x,y):");
		double p_x = input.nextDouble();
		double p_y = input.nextDouble();

		final double PA_x = A_X - p_x,
		    	  PA_y = A_Y - p_y,
		  	  PB_x = B_X - p_x,
			  PB_y = B_Y - p_y,
			  PC_x = C_X - p_x,
			  PC_y = C_Y - p_y;

		final double PAB = PA_x * PB_y - PA_y * PB_x,
		          PBC = PB_x * PC_y - PB_y * PC_x,
			  PCA = PC_x * PA_y - PC_y * PA_x;

		if(PAB > 0 && PCA > 0 && PBC > 0)
			System.out.println("The point is in the triangle");
		else if(PAB < 0 && PCA < 0 && PBC < 0)
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is not in the triangle");
		
	}
}
