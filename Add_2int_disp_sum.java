import java.io.*;
public class Add_2int_disp_sum {
public static void main(String[] args) throws Exception
{
	BufferedReader obj = 
	new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 2 Numbers :");
	int a = Integer.parseInt(obj.readLine() ); // 10
	int b = Integer.parseInt(obj.readLine() );  // 20
	int c = a+b;
	System.out.println("Sum = "+ c);
} }