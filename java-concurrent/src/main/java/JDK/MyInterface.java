package JDK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface MyInterface {

    void testMethod();
}

//class MyClass implements MyInterface{
//
//    @Override
//    public void testMethod() {
//        System.out.println("重写");
//    }
//}

class Demo{
    public static void main(String[] args) {
//         MyInterface myInterface = ()->{
//             System.out.println("lambda表达式重写");
//         };
//         myInterface.testMethod();

        Arrays.asList("张三","李四");
    }
}
