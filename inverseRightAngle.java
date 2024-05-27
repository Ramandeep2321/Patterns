import java.util.Scanner;
public class inverseRightAngle{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of rows u want");
int n=s.nextInt();
for(int i=0;i<=n;i++){
	for(int j=n;j>=i;j--){
	System.out.print("* ");
	}
	System.out.println();
}
}
}
