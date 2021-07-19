package com.dawg.hiddenclass;

import org.objectweb.asm.ClassWriter;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;

import static java.lang.invoke.MethodHandles.Lookup.ClassOption.NESTMATE;

public class HiddenClassDemo {
    public static void main(String[] args) throws Throwable {

        // Step 1: Create lookup object.
        MethodHandles.Lookup lookup = MethodHandles.lookup();

        //Step 2: Get ClassWriter objects and then covert that into byte array.
        ClassWriter cw = GenerateClass.getClassWriter(HiddenClassDemo.class);
        byte[] bytes = cw.toByteArray();

        //Sep 3: Define hidden class.
        Class<?> c = lookup.defineHiddenClass(bytes, true, NESTMATE).lookupClass();

        //Step 4: Creating constructor then Object of type Test and calling a simple function test.
        Constructor<?> constructor = c.getConstructor(null);
        Object object = constructor.newInstance(null);
        Test test = (Test) object;
        test.test(new String[]{"sample"});

        System.out.println(Class.forName("com.dawg.hiddenclass.Test"));
        System.out.println(Class.forName("com/dawg/java15/hiddenclass/HiddenClassDemo"));
        System.out.println("End of main method in class " + HiddenClassDemo.class.getName());
    }
}
