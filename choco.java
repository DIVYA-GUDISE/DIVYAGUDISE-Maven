package epamtask.Newyear;
import java.lang.*;
import java.util.Scanner;
interface choco {
	void func();
}
class ArraySort implements choco
{
    public void func()
    {
        int i,j,tmp;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of array elements");
	    int count = scan.nextInt();
	    System.out.println("enter array elements");
	    int number[] = new int[count];
	    for(i=0;i<count;i++) 
	    {
	        number[i] = scan.nextInt();
	    }
	    for (i = 0; i < count; i++) 
        {
            for (j = i + 1; j < count; j++) { 
                if (number[i] > number[j]) 
                {
                    tmp = number[i];
                    number[i] = number[j];
                    number[j] = tmp;
                }
            }
        }
    
    for(i=0;i<count;i++)
    {
    	System.out.println(number[i]);
    }
    int max=number[0];
    for(i=0;i<count;i++)
    {
    	max=number[i];
    		if(number[i]>max)
    		{
    			max=number[i];
    		}
    }
    System.out.println("Maximum Element"+" "+max);
    }
    void year()
    {
    	System.out.println("NEW YEAR");
    }
    
}
class overriding extends ArraySort
{
	void year()
	{
		System.out.println("HAPPY NEW YEAR");
	}
}
public class Newyeartask {
    public static void main (String[] args) {
        ArraySort s1=new ArraySort();
        s1.func();
        overriding r=new overriding();
        r.year();
    }
}
