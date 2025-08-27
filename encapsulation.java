class Demo{
    public int n;
    protected String name;
    private int pin = 123;
    public int getPin(){
        return pin;
    }
    public void setPin(int n){
        pin = n;
    }
}


public class encapsulation {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.n = 10;
        d.name="xyz";
        d.setPin(456);
        System.out.println(d.n);
        System.out.println(d.name);
        System.out.println(d.getPin());
    }
}

