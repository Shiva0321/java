import java.util.Scanner;
class Squence2
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i=1,n=1;
System.out.print(" "+i);
while(i<=10)
{
i=i+n;
n=i;
System.out.print(" "+i);
}


}
}
