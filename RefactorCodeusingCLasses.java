import java.util.Scanner;

public class RefactorCodeusingCLasses {

	
public static void main(String args[]){
		int x1,x2,y1,y2;
	    double dis;
	    Scanner sc=new Scanner(System.in);
 	    System.out.println("Enter x1:");
 	    x1=sc.nextInt();
	    System.out.println("Enter y1 point");
	    y1=sc.nextInt();
 	    System.out.println("Enter x2point");
        x2=sc.nextInt();
 	    System.out.println("Enter y2 point");
        y2=sc.nextInt();  
        dis=RefactorCodeusingCLasses.calculateDistance(x1,y1,x2,y2);
	   	    
  	    System.out.println("Distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
 }
	
	static double calculateDistance(int x1,int y1,int x2,int y2)
	{
	    return (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
	}

}



