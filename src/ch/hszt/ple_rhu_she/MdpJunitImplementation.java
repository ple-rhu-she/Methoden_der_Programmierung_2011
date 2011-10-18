package ch.hszt.ple_rhu_she;

public class MdpJunitImplementation implements IMdpJunitDemo {

	@Override
	public boolean isEmpty(String s) {
		
		if (s == null || s.length() == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String capitalize(String s) {
		char firstChar = Character.toUpperCase(s.charAt(0));
		String returnString = Character.toString(firstChar);
		
		for (int i = 1; i < s.length(); i++) {
			returnString = returnString.concat(Character.toString(s.charAt(i)));
		}
		
		return returnString;
	}

	@Override
	public String reverse(String s) throws NullPointerException {
		String returnString = "";
		
		for (int i = s.length()-1; i >= 0; i--) {
			char nextChar = s.charAt(i);
			returnString = returnString.concat(Character.toString(nextChar));
		}
		
		return returnString;
	}

	@Override
	public String join(String... strings) {
		String returnString = "";
		
		for (int i = 0; i < strings.length; i++) {
			returnString = returnString.concat(strings[i]);
			if (i != strings.length - 1) {
				returnString = returnString.concat(" ");
			}
		}
		return returnString;
	}
	
	public static void main(String[] args) {
		String[] string = new String[3];
		string[0] = "Steve";
		string[1] = "Delia";
		string[2] = "Böckten";
//		System.out.println(string.length());
		System.out.println(new MdpJunitImplementation().join(string));
	}

}
