package Proxy;

import staticProxy.ClothFactory;
import staticProxy.NikeFactory;

public class ProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        Human proxyIntance1 = (Human) ProcyFactory.getProxyIntance(superMan);
        String str = proxyIntance1.getBelief();
        System.out.println(str);
        proxyIntance1.eat("猛击");

        NikeFactory nikeFactory = new NikeFactory();

        ClothFactory proxyIntance2 = (ClothFactory) ProcyFactory.getProxyIntance(nikeFactory);
        proxyIntance2.productCloth();
    }
}
