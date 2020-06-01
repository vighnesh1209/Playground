import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = 0;
    for(int i=1;i<=n;i++)
    {
       String str1 = Integer.toString(i);
      System.out.print(str1);
      m=m+1;
      if(m%3==0)
        System.out.print(',');
    }
      
  }
}