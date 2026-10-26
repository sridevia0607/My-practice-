import java.util.*;
public class small{
public static void main(String []args){
{
int mark[]={7,8,15,17,91,15};
int small =mark[0];
for(int i=1;i<mark.length;i++)
{
if(mark[i]<small)
{
small=mark[i];
}
}
System.out.println("smallest number is "+small);
}
}
}