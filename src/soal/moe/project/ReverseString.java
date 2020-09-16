package soal.moe.project;

public class ReverseString {

//public static String[] reversePrint(String[] arrString, String start, int end) {
//	if (start < end) {
//        String temp = arrString[start];
//        arrString[start] = arrChar[end];
//        arrChar[end] = temp;
//        reversePrint(arrChar, start + 1, end - 1);
//    }
//	
//    return arrChar;
//}

public static String reverseString(String myStr) {
	if (myStr.isEmpty()){
	 return myStr;
	}
	
	return reverseString(myStr.substring(1)) + myStr.charAt(0);
}

	public static void main (String[] args) {
		ReverseString reverse = new ReverseString(); 
		String s = "hello";
		s = reverse.reverseString(s);
		
		int len = s.length();
		Character[] array = new Character[len];
		for (int i = 0; i < len ; i++) {
			array[i] = s.charAt(i);
		}
		 
	    System.out.println("Reversed String : " + array);
	}
}
