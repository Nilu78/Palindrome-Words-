class Main {
  public static void main(String[] args) {
   // Run unit tests to test your method

  System.out.println(isPalindrome("civic")); //-> true"
  System.out.println(isPalindrome("Racecar"));// -> true)
  System.out.println(isPalindrome("somestring")); //-> false)
  System.out.println(isPalindrome("java")); //-> false) 
  System.out.println(isPalindrome("TENet")); //-> true)
  System.out.println(isPalindrome("t")); //-> true)
  System.out.println(isPalindrome("sS")); //-> true)
}
  //Don't change the method header
  
  public static boolean isPalindrome(String str){
   // Run unit tests to test your method
    String str2 = str.toLowerCase();
    for (int i = 0; i < str2.length()/2; i++) {
      if (str2.charAt(i)!= str2.charAt(str2.length()-1-i)) {
        return false;
      }
    }
      return true;
    }
 
 

}  

    

