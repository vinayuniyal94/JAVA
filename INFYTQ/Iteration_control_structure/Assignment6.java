import java.lang.Math;
class Tester {
	public static void main(String[] args) {
		// Implement your code here 
		int num=15;
		String strNum = Integer.toString(num);
		int sum=0;
		
		for(int i=1;i<strNum.length();i=i+2){
		    
		    sum += Math.pow(Integer.parseInt(String.valueOf(strNum.charAt(i))),2);
		}
		
		if(sum%9==0){
		    System.out.println("The number "+num+" is a lucky number");
		}else{
		    System.out.println("The number "+num+" is not a lucky number");
		}
	}
}

