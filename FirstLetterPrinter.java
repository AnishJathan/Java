import java.util.Scanner;
class FirstLetterPrinter {
public static void main (String[] args) {
 Scanner in = new Scanner(System.in);
 String input = in.nextLine();
System.out.println(firstLetterPrinter(input));
}
static String firstLetterPrinter (String str) {
 // write your code here
    String result ="";
    boolean v = true ;
    for (int i =0 ; i<str.length() ; i++ ){
        if(str.charAt(i)==' '){
            v = true ;
        }
        else if (str.charAt(i)!=' '&& v==true){
            result +=(str.charAt(i));  
            v = false ; 
        }
    } 
    return result;   
 }
}