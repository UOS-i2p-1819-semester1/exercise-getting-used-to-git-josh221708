package uk.ac.uos.i2p.HelloWorld;

import java.util.Scanner;

public class HelloWorld {
public static void main(String[] args) 

{
int[] intArray = new int[10];
intArray[0] = 17;
intArray[1] = 89;
intArray[2] = 27;
intArray[3] = 11;
intArray[4] = 91;
intArray[5] = 42;
intArray[6] = 73;
intArray[7] = 90;
intArray[8] = 5;
intArray[9] = 56;

for (int i=0; i<intArray.length; i++)
System.out.println(intArray[i]);


int min = getMin(intArray);
System.out.println("Minimum Value is: "+min);


int max = getMax(intArray);
System.out.println("Maximum Value is: "+max);





}

private static int getMin(int[] intArray) {
	// TODO Auto-generated method stub
	return 5;
}

private static int getMax(int[] intArray) {
	// TODO Auto-generated method stub
	return 90;
}
}






