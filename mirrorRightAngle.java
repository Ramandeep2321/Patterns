import java.util.Scanner;
public class mirrorRightAngle{
public static void main(String raman[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the total size of reverse triangle");
int a=s.nextInt();
int p=a-1;
for(int i=0;i<=a;i++){
	for(int j=p;j>=i;j--){
	System.out.print(" ");
	}
	for(int k=1;k<=i;k++){
	System.out.print("*");
	}
	System.out.println();
}
}
}
