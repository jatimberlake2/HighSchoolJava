
public class JavaBat_Methods {
	 
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		  if (aSmile && bSmile) return true;
		  if (!aSmile && !bSmile) return true;
		  return false;
		}
	public boolean posNeg(int a, int b, boolean negative) {
		  if (negative && a < 0 && b < 0) return true;
		  if (!negative && a >= 0 && b < 0) return true;
		  if (!negative && a < 0 && b >= 0) return true;
		  return false;
		}
	public boolean parrotTrouble(boolean talking, int hour) {
		  if (talking && hour < 7) return true;
		  if (talking && hour > 20) return true;
		  return false;
		}
	public static boolean hasTeen(int a, int b, int c) {
		  if ( a >= 13 && a <= 19 ) return true;
		  if ( b >= 13 && b <= 19 ) return true;
		  if ( c >= 13 && c <= 19 ) return true;
		  return false;
		}
	public String startOz(String str) {
		  if (str.length() ==0) return str;
		  if (str.length() ==1 && str.charAt(0) == 'o') return "o";
		  if (str.length() ==1 && str.charAt(0) != 'o') return "";
		  String str2 = "";
		  if (str.charAt(0) == 'o') str2 = str2 + 'o';
		  if (str.charAt(1) == 'z') str2 = str2 + 'z'; 
		  return str2;
	}
	public String delDel(String str) {
		  if (str.length() < 4) return str;
		  if ("del".equals(str.substring(1,4))) return ("" + str.charAt(0) + str.substring(4, str.length()));
		  return str;
		}
	public int max1020(int a, int b) {
		  if (10 <= a && a <= 20 && 10 <= b && b <= 20) return Math.max(a,b);
		  if (10 <= a && a <= 20 && !(10 <= b && b <= 20)) return a;
		  if (!(10 <= a && a <= 20) && 10 <= b && b <= 20) return b;
		  return 0;
		}
	public boolean mixStart(String str) {
		  if (str.length() < 3) return false;
		  if (str.substring(1,3).equals("ix")) return true;
		  return false;
		}
	public boolean in1020(int a, int b) {
		return (10 <= a && a <= 20) || (10 <= b && b <= 20);
	}
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
	public String front3(String str) {
		  if (str.length() < 3) return str+str+str;
		  return str.substring(0,3)+str.substring(0,3)+str.substring(0,3);
		}
	public boolean startHi(String str) {
		  if (str.length() < 2) return false;
		  return "hi".equals(str.substring(0,2));
		}
	public boolean in3050(int a, int b) {
		  return ((30 <= a && a <= 40) && (30 <= b && b <= 40)) || ((40 <= a && a <= 50) && (40 <= b && b <= 50));
		}
	public String startWord(String str, String word) {
		  if (str.length() < word.length()) return "";
		  if ((str.substring(1,word.length())).equals(word.substring(1,word.length())))
		     return str.substring(0,word.length());
		  return "";
		}
	public int arrayCount9(int[] nums) {
			  int number = 0;
			  for (int i = 0; i < nums.length; i++)
			    if (nums[i] == 9) number++;
			   return number;
			}
	public int noTeenSum(int a, int b, int c) {
		  return (fixTeen(a) + fixTeen(b) + fixTeen(c));
		}
		public int fixTeen(int n) {
		if ( n == 15 || n == 16) return n;
		if ( n < 13 || n > 19) return n;
		return 0; 
		}
		public int makeChocolate(int small, int big, int goal) {
		 if (big*5 > goal) big = goal/5;
		 if (big*5 + small >= goal) return (goal - big*5);
		 return -1;
		}
		public String firstHalf(String str) {
		  return str.substring(0, str.length()/2);
		}
		
}
