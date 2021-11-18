package Proxy;

public class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "肘";
    }

    @Override
    public void eat(String food) {
        System.out.println("吃  "+food);
    }
}
