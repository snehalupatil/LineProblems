import java.util.Scanner;

public class CheckEqualLines {

	public static void main(String[] args) {
		Double x1,x2,y1,y2,z1,z2,w1,w2;
		Double dis1, dis2;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x1:");
		x1=sc.nextDouble();
		System.out.println("Enter y1:");
		y1=sc.nextDouble();
		System.out.println("Enter x2:");
		x2=sc.nextDouble();
		System.out.println("Enter y2:");
		y2=sc.nextDouble();
		
		System.out.println("Enter w1:");
		w1=sc.nextDouble();
		System.out.println("Enter w2:");
		w2=sc.nextDouble();
		System.out.println("Enter z1:");
		z1=sc.nextDouble();
		System.out.println("Enter z2:");
		z2=sc.nextDouble();
		
		dis1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		dis2=Math.sqrt((w2-w1)*(w2-w1) + (z2-z1)*(z2-z1));
		
		if (dis1.equals(dis2))
			System.out.println("The given straight lines are identical");
			
		else
			System.out.println("The given staright lines are not identical");
		
	}

}
