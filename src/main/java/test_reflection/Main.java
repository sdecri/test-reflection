/**
 * Main.java
 */
package test_reflection;

import java.util.Arrays;
import java.util.Set;

import org.reflections.Reflections;

import test_reflection.elements.I;

/**
 * @author Simone.DeCristofaro
 * Oct 10, 2020
 */
public class Main {

    
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {

        String packageName = "test_reflection.elements";
        Set<Class<? extends I>> classes = new Reflections(packageName).getSubTypesOf(I.class);
        
        String[] classNames = classes.stream().map(Object::toString).toArray(size -> new String[size]);
        System.out.println(Arrays.toString(classNames));
        
    }
    
}
