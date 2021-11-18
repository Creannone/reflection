package staticProxy;

public class StaticProxy {
    public static void main(String[] args) {
        ClothFactory nikeFactory = new NikeFactory();
        ClothFactory proxyClothFactory = new ProxyClothFactory(nikeFactory);

        proxyClothFactory.productCloth();
    }
}
