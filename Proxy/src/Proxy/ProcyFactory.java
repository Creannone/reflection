package Proxy;

import java.lang.reflect.Proxy;

public class ProcyFactory {
    public static Object getProxyIntance(Object obj){

        MyInvotationHandler myInvotationHandler = new MyInvotationHandler();
        myInvotationHandler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), myInvotationHandler);
    }
}
