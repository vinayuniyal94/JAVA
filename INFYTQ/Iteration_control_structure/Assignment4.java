class Tester {
	public static void main(String[] args) {
		// Implement your code here 
		int num=123,seedNum=738;
		String strNum = Integer.toString(num);
		int multiplyNum=0;
		
		for(int i=0;i<strNum.length();i++){
		    multiplyNum=num*Integer.parseInt(String.valueOf(strNum.charAt(i)));
		}
		
		if(multiplyNum == seedNum){
		    System.out.println(num+" is a seed of "+seedNum);
		}else{
		    System.out.println(num+" is not a seed of "+seedNum);
		}
	}
}

