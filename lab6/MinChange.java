import java.util.*;
public class MinChange{
static int availablerupees[]={1,5,10};
static int n=availablerupees.length;
public static void findMin(int V){
Vector<Integer>ans =new Vector<>();
for(int i=n-1;i>=0;i--)
{
    while(V>=availablerupees[i])
    {
        V-=availablerupees[i];
        ans.add(availablerupees[i]);
    }
}
System.out.print(" "+ans.size());
for(int i=0;i<ans.size();i++)
{
    System.out.print(" "+ans.elementAt(i));
}
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print("Minimal number of coins is "+n+":");
    findMin(n);
}
}