public class operator{
public static void main(String args[]){
int a=4567;
int b,sum=0;
b=a%10;
sum=b;
a=a/10;
b=a%10;
sum=sum+b;
a=a/10;
b=a%10;
sum=sum+b;
a=a/10;
b=a;
sum=sum+b;
System.out.println(sum);
}
}