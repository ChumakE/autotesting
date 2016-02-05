package kernel.core.interceptor;

import org.testng.IMethodInstance;
import org.testng.ITestContext;

import java.util.List;


public class Interceptor
{
    public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context)
    {
        int methCount = methods.size();

        for (int i = 0; i < methCount; i++)
        {
            IMethodInstance instns = methods.get(i);
            System.out.println(instns.getMethod().getConstructorOrMethod().getMethod().getAnnotation(org.junit.Test.class));
        }

        return methods;
    }

}