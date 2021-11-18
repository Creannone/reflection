package Proxy;

import staticProxy.ClothFactory;
import staticProxy.NikeFactory;

public class ProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        Human proxyInstance = (Human) ProcyFactory.getProxyIntance(superMan);
        String str = proxyInstance.getBelief();
        System.out.println(str);
        proxyInstance.eat("猛击");

        NikeFactory nikeFactory = new NikeFactory();

        ClothFactory proxyIntance = (ClothFactory) ProcyFactory.getProxyIntance(nikeFactory);
        proxyIntance.productCloth();
    }
}
