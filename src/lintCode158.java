public class lintCode158 {
    public static boolean isAnagram(String s, String t) {
        // write your code here
        if(s.length() != t.length()) {return false;}
        
        s = s.toLowerCase();
        t = t.toLowerCase();
        
        long ans=0;
        int i=0;
        for(int l=s.length();i<l;++i) {
        	System.out.println(i);
        	break;
        	//System.out.println(s.charAt(i)-'a');
        	//System.out.println(t.charAt(i)-'a');

            //ans = ans ^ (s.charAt(i)-'a');
            //ans = ans ^ (t.charAt(i)-'a');

        }
    	System.out.println(i);
        
        if(ans == 0) 
            return true;
        else
            return false;
    }
    

    
    static public void main(String argv[]) {
    	System.out.println(isAnagram("az", "by"));
    	System.out.println(0^1^2^26^25);
    }
}