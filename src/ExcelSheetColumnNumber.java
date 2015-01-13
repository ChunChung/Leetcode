public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
    	char[] charArray = s.toUpperCase().toCharArray();
    	char charA = 'A';
    	int arrayLength = charArray.length;
    	int result = 0;
    	for(int i=0;i<arrayLength;i++) {
    		result = result + ((int)charArray[i]- (int)charA + 1) * (int)Math.pow(26, arrayLength-i-1);		
    	}
    	return result;
    }
    

    
    static public void main(String argv[]) {
    	String testString[] = {"A","B","C","AA","AAAAA"};
    	ExcelSheetColumnNumber test = new ExcelSheetColumnNumber();
    	for(String item:testString) {
    		System.out.println(test.titleToNumber(item));
    	}
    	
    }
}