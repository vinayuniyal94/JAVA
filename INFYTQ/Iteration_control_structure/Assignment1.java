class Tester {
	public static void main(String[] args) {
		// Implement your code here 
		int num=46763;
		int reverseNum=0;
		int rem=0;
		int originalNum=num;
		
		while(num!=0){
		    rem=num%10;
		    reverseNum = reverseNum*10+rem;
		    num=num/10;
		}
		
		if(originalNum==reverseNum){
		    System.out.println(originalNum+" is a palindrome");
		}else{
		    System.out.println(originalNum+" is not a palindrome");
		}
		
	}
}


