import java.util.*;

class Perimeter
{

 Perimeter(int l,int b)
 {
  int per=2*(l+b);
  System.out.println("Perimeter is:"+per);
 }
 Perimeter(int r)
 {
  float per=(float)(3.14*2*r);
  System.out.println("Perimeter is:"+per);
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int r,l,b,ch;
  System.out.println("Enter the radius:");
  r=sc.nextInt();
  Perimeter p=new Perimeter(r);
  System.out.println("Enter the length:");
  l=sc.nextInt();
  System.out.println("Enter the breadth:");
  b=sc.nextInt();
  p=new Perimeter(l,b);
  }
}
 
