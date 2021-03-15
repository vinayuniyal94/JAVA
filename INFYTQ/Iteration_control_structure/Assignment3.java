class Tester {
	public static void main(String[] args) {
		// Implement your code here 
		int num = 2250;
		int sum=0;
		String n = Integer.toString(num);
		
		for(int i=0;i<n.length();i++){
		    sum+=Integer.parseInt(String.valueOf(n.charAt(i)));
		}
		
		if(num%sum == 0){
		   System.out.println(num+" is divisible by sum of its digits"); 
		}else{
		    System.out.println(num+" is not divisible by sum of its digits");
		}
		   
	
	}
}

