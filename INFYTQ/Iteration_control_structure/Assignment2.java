class Tester {
	
	static int countRabbit(int heads, int legs){
	    int count=0;
	    count=((legs)-2*(heads))/2;
	    return count;
	}
	
	public static void main(String[] args) {
		// Implement your code here 
		int heads=150,legs=500;
		
		int rabbits = countRabbit(heads,legs);
		
		System.out.println("Rabbits="+rabbits);
		System.out.println("Chickens="+(heads-rabbits));
		
	}
}
