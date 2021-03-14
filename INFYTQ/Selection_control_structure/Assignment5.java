class Tester {
    //printing required output 
    static void print(int account_number,int eligibleLoanAmount,int requestedLoanAmount,int eligibleEmis){
       System.out.println("account_number="+account_number);
       System.out.println("eligibleLoadAmount="+eligibleLoanAmount);
       System.out.println("requestedLoanAmount="+requestedLoanAmount);
       System.out.println("eligibleEmis="+eligibleEmis);
    }
    
	public static void main(String[] args) {
		// Implement your code here 
		int accountNumber=1001;
		int salary = 4000;
		int accountBalance=250000;
		String loanType="Car";
		int loanAmountExpected=300000;
		int emisExpected=30;
		int eligibleLoanAmount=0;
		int eligibleEmis=0;
		String strAccountNumber = Integer.toString(accountNumber); 
		
		//Check for validation first
		if(strAccountNumber.length()==4 && strAccountNumber.charAt(0) == '1' && accountBalance>=10000){
		    //switch case
		    switch(loanType){
		        case "Car": eligibleLoanAmount=500000;
		                    eligibleEmis=36;
		                    break;
		        case "House": eligibleLoanAmount=6000000;
		                      eligibleEmis=60;
		                      break;
		        case "Buisiness":eligibleLoanAmount=7500000;
		                         eligibleEmis=84;
		                         break;
		                 
		    }
		    print(accountNumber,eligibleLoanAmount,loanAmountExpected,eligibleEmis);
		    
		}else{
		    System.out.println("You are not eligble for the load");
		}
		
	}
}


