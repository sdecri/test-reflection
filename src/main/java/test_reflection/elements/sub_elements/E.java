/**
 * C.java
 */
package test_reflection.elements.sub_elements;

import java.util.function.Function;

import test_reflection.elements.A;

/**
 * @author Simone.DeCristofaro
 * Oct 10, 2020
 */
public abstract class E extends A<String>{

    public abstract String getAvailableValues();
    
    /**
    * {@inheritDoc}
    */
    @Override
    public Class<?> getOptionType() {

        throw new UnsupportedOperationException("Not supported yet.");
        
    }

    /**
    * {@inheritDoc}
    */
    @Override
    public String getDescription() {

        throw new UnsupportedOperationException("Not supported yet.");
        
    }

    /**
    * {@inheritDoc}
    */
    @Override
    public String getLongOpt() {

        throw new UnsupportedOperationException("Not supported yet.");
        
    }

    /**
    * {@inheritDoc}
    */
    @Override
    public Function<String[], String> getParsingFunction() {

        return new Function<String[], String>() {

            @Override
            public String apply(String[] t) {

                return t[0];
                
            }};
    }
    
}
