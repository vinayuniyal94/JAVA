class Tester { 
    static int diliveryBill(int d){
        if(d>0 && d<=3){
            return 0;
        }else if(d>3 && d<=6){
            return 3;
        }else{
            return 0+3+(d-6)*2;
        }
        
    }
    
	static int calculateBill(char c, int q, int d){
	    int dilivery_charge = diliveryBill(d); 
	    if(c=='N'){
	        return (15*q)+dilivery_charge;
	    }else{
	        return (12*q)+dilivery_charge;
	    }
	}
	
	public static void main(String[] args) {
		// Implement your code here 
		char food_type = 'V';
		int quantity = 1;
		int distance = 7;
		System.out.println(calculateBill(food_type,quantity,distance));
	}
}
