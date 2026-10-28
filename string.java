import java.util.Arrays;
public class string{
public static void main(String []args){
String v="listen";
String m="silent";
char[] a = v.toCharArray();
char[] b = m.toCharArray();
Arrays.sort(a);
Arrays.sort(b);
if(Arrays.equals(a,b)){
System.out.println("true");
}
else{
System.out.println("false");
}}}
