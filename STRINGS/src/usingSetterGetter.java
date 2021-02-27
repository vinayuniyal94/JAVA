class usingSetterGetter{
    private String name ="Vinay";
    public void set(){
        this.name = "Uniyal";
    }
    public String get(){
        return this.name;
    }
    public static void main(String[] args){
        usingSetterGetter us = new usingSetterGetter();
        us.set();
        System.out.println(us.get());
    }
}