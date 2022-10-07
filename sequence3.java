import java.util.Scanner;
class Squence3
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i=0,n=1,c;
System.out.print(i+" "+n);
while(i<=10)
{
c=n+i;
i=n;
n=c;
System.out.print(" "+c);
}



}
}
