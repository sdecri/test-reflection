/**
 * I.java
 */
package test_reflection.elements;

import java.util.function.Function;

import org.apache.commons.cli.Option;

/**
 * @author Simone.DeCristofaro
 * Oct 10, 2020
 * @param <T> 
 */
public interface I<T> {


    public boolean hasArg();

    public Class<?> getOptionType();

    public Option createOption();
    
    public String getDescription();

    public String getLongOpt();
    
    public Function<String[], T> getParsingFunction();
    
    public T getDefaultValue();
 
    public boolean isValid(T value);
}
