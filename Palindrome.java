
public interface Palindrome {
	public void setString(String value);
	public void isPalindrome();
	

}

class PalindromeImpl implements Palindrome{
	private String s;
	public void setString(String value) {
		s=value;
	}
	public void isPalindrome() {
		StringBuilder a=new StringBuilder(s);
		a.reverse();
		
		if(s.equals(a.toString())) {
			System.out.println("«Строка является палиндромом");
		}
		else {
			System.out.println("«Строка не является палиндромом");
		}
	}
}

class Program {

	public static void main(String[] args) {
		
		Palindrome a=new PalindromeImpl() ;
		
		a.setString("asa");
		a.isPalindrome();
		
		a.setString("question");
		a.isPalindrome();
		
		
		
		
		

	}

}
