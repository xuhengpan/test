package selectsort;

import java.util.Stack;

public class BracketMatch {

	public static void main(String[] args) {
		// TODO �Զ���ɵķ������
String s="{[()]]}";
System.out.print(bracketMatch(s));

	}
public static boolean bracketMatch(String str){
	Stack s=new Stack();
	for(int i=0;i<str.length();i++){
		char c=str.charAt(i);
		switch(c){
		case '{':
		case '[':
		case '(': s.push(Integer.valueOf(c));
		     break;
		case'}':
			if(!s.empty()&& ((Integer) s.pop()).intValue()=='{') break;
			else return false;
		case']':
			if(!s.empty()&& ((Integer) s.pop()).intValue()=='[') break;
			else return false;
		case')':
			if(!s.empty()&& ((Integer) s.pop()).intValue()=='(') break;
			else return false;
		}
	}
	
	 return s.isEmpty();
}
}
