/*设三角形的三个点为点A（x1,y1）,点B(x2,y2),点C(x3,y3)，知点P（x,y）
  求出各点到M的距离，即向量PA,PB,PC，通过(A_x - P_x,A_y - P_y)得到PA,PB,PC
  叉乘计算(PA_x * PB_x - PA_y * PB_y)三组向量，若三组结果都是同号(同为正，负)
  				即点在三角形内*/

import java.util.*;

class Triangle{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		/*设定三角形的位置*/
		final double A_X = 0,A_Y = 0,B_X = 0,B_Y = 100,C_X = 200,C_Y = 0;
	
		/*点的位置*/
		System.out.print("Enter a point's x and y(x,y):");
		double p_x = input.nextDouble();
		double p_y = input.nextDouble();
	
		/*得出向量PA,PB,PC，(A_x - P_x,A_y - P_y)*/
		final double PA_x = A_X - p_x,
		    	  PA_y = A_Y - p_y,
		  	  PB_x = B_X - p_x,
			  PB_y = B_Y - p_y,
			  PC_x = C_X - p_x,
			  PC_y = C_Y - p_y;
		
		/*叉乘向量(PA_x * PB_x - PA_y * PB_y)*/
		final double PAB = PA_x * PB_y - PA_y * PB_x,
		          PBC = PB_x * PC_y - PB_y * PC_x,
			  PCA = PC_x * PA_y - PC_y * PA_x;
		
		/*三组结果同号即在三角形内*/
		if(PAB > 0 && PCA > 0 && PBC > 0)
			System.out.println("The point is in the triangle");
		else if(PAB < 0 && PCA < 0 && PBC < 0)
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is not in the triangle");
		
	}
}
