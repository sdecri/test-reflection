/**
 * B.java
 */
package test_reflection.elements.sub_elements;

import java.util.function.Function;

import test_reflection.elements.A;

/**
 * @author Simone.DeCristofaro
 * Oct 10, 2020
 */
public class B extends A<String>{

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

        throw new UnsupportedOperationException("Not supported yet.");
        
    }
    
}
