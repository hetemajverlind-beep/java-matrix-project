import java.util.Scanner;
public class Matrix{
	public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
	int rowColom = 0;
	int det = 0;
	
	System.out.println("MATRIX");
	do{
	System.out.println("What row and colom is your matrix (2,3): ");
	rowColom = scan.nextInt();
	}
	while(rowColom<2 && rowColom>3);
	
	int[][] matrix = new int[rowColom][rowColom];
	
	
	
	for(int i=0;i<rowColom;i++){
		for(int x=0;x<rowColom;x++){
			System.out.print("a"+(i+1)+(x+1) +" = ");
			matrix[i][x] = scan.nextInt();
		
		}
	}
	
	
	
	System.out.println("MATRIX : ");
	for(int i=0;i<rowColom;i++){
		for(int x=0;x<rowColom;x++){
			System.out.print(matrix[i][x] + " ");
		}
		System.out.println();
	}
	
	if(rowColom==2){
		
		 det = matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
	}
	else{
		 det =
			matrix[0][0]*(matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1])
			- matrix[0][1]*(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0])
			+ matrix[0][2]*(matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]);
	}
	
	
	System.out.println("Determinant of the matrix is : "+ det);
	
	
	
	
	}


}