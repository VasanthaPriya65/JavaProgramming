import java.util.Scanner;

public class pg_53StringExpand {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s=sc.next();
String output="";
int output=0;
int n=0;
int temp=0;
for(int i=0;i<=s.lenght;i++){
    
    if(s.chatAt(i)>='a' && s.chatAt(i)<='z'){
        
        output=i;
        n=0;
   if(i<s.length() && Character.isDigit(s.charAt(i+1)))
	           {
	               n=s.charAt(i+1)-'0';
	               System.out.println(s.charAt(i+1));
	               System.out.println(n);
	               i++;
	               if(i<s.length()-1 && Character.isDigit(s.charAt(i+1)))
	               {
	                   n=(n*10)+(s.charAt(i+1)-'0');
	                   i++;
	               }
	               
	               for(int j=0;j<n;j++)
	                   {
	                       temp=s.charAt(output);
	                   }
	           }
	        }
	    }
	    System.out.println(temp);
	   
	}
}

