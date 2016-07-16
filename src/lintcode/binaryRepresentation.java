package lintcode;
public class binaryRepresentation {
    public String binaryRepresentation(String n) {
        // write your code here
        int decPart = Integer.parseInt(n.substring(0, n.indexOf('.')));
        double fracPart = Double.parseDouble(n.substring(n.indexOf('.')));
        
        String decString = "";
        String fracString = "";
        
        
        
        if(decPart == 0) decString = "0";
        
        while(decPart>0) {
        	decString = Integer.toString(decPart%2) + decString;
        	decPart = decPart/2;
        }
        
        while(fracPart > 0.0) {
        	if(fracString.length()>32) return "ERROR";
        	double r = fracPart * 2;
        	if(r>=1.0) {
        		fracString += '1';
        		fracPart = r - 1.0;
        	}
        	else {
        		fracString += '0';
        		fracPart = r;
        	}
        }
        
        return fracString.length()>0?decString+"."+fracString:decString;
    }
}
