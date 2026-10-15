package Basics;
import java.util.*;
public  static void main(String args[]){
Scanner Scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
System.out.println("Enter the 1st Number");
System.out.println("Enter the 2nd Number");
System.out.println("Enter the 3rd Number");
if(a>b && a>c){
System.out.println("Greater Number is: "+a);
}else if(b>a && b>c) {
System.out.println("Greater Number is: "+b");
}else{
System.out.println("Greater Number is: "+c");
}



