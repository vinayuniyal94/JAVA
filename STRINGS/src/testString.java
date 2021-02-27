class testString{
    public static void main(String[] args){
        char[] ch = {'T','h','i','s',' ','i','s',' ','J','a','v','a'};
        String sr = new String(ch);

        System.out.println(sr);

        for(char c:ch){
            System.out.println(c);
        }
    }
}