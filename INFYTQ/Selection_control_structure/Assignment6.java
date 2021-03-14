class Tester {
	public static void main(String[] args) {
		// Implement your code here
		int x = 3;
		int y = 3;
		int purchaseAmount=19;
		int oneNotesNeeded=1;
		int fiveNotesNeeded=1;
		int rem=0;
		int quo=0;
		//System.out.println(rem);
		if((purchaseAmount/5)<=y){
		    quo = purchaseAmount/5;
		    rem = purchaseAmount%5;
		    fiveNotesNeeded = quo;
		    oneNotesNeeded = (purchaseAmount-5*quo)<=x?purchaseAmount-5*quo:-1;
		}
		//System.out.println(fiveNotesNeeded);
		//System.out.println(rem);
		
		if(oneNotesNeeded!=-1){
		    System.out.println("$1 notes needed = "+oneNotesNeeded);
		    System.out.println("$5 notes needed = "+fiveNotesNeeded);
		}else{
		    System.out.println(oneNotesNeeded);
		}
		
		
		 
	}
}


