package selectSort;

import java.util.Stack;

public class baseConversion {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
int i=2007;
baseConversion(i);
	}
public static void baseConversion(int i){
	Stack s=new Stack();
	while(i>0){
		s.push(i%8+"");
		i=i/8;
	}
	while(!s.isEmpty()) System.out.print((String)s.pop());
}
}
