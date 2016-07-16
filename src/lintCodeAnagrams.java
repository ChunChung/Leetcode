import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class lintCodeAnagrams {
    static public List<String> anagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(String s: strs){
            char [] strArry = s.toCharArray();
            Arrays.sort(strArry);
            String sortStr = Arrays.toString(strArry);
            if(map.containsKey(sortStr)) {
                map.get(sortStr).add(s);
            }
            else {
                List<String> strList = new ArrayList();
                strList.add(s);
                map.put(sortStr,strList);
            }
        }
        
        for(List<String> ans: map.values()) {
            if(ans.size()>1)
                return ans;
        }
        return null;
    }
    

    
    static public void main(String argv[]) {
    	System.out.println(anagrams(new String[] {"",""}));
    }
}