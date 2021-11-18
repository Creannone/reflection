package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvotationHandler implements InvocationHandler {

    private Object obj;

    public void bind(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("testtesst");
        return method.invoke(obj,args);
    }
}
