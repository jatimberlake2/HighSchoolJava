

public class more14 {
	public String endUp(String str) {
	  if (str.length() == 0) return str;
	  if (str.length() == 1) return ""+str.toUpperCase().charAt(0);
	  if (str.length() == 2) return ""+str.toUpperCase().charAt(0)
	                                  +str.toUpperCase().charAt(1);
	  return str.substring(0, str.length() -3)+
	         (""+str.charAt(str.length() -3)).toUpperCase()+
	         (""+str.charAt(str.length() -2)).toUpperCase()+
	         (""+str.charAt(str.length() -1)).toUpperCase();
	}

	public boolean more14(int[] nums) {
	  int ones = 0;
	  int fours = 0;
	  for (int i = 0; i < nums.length; i++) {
	  if (nums[i]==1) ones++;
	  if (nums[i]==4) fours++;
	  }
	  return (ones > fours);
	}
	
	
}