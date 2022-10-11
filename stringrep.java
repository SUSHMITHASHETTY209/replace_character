import java.util.*;
public class stringrep{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		System.out.println("original string:"+str);
		int l=str.length();
		Character ch;
 //str=str.toUpperCase();
 String str2;
		String oldchar;
		String newchar="-";
		int acount=0;
		int ecount=0;
		int icount=0;
		int ocount=0;
		int ucount=0;
		for(int i=0;i<l;i++){
				ch=str.charAt(i);
		if(ch.equals('A') || ch.equals('a')){
			
			acount=acount+1;
			if(acount==1){
			str=str.replaceFirst("A",newchar);
			str=str.replaceFirst("a",newchar);
			}
		}
		if(ch.equals('E') || ch.equals('e')){
			ecount++;
			if(ecount==1){
			str=str.replaceFirst("E",newchar);
			str=str.replaceFirst("e",newchar);
			}
		}
		if(ch.equals('I') || ch.equals('i')){
			icount++;
			if(icount==1){
			str.replaceFirst("I",newchar);
			str=str.replaceFirst("i",newchar);
			}
		}
		if(ch.equals('O')|| ch.equals('o')){
			ocount++;
			if(ocount==1){
			str.replaceFirst("O",newchar);
			str=str.replaceFirst("o",newchar);
			}
		}
		if(ch.equals('U') ||ch.equals('u')){
			ucount++;
			if(ucount==1){
			str.replaceFirst("U",newchar);
			str=str.replaceFirst("u",newchar);
			}
		}
		
		
		}
		System.out.println("String after replacement:"+str);
	}
}