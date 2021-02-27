import java.util.*;

class PrintPurmutation{

    public static boolean isPallindrome(String str){
        int i=0,j=str.length()-1;
        while (i<=j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }


    public static void printSubstring(String str){
        for (int i=0;i<str.length();i++){
            System.out.println("Substring starting with character : "+str.charAt(i));
            for (int j=i+1;j<=str.length();j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }

    public static void printPallandromicString(String str){
        int count =1;
        System.out.println("Pallandromic Strings");
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<=str.length();j++) {
                if(isPallindrome(str.substring(i,j)) == true){
                    System.out.println(count+". "+str.substring(i,j));
                    count++;
                }
            }
        }
        count=1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        //printSubstring(str);

        printPallandromicString(str);
    }
}