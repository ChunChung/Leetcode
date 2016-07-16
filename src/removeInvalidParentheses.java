import java.util.ArrayList;
import java.util.List;

public class removeInvalidParentheses {
    public static List<String> solution(String A) {       
    	List<String> ans = new ArrayList<>();
    	removeP(A,ans,0,0, new char[]{'(',')'});
    	return ans;
    }    
    
    static void  removeP(String A, List<String> ans,int last_i,int last_j,char[] par) {
	    int stack=0;
	    int i,j;
	    for(i=last_i;i<A.length();i++) {
	    	if(A.charAt(i) == par[0]) {
	    		stack ++;
	    	}
	    	else if(A.charAt(i) == par[1]) {
	    		stack --;
	    	}
	    	if(stack <0)
	    		break;
	    }
	    if(stack < 0) {
	    	for(j=last_j;j<i;j++) {
	    		if(A.charAt(j) == par[1] && (j==last_j || A.charAt(j-1)!=par[1])) {
	    			String candidate = A.substring(0,j) + A.substring(j+1, A.length());
	    			removeP(candidate, ans,i,j, par);
	    		}
	    	}
	    	return;
	    }
	    String reversed = new StringBuilder(A).reverse().toString();
	    if(par[0]=='(') 
	    	removeP(reversed, ans,0,0,new char[]{')','('});
	    else 
	    	ans.add(reversed);
    	
    }

    static public void main(String argv[])
	{

    	String q = "()())()";
    	System.out.println(solution(q));
	}  
}


