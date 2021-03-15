class Tester {
	public static void main(String[] args) {
		// Implement your code here 
		int num1=7,num2=9,lcm=0;
		
		lcm=(num1>num2)?num1:num2;
		
		while(true){
		    if(lcm % num1==0 && lcm%num2==0){
		        System.out.println(lcm);
		        break;
		    }
		    ++lcm;
		}
	}
}


