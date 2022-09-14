class perfectnumber
{
 
   static boolean checkPerfect(int n)
{
   int sum=0;

   for (int i=1; i<n; i++)
{   
     if(n % i == 0)
     {
     sum = sum + i;
     }
}

   if (n==sum) return true; return false;
}

   public static void main(String args[])
{

   int count = 0;

   java.util.Scanner sc = new
   java.util.Scanner(System.in);
  
   System.out.println("Enter two Numbers : ");

   int lowerlimit = sc.nextInt();
   int upperlimit = sc.nextInt();

   for(int i = lowerlimit; i<upperlimit; i++)
{
       if (checkPerfect(i) == true)
       {
       count = count + 1;
       }
}
System.out.println( "total count of perfect numbers between" + lowerlimit + "and" + upperlimit + " is : " +count);

}
}


