package project1;

public class Result {
	public static void main(String[] args) {
		int result = Result.perfectSubstring("1102021222", 2);
	}
	
	public static int perfectSubstring(String s, int k) {
		int subsize = k;
		while(subsize < s.length()){
			for(int i = 0; i + subsize-1 < s.length() ;i++){
				String sub = s.substring(i,i+subsize);
				
				int[] data = new int[10];
				for(int t = 0;t<sub.length();t++){
	                data[Integer.parseInt(sub.substring(t, t+1))]++;
	            }
				
				int totalperfectNumber = 0;
				int totalNumbers = 0;
	            for(int t = 0;t < data.length;t++){
	            	if(data[t] > 0)
	            		totalNumbers++;
	                if(data[t] == k){
	                    totalperfectNumber++;
	                }
	            }
	            
	            if(totalperfectNumber == totalNumbers) {
	            	System.out.println("perfect number is"+sub);
	            }
			}
			
			subsize++;
		}
        
        return 0;
        
    }
}
