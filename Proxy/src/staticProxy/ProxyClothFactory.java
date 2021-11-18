package staticProxy;

public class ProxyClothFactory implements ClothFactory{
    private ClothFactory factory;

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void productCloth() {
        System.out.println("proxy");

        factory.productCloth();

        System.out.println("结束");
    }
}
