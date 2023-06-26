package Day2;

public class Method_Overloading 
{
     public static void sum(int a, int b)
     {
    	 int c = a+b;
    	 System.out.println("sum is "+ c);
     }
     public static void sum(float a, float b)
     {
    	 float c = a+b;
    	 System.out.println("Sum is "+c);
     }
     
     public static void mul(int x, int y, int z)
     {
    	 int r = x*y*z;
    	 System.out.println("Result is "+ r);
     }
     public static void get(String name, int id)
     {
    	 System.out.println("Company Name :" +name);
    	 System.out.println("Company id :"+ id);
     }
     
     public static void main(String[] args)
     {
    	sum(4,8);
    	sum(3.7f,6.3f);
    	mul(5,7,3);
    	get("Prakash", 18);
		
	}
}
